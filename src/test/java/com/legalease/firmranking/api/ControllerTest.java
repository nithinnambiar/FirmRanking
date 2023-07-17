package com.legalease.firmranking.api;

import com.legalease.firmranking.dao.FirmDao;
import com.legalease.firmranking.dto.FirmRanking;
import com.legalease.firmranking.service.FirmService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = Controller.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FirmDao firmDao;

    @MockBean
    private FirmService firmService;


    @Test
    public void testBadRequestWhenRegionIdIsInvalid() throws Exception{

        when(firmDao.getFirmRankings(anyInt())).thenReturn(new ArrayList<FirmRanking>());
        mockMvc.perform(get("/firmranking?regionId=100")
                        .header("token", "123445")
                        .contentType("application/json"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testSuccessWhenRegionIdIsValid() throws Exception{

        when(firmDao.getFirmRankings(anyInt())).thenReturn(new ArrayList<FirmRanking>());
        mockMvc.perform(get("/firmranking?regionId=170")
                        .header("token", "123445")
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }
}
