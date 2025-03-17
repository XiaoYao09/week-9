package main;

import java.util.*;
import java.util.stream.Collectors;

class ChampionshipStatistics {
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        return drivers.stream().mapToInt(Driver::getPoints).average().orElse(0);
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        if (drivers.isEmpty()) return "Unknown";

        return drivers.stream()
                .collect(Collectors.groupingBy(Driver::getCountry, Collectors.summingInt(Driver::getPoints)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Unknown");
    }
}

