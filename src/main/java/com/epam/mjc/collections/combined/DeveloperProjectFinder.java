package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new LinkedList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                res.add(entry.getKey());
            }
        }
        return res.stream().sorted((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return 1;
            } else if (o1.length() > o2.length()) {
                return -1;
            } else  {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());
    }
}
