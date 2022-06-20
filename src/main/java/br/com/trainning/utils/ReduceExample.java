package br.com.trainning.utils;


import java.math.BigDecimal;
import java.util.List;

public class ReduceExample {
    public static final Integer sumFromListInt(List<Integer> items) {
        return items.stream().reduce(0, Integer::sum);
    }

    public static final Long sumFromListLong(List<Long> items) {
        return items.stream().reduce(0L, Long::sum);
    }

    public static final String concatFromListString(List<String> items) {
        return items.stream().reduce("", (partialString, item) ->  partialString + item);
    }

    public static final BigDecimal sumFromListBigDecimal(List<BigDecimal> items) {
        return items.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
