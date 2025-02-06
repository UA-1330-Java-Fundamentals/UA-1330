/*
3. Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.). Ask the user to enter the name of the
country from the console. Using a switch statement, determine the continent to which the entered country belongs and
output the name of the continent. Output the result to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

enum Continent {
    AMERICA, EUROPE, ASIA, AFRICA
}

class practicalTask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Continent continent;
        System.out.println("Введіть назву країни: ");
        String countryByUser = sc.nextLine();

        continent = switch (countryByUser){
            case "Los Angeles" -> Continent.AMERICA;
            case "Ukraine" -> Continent.EUROPE;
            case "Japan" -> Continent.ASIA;
            case "Nigeria" -> Continent.AFRICA;
            default -> null;
        };
        System.out.print(continent);
    }
}
