package hw6.task1;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        Eagle eagle = new Eagle();
        Kiwi kiwi = new Kiwi();
        Penguin penguin = new Penguin();
        Swallow swallow = new Swallow();

        birds[0] = eagle;
        birds[1] = kiwi;
        birds[2] = penguin;
        birds[3] = swallow;

        for (int i = 0; i < 4; i++) {
            birds[i].fly();
        }
    }
}
