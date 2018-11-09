package com.example.repo;

import org.springframework.data.repository.PagingAndSortingRepository;


import com.example.entity.SampleData;

public interface SampleDataRepo extends PagingAndSortingRepository<SampleData, Integer> {

}
