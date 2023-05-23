package com.epam.mjc.collections.combined;

import java.util.*;


public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> res = new HashSet<>();

        List<List<String>> t = new ArrayList<>(timetable.values());
        for (List<String> r : t) {
            res.addAll(r);
        }
        return res;
    }
}
