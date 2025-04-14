package finalproject;

import com.softserve.finalproject.Citrus;
import com.softserve.finalproject.Fruit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FruitTest {
    Fruit fruit = new Fruit();

    private static Stream<Arguments> fruitsProvider() {
        // Fruit frutit1 = new Fruit("apple", "red");
        //   Fruit frutit2 = new Fruit("kiwi", "green");
        //    Fruit frutit3 = new Fruit("lemon", "yellow");
        List<Fruit> listOfFruits = new ArrayList<Fruit>();
        listOfFruits.add(new Fruit("apple", "red"));
        listOfFruits.add(new Fruit("kiwi", "green"));
        listOfFruits.add(new Fruit("lemon", "yellow"));
        return Stream.of(
                Arguments.of(listOfFruits));
    }

    @DisplayName("Checking if two fruits have similar name")
    @Test
    void checkIfTwoFruitsHaveSimilarNames() {
        Fruit actual = new Fruit("apple", "yellow");
        Fruit expected = new Fruit("apple", "green");
        Assertions.assertEquals(0, fruit.compare(expected, actual));
    }

    @DisplayName("Checking if two fruits have different names")
    @Test
    void checkIfTwoFruitsHaveDifferentNames() {
        Fruit actual = new Fruit("apple", "yellow");
        Fruit expected = new Fruit("orange", "green");
        Assertions.assertNotEquals(0, fruit.compare(expected, actual));
    }

    @DisplayName("Checking if yellow fruit is present in list")
    @ParameterizedTest
    @MethodSource("fruitsProvider")
    void checkIfYellowFruitPresentInList(List<Fruit> listOfFruits) {
        System.out.println(listOfFruits);
        //List<Fruit> listOfFruits = new ArrayList<Fruit>();
//        listOfFruits.add(new Fruit("apple", "red"));
//        listOfFruits.add(new Fruit("kiwi", "green"));
//        listOfFruits.add(new Fruit("lemon", "yellow"));
        List<Fruit> yellowFruitsFound = fruit.findYellowFruit(listOfFruits);
        Assertions.assertEquals(1, yellowFruitsFound.size());
    }

    @DisplayName("Checking that yellow fruit is absent in list")
    @Test
    void checkIfYellowFruitAbsentInList() {
        List<Fruit> listOfFruits = new ArrayList<Fruit>();
        listOfFruits.add(new Fruit("apple", "red"));
        listOfFruits.add(new Fruit("kiwi", "green"));
        listOfFruits.add(new Fruit("lemon", "green"));
        List<Fruit> yellowFruitsFound = fruit.findYellowFruit(listOfFruits);
        Assertions.assertNotEquals(1, yellowFruitsFound.size());
    }

    @DisplayName("Checking that list was sorted")
    @Test
    void checkIfListWasSorted() {
        List<Fruit> listOfFruits = new ArrayList<Fruit>();
        listOfFruits.add(new Fruit("apple", "red"));
        listOfFruits.add(new Fruit("lemon", "yellow"));
        listOfFruits.add(new Fruit("kiwi", "green"));
        List<Fruit> listSorted = fruit.sortListOfFruitsByNames(listOfFruits);
        Assertions.assertNotEquals(listSorted, listOfFruits);
    }

    @DisplayName("Checking that list was sorted")
    @Test
    void checkIfListWasSortedByName() {
        List<Fruit> listOfFruits = new ArrayList<Fruit>();
        listOfFruits.add(new Fruit("apple", "red"));
        listOfFruits.add(new Fruit("lemon", "yellow"));
        listOfFruits.add(new Fruit("kiwi", "green"));
        List<Fruit> listSorted = fruit.sortListOfFruitsByNames(listOfFruits);
        String firstFruit = listSorted.getFirst().getName();
        Assertions.assertEquals("apple", firstFruit);
    }

}
