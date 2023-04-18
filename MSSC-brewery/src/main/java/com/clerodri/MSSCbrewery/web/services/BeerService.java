package com.clerodri.MSSCbrewery.web.services;

import com.clerodri.MSSCbrewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {
    BeerDto getBeerById(UUID beedId);

}
