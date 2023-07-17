package com.legalease.firmranking.service;

import com.legalease.firmranking.dao.FirmDao;
import com.legalease.firmranking.dto.FirmRanking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirmService {

    @Autowired
    public FirmService(FirmDao firmDao) {
        this.firmDao = firmDao;
    }

    @Autowired
    FirmDao firmDao;

    public FirmRanking[] getFirmRanking(Integer regionId) {
        return  firmDao.getFirmRankings(regionId).toArray(new FirmRanking[0]);
    }
}
