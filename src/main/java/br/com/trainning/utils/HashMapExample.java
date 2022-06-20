package br.com.trainning.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static final Map<Integer, String> items() {
        final Map<Integer, String> itemsMap = new HashMap();
        itemsMap.put(1, "Space");
        itemsMap.put(2, "March");
        itemsMap.put(3, "Earth");
        itemsMap.put(4, "Co2");
        itemsMap.put(5, "Planet");
        itemsMap.put(6, "Zoom");
        itemsMap.put(7, "Astronomy");
        itemsMap.put(8, "Burn");
        return itemsMap;
    }

    public static final Map<Integer, String> sort(Map<Integer, String> items) {
        return items.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new
        ));
    }
}
