package br.com.trainning.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
     public static final List<String> sort(List<String> items) {
         return items.stream().sorted().collect(Collectors.toList());
     }

    public static final List<String> reverse(List<String> items) {
         Collections.sort(items, Comparator.reverseOrder());
        return items;
    }
}
