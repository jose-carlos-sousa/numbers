package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PositiveFilterTest {
    @Test
    public void filterPOS(){

        int num=1;
        GenericListFilter myfilter= new PositiveFilter();
        boolean result= myfilter.accept(num);
        Assertions.assertEquals(true, result);

    }
}
