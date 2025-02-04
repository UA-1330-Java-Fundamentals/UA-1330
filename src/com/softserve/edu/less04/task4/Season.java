package com.softserve.edu.less04.task4;

public enum Season {
    WINTER("winter"), SPRING("spring"), SUMMER("summer"), AUTUMN("autumn");
    private final String season;

    Season(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }


}
