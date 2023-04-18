package com.clerodri.MSSCbrewery.web.services;

import com.clerodri.MSSCbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerName("Rodrigo")
                .customerId(UUID.randomUUID())
                .build();
    }
}
