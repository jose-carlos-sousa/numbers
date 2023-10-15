package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private int num;
    DivisibleByFilter(int number){
        num=number;
    }
    public boolean accept(Integer number){
        if(number%num==0){
            return true;
        }else{
            return false;
        }
    }
}
