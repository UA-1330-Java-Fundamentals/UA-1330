package com.softserve.edu.less04.task4;

public enum Seasons {
    WINTER("holiday after session"),
    SPRING("spring semester"),
    SUMMER("holiday after session"),
    AUTUMN("autumn semester");

    private final String season;
    Seasons(String season) {
        this.season = season;
    }
    public String getSeason() {
        return season;
    }
}
