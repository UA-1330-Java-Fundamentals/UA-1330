/*
To complete the given task, it is required to create a class named Plant which includes
the following fields: int size, Color color (an Enum), Type type (an Enum)
A constructor must be created to initialize these fields. The toString() method should
be overridden to provide a string representation of the Plant object. Two separate
classes named ColorException and TypeException should bе created to describe all possible
colors and types of plants respectively. In the main() method, an array of five plants
should be created, and it should be ensured that the exception handling is working
correctly for invalid color and type values.

**Add a method that will verify whether the size of the plant is correct and throw
an exception if it is too small or too large.

**Add a method that will verify whether the color and type are both valid and throw
an exception if invalid parameters are entered.

        Я НЕ ЗОВСІМ ЗРОЗУМІВ СУТІ ОСТАННЬОЇ ДОДАТКОВОЇ ЗАДАЧІ!!!

*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

enum Color {
    RED, GREEN, BLUE;
}

enum Type {
    HERBS, SHRUBS, TREES, CLIMBERS;
}

class SizeException extends Exception{
    public SizeException(String message) {
        super(message);
    }
}

class ColorException extends Exception{
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception{
    public TypeException(String message) {
        super(message);
    }
}

class Plant{
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException, SizeException{
        if (color == null ) {
            throw new ColorException("Не можна вводити нулл");
        }
        if (type == null) {
            throw new TypeException("Не можна вводити нулл");
        }
        if (size > 50 || size < 1) {
            throw new TypeException("Ваш розмір не влазить в рамки від 1 до 50");
        }

        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

public class PracticalTask2 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant(15, Color.RED, Type.TREES);
            plants[1] = new Plant(10, Color.GREEN, Type.SHRUBS);
            plants[2] = new Plant(5, Color.BLUE, Type.HERBS);
            plants[3] = new Plant(7, null, Type.CLIMBERS);
            plants[4] = new Plant(12, Color.RED, null);
            //plants[3] = new Plant(51, Color.RED, Type.SHRUBS); Використовується при створенні обєкта під час перевірки першого додаткового завдання
        } catch (SizeException | ColorException | TypeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }
    }
}
