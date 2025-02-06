/*
4. Create a class named Faculty and input the information about the number of students (using the console) and the
current season (using enum). Each season must have a name in English (use the constructor). In the main() method,
check the correctness of the code. Here, a season can signify a time of year (winter, spring, summer, autumn) . In the
context of this task, it can correspond to a certain semester . For example, autumn could be the first semester, spring -
the second, and summer - the vacation period . Winter may correspond to the period of winter exams .
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Objects;
import java.util.Scanner;

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;
}

class Faculty{
    private int numberOfStudents;
    private Season currentSeason;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return numberOfStudents == faculty.numberOfStudents && currentSeason == faculty.currentSeason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudents, currentSeason);
    }

    public Faculty(Scanner sc, Season currentSeason){
        this.numberOfStudents = sc.nextInt();
        this.currentSeason = currentSeason;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }
}

public class homeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Season season;
        System.out.println("Введіть назву пори: ");
        String seasonByUser = sc.nextLine();

        season = switch (seasonByUser){
            case "Зима" -> Season.WINTER;
            case "Весна" -> Season.SPRING;
            case "Літо" -> Season.SUMMER;
            case "Осінь" -> Season.AUTUMN;
            default -> null;
        };

        System.out.println("Введіть кількість студентів: ");
        Faculty faculty = new Faculty(sc, season);

        if (faculty.getCurrentSeason() == Season.WINTER) {
            System.out.println("Winter correspond to the period of winter exams.");
        }
        if (faculty.getCurrentSeason() == Season.SPRING) {
            System.out.println("Spring - the second.");
        }
        if (faculty.getCurrentSeason() == Season.SUMMER) {
            System.out.println("Summer - the vacation period.");
        }
        if (faculty.getCurrentSeason() == Season.AUTUMN) {
            System.out.println("Autumn is the first semester.");
        }

    }
}
