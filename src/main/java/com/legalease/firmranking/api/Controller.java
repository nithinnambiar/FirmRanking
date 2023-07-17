package com.legalease.firmranking.api;

import com.legalease.firmranking.service.FirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    FirmService firmService;
@GetMapping(value ="/firmranking",
        consumes = { MediaType.APPLICATION_JSON_VALUE })

    public @ResponseBody ResponseEntity<?> getFirms(@RequestParam("regionId") Integer regionId, @RequestHeader("token") String tokenId) {

    //TODO - Token should be part of the authorization header and handled by the Spring Authorization filters
    //TODO - move the regionId to application.properties to make it configurable
    if(regionId != 170) {
        return new ResponseEntity<>(
                "Invalid RegionId " + regionId,
                HttpStatus.BAD_REQUEST);
    }


    return ResponseEntity.ok(firmService.getFirmRanking(regionId));
    }
}
