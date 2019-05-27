package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PagingCafeService<T extends Item> {

    private List<T> itemList;

    public PagingCafeService(int max){
        this.itemList = new ArrayList<>();
    }

    List<T> getItem(int offset, int limit){
        return itemList.subList(offset, limit);
    }

    public synchronized void update(List<T> itemList){
        this.itemList = itemList;
    }

}
