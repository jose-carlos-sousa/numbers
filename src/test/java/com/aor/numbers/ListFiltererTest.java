package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void filter(){
        List<Integer> TestList= Arrays.asList(1,2,-5,-7);
        List<Integer> expected = Arrays.asList(1, 2);
        ListFilterer myFilterer= new ListFilterer(new PositiveFilter());
        List<Integer> result=myFilterer.filter(TestList);
        Assertions.assertEquals(expected, result);

    }
}
