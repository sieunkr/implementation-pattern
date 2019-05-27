package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeService {

    private final PagingCafeService<Coffee> coffeePagingCafeService;

    public CafeService(PagingCafeService<Coffee> coffeePagingCafeService) {
        this.coffeePagingCafeService = coffeePagingCafeService;
    }

    public List<Coffee> getCoffee(){
        return coffeePagingCafeService.getItem(0,0);
    }

}
