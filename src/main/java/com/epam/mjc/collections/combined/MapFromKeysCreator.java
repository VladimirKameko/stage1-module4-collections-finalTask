package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        List<String> k = new ArrayList<>(sourceMap.keySet());
        Map<Integer, Set<String>> res = new HashMap<>();
        for (String str : k) {
            Set<String> s = new HashSet<>();
            for (String strH : k) {
                if (strH.length() == str.length()) {
                    s.add(strH);
                }
                res.put(str.length(), s);
            }
        }


        return res;
    }
}
