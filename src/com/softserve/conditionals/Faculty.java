package com.softserve.conditionals;

public class Faculty {
    private String name;
    private int numberOfStudents;

    public Faculty() {
    }

    public Faculty(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty Information: " +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents;
    }

    enum CurrentSeason {
        WINTER("Winter", "It's time of winter exams"),
        SPRING("Spring", "It's a second semester now!"),
        SUMMER("Summer", "It's a vacation now!" ),
        AUTUMN("Autumn", "It's a first semester now!");

        private String seasonName;
        private String description;


        CurrentSeason(String seasonName, String description) {
            this.seasonName = seasonName;
            this.description = description;

        }

        public String getDescription() {
            return description;
        }

        public String getSeasonName() {
            return seasonName;
        }

        @Override
        public String toString() {
            return " The Current Season is " +
                    "seasonName='" + seasonName + '\'' +
                    ", description='" + description + '\'';
        }

        static CurrentSeason getBySeasonName(String name) {
            return switch (name) {
                case "winter" -> CurrentSeason.WINTER;
                case "spring" -> CurrentSeason.SPRING;
                case "summer" -> CurrentSeason.SUMMER;
                case "autumn" -> CurrentSeason.AUTUMN;
                default -> throw new IllegalArgumentException("The entered season name" +
                        name + " isinvalid");
            };
        }
    }
}
