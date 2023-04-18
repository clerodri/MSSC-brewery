package com.clerodri.MSSCbrewery.web.services;

import com.clerodri.MSSCbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beedId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Antuan")
                .beerStyle("Enano")
                .build();
    }
}
