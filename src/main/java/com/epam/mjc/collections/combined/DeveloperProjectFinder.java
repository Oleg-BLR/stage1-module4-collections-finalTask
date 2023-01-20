package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public static void main(String[] args) {
        Map<String, Set<String>> projects = new TreeMap<>();
        projects.put("C50", new TreeSet<>(Arrays.asList("Ivan", "Anna", "Lidia", "Antony")));
        projects.put("VVas", new TreeSet<>(Arrays.asList("Mary", "Ben", "Max")));
        projects.put("LJA", new TreeSet<>(Arrays.asList("Oleg", "Ivan", "Alex")));
        System.out.println(projects);

        DeveloperProjectFinder developerProjectFinder = new DeveloperProjectFinder();
        developerProjectFinder.findDeveloperProject(projects, "Ivan");

    }
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        projects.forEach((k, v) ->{
            v.forEach(e ->{
                if (e.equals(developer)){
                    developerProjects.add(k);
                }
            });
        });
        System.out.println(developerProjects);
        Collections.sort(developerProjects, new ProjectComparator());
        System.out.println(developerProjects);
        return developerProjects;
    }

    class ProjectComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
//            return o1.length() > o2.length() ? 1 : o1.length() == o2.length() ? 1 : 0;
//            return o1.length() > o2.length() ? -1 : 0;
//            return o1.length() > o2.length() ? -1 : 0; // works
//            return o1.length() > o2.length() ? -1 : o1.compareTo(o2) > 0 ? -1 : 0; // works
            return o1.length() > o2.length() ? -1 : o1.length() == o2.length() ? (o1.compareTo(o2) > 0 ? -1 : 0) : 0; // works
//            if (o1.compareTo(o2) > 0)
//            return 1; //
//            return 0;
        }
    }


}
