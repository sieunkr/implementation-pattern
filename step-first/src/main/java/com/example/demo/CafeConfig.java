package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CafeConfig {

    @Bean
    public PagingCafeService<Coffee> coffeePagingCafeService(){
        return new PagingCafeService<>(10);
    }

    @Bean
    public PagingCafeService<Order> orderPagingCafeService(){
        return new PagingCafeService<>(100);
    }



}
