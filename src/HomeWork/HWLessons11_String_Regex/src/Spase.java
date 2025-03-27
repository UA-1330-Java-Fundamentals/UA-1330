public class Spase {
    public static void main(String[] args) {
        String  str = "I     am      learning      Java Fundamental";
        System.out.println("Original text: " + str);
        str = str.replaceAll(" +", " ");
        System.out.println("Clean text: " + str);

    }
}
