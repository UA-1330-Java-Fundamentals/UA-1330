/*

Create an interface called Animal with methods voice() and feed(). Create two classes
Cat and Dog, which implement this interface. In main() method create an array of Animal
and add some Cats and Dogs to it. Call voice() and feed() method for all of it.

*/

package HomeWorkFromPDF.HomeWorkFromPDF7;

interface Animal{
    String voice();
    String feed();
    String getName(); // Додано в інтерфейс
}

class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice(){
        return "Mey";
    }

    @Override
    public String feed(){
        return "Dry food";
    }
}

class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice(){
        return "Bark";
    }

    @Override
    public String feed(){
        return "Meat";
    }
}

public class PracticalTask1 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cat("Archi"),
            new Cat("Bobi"),
            new Dog("Den"),
            new Dog("Boni"),
        };

        for (Animal animal : animals) {
            System.out.println("Методи з інтерфейсів що є у тваринки на імя: " + animal.getName());
            System.out.println("Їжа: " + animal.feed());
            System.out.println("Голос: " + animal.voice());
            System.out.println("\n");
        }
    }
}
