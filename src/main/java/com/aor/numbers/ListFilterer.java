package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private final GenericListFilter filter;

    public List<Integer> filter(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        for( int a : list){
            if(filter.accept(a)){
                result.add(a);
            }

        }
        return result;
    }
    public ListFilterer(GenericListFilter filter) {
        this.filter=filter;
    }
}
