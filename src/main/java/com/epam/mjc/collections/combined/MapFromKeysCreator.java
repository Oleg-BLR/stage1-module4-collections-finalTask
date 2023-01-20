package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new LinkedHashMap<>();
        sourceMap.put("one", 1);
        sourceMap.put("two", 2);
        sourceMap.put("three", 3);
        sourceMap.put("five", 4);
        sourceMap.put("ten", 10);
        MapFromKeysCreator mapFromKeysCreator = new MapFromKeysCreator();
        mapFromKeysCreator.createMap(sourceMap);
    }

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Set<Integer> sourceMapKeys = new TreeSet<>();
        sourceMap.forEach((k, v) -> {
            sourceMapKeys.add(k.length());
        });
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        sourceMapKeys.forEach(e -> {
            Set<String> setStringElement = new LinkedHashSet<>();
            sourceMap.forEach((k, v) -> {
                if (k.length() == e) {
                    setStringElement.add(k);
                }
            });
            resultMap.put(e, setStringElement);
        });
        System.out.println(sourceMap);
        System.out.println(sourceMapKeys);
        System.out.println(resultMap);
        return resultMap;
    }
}
