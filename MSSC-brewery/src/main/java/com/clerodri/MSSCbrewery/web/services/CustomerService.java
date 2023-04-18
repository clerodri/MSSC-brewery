package com.clerodri.MSSCbrewery.web.services;

import com.clerodri.MSSCbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Repository;

import java.util.UUID;
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
