package com.legalease.firmranking.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.legalease.firmranking.dto.Firm;
import com.legalease.firmranking.dto.FirmRanking;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class FirmDaoImpl implements FirmDao{

    public FirmDaoImpl() {
    }

    List<FirmRanking> firmRankingsCache = new ArrayList<>();

    private void init() {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            firmRankingsCache.addAll(objectMapper.readValue(new File("src/main/resources/legalease-code-test-api.json"), new TypeReference<List<FirmRanking>>() {
            }));
        }
        catch(Exception ex) {
            //TODO - LOG the error
        }

    }

    @Override
    public List<FirmRanking> getFirmRankings(Integer regionId) {

        //TODO - to lookup the firm rankings based on the regionId
        if(firmRankingsCache.size() == 0)
            init();

        return firmRankingsCache;
    }
}
