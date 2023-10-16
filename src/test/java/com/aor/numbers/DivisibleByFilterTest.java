package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    public void filterByDiv(){
        int num1=7;
        int num2=21;
        GenericListFilter myfilter= new DivisibleByFilter(num1);
        boolean result= myfilter.accept(num2);
        Assertions.assertEquals(true, result);

    }
}
