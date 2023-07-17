package com.legalease.firmranking.dao;

import com.legalease.firmranking.dto.Firm;
import com.legalease.firmranking.dto.FirmRanking;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public interface FirmDao {

public List<FirmRanking> getFirmRankings(Integer regionId);
}
