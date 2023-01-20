package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public static void main(String[] args) {
        Map<String, List<String>> timeTable = new LinkedHashMap<>();
        timeTable.put("Monday", new ArrayList<>(Arrays.asList("English")));
        timeTable.put("Tuesday", new ArrayList<>(Arrays.asList("Mathematics")));
        timeTable.put("Wednesday", new ArrayList<>(Arrays.asList("English", "Chemistry")));
        timeTable.put("Thursday", new ArrayList<>(Arrays.asList("Literature", "Mathematics")));
        timeTable.put("Friday", new ArrayList<>(Arrays.asList("Physics")));
        System.out.println(timeTable);
        LessonsGetter lessonsGetter = new LessonsGetter();
        System.out.println(lessonsGetter.getLessons(timeTable));
    }
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessonsSet = new LinkedHashSet<>();
        for (List<String> e : timetable.values()) {
            for (int i = 0; i < e.size(); i++) {
                lessonsSet.add(e.get(i));
            }
        }
        return lessonsSet;
    }
}
