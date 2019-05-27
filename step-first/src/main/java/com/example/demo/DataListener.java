package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/update")
public class DataListener {

    private final PagingCafeService<Coffee> coffeePagingCafeService;
    private final PagingCafeService<Order> orderPagingCafeService;

    public DataListener(PagingCafeService<Coffee> coffeePagingCafeService, PagingCafeService<Order> orderPagingCafeService) {
        this.coffeePagingCafeService = coffeePagingCafeService;
        this.orderPagingCafeService = orderPagingCafeService;
    }

    //TODO:POST Mappring
    @GetMapping("/coffee")
    public void udpateCoffee(){
        coffeePagingCafeService.update(null);
    }

    //TODO:POST Mappring
    @GetMapping("/order")
    public void udpateOrder(){
        orderPagingCafeService.update(null);
    }


}
