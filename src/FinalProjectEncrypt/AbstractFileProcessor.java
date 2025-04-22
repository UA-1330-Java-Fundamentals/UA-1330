package FinalProjectEncrypt;

public abstract class AbstractFileProcessor {
    public abstract String read(String path);

    public abstract void write(String path, String content);

    public void printError(String message) {
        System.out.println("Error: " + message);
    }
}

