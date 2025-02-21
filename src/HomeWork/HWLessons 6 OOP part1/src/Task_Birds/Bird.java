package Task_Birds;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;

    public  abstract boolean fly();

    //public abstract String getName();

    @Override
    public String toString() {

        return "This is " + this.getClass().getSimpleName() + ". Is fly: " + fly() + ".";
    }
}
