/*
Task 1
1. Create abstract class called Bird by scheme
with attributes feathers and layEggs and an
abstaract fly() method.
2. 3. Create classes FlyingBird and NonFlyingBird.
Create classes Eagle, Swallow, Penguin and
Kiwi.
4. In main() method create an array Bird and
add different birds to it. Call fly() method for
all of it. Output the information about each
type of created bird.
*/

package HomeWorkFromPDF.HomeWorkFromPDF6;

abstract class Bird{
    private String feathers;
    private boolean layEggs;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract public void fly();
}

class FlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("Я лечууу!!!");
    }

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("Я не лечу!");
    }

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

class Eagle extends FlyingBird{
    public Eagle() {
        super("Brown feathers", true);
    }
}

class Swallow extends FlyingBird{
    public Swallow() {
        super("Gray feathers", true);
    }
}

class Penguin extends NonFlyingBird{
    public Penguin() {
        super("Black and white feathers", true);
    }
}

class Kiwi extends NonFlyingBird{
    public Kiwi() {
        super("Brown fluffy feathers", true);
    }
}

public class HomeWork1 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println("Feathers: " + bird.getFeathers());
            System.out.println("Lays eggs: " + bird.isLayEggs());
            bird.fly();
            System.out.println();
        }
    }
}
