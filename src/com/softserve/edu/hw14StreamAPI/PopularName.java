package com.softserve.edu.hw14StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PopularName {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        // group by name and count their repeating
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        //check if the map empty
        if (nameCounts.isEmpty()) {
            return Optional.empty();
        }

        // find max count
        long maxCount = nameCounts.values().stream()
                .max(Long::compareTo)
                .orElse(0L);

        // filter names with max count
        List<String> mostPopularNames = nameCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .toList();

        return mostPopularNames.size() == 1
                ? Optional.of(mostPopularNames.get(0))
                : Optional.empty();
    }
}
