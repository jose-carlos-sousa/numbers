package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;


public class ListAggregatorTest {
    public List<Integer> giveList(){
        return Arrays.asList(1,2,4,2,5);
    }
    @Test
    public void sum() {
        List<Integer> list = giveList();

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator( new ListSorter()));
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list = giveList();

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator( new ListSorter()));
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        List<Integer> list = giveList();

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator( new ListSorter()));
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }
    @Test
    public void max_bug_7263 () {
        List<Integer> list = Arrays.asList(-1,-4,-5);

        ListAggregator aggregator = new ListAggregator( new ListDeduplicator( new ListSorter()));
        int max = aggregator.max(list);

        Assertions.assertEquals(-1, max);
    }


    @Test
    public void distinct() {
        List<Integer> list = giveList();


        ListAggregator aggregator = new ListAggregator( new ListDeduplicator( new ListSorter()));
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
    @Test
    public void distinct_bug_8726(){
        List<Integer> list=Arrays.asList(1,2,4,2);
        GenericListDeduplicator deduplicator =
                Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));

        ListAggregator aggregator = new ListAggregator(deduplicator);
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(3, distinct);
    }

}
