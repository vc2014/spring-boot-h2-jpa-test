package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.SampleData;
import com.example.repo.SampleDataRepo;

@Service
public class SampleDataService {

    @Autowired 
    SampleDataRepo repo;

    public SampleData saveSampleData() {
        SampleData sd = new SampleData();
        sd.setSample("longtest");

        repo.save(sd);
        return sd;
    }
}
