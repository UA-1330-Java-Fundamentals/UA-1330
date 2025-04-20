import java.util.*;

public class Main {

    public static String generateSecretCode(int length, int maxLettersIndex) {
        String allSymbols = "1234567890abcdefghijklmnopqrstuvwxyz";
        List<Character> characters = new ArrayList<>();

        String allowedSymbols = allSymbols.substring(0, maxLettersIndex);
        for (char c : allowedSymbols.toCharArray()) {
            characters.add(c);
        }

        Collections.shuffle(characters);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(characters.get(i));
        }

        String secretNum = result.toString();
        return secretNum;
    }

    public static char getLastLetters(int maxLettersIndex) {
        String allLetters = "abcdefghijklmnopqrstuvwxyz";
        if (maxLettersIndex > 10) {
            char letter = allLetters.charAt(maxLettersIndex - 11);
            return letter;
        } else {
            return ' ';
        }
    }

    public static int countBulls(String secretNum, String guessesNum) {
        int bullCounter = 0;
        for (int i = 0; i < secretNum.length(); i++) {
            if (secretNum.charAt(i) == guessesNum.charAt(i)) {
                bullCounter++;
            }
        }
        return bullCounter;
    }

    public static int countCows(String secretNum, String guessesNum) {
        int cowsCounter = 0;
        for (int i = 0; i < secretNum.length(); i++) {
            for (int j = 0; j < guessesNum.length(); j++) {
                if (i != j) {
                    if (secretNum.charAt(i) == guessesNum.charAt(j)) {
                        cowsCounter++;
                    }
                }
            }
        }
        return cowsCounter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Input the length of the secret code:");
        if (!sc.hasNextInt()) {
            String errorLine = sc.nextLine();
            System.out.println("Error: " + errorLine + " isn't a valid number.");
            return;
        }
        length = sc.nextInt();
        sc.nextLine();

        if (length > 36 || length <= 0) {
            System.out.println("Error: can't generate a secret number with a length of " + length + " because there aren't enough unique digits.");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        int maxLettersIndex = sc.nextInt();
        sc.nextLine();

        if (maxLettersIndex > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }
        if (length > maxLettersIndex) {
            System.out.println("Error: it's not possible to generate a code with a length of " + length + " with " + maxLettersIndex + " unique symbols.");
            return;
        }
        String secretNum = generateSecretCode(length, maxLettersIndex);

        StringBuilder secretIsPrepared = new StringBuilder("The secret is prepared: " + ("*".repeat(length)) + " (0-9");
        if (maxLettersIndex > 10) {
            secretIsPrepared.append(", a-").append(getLastLetters(maxLettersIndex));
        }
        secretIsPrepared.append(").");
        System.out.println(secretIsPrepared);
        System.out.println("Okay, let's start a game!");

        int turn = 1;

        while (true) {
            System.out.println("Turn " + turn + ":");
            String guessesNum = sc.nextLine();
            if (guessesNum.length() != length) {
                return;
            }

            int bulls = countBulls(secretNum, guessesNum);
            int cows = countCows(secretNum, guessesNum);

            StringBuilder grade = new StringBuilder("Grade: ");
            if (bulls == 0 && cows == 0) {
                grade.append("None.");
            } else {
                if (bulls > 0) {
                    grade.append(bulls).append(" bull");
                    if (bulls > 1) {
                        grade.append("s");
                    }
                }
                if (bulls > 0 && cows > 0) {
                    grade.append(" and ");
                }
                if (cows > 0) {
                    grade.append(cows).append(" cow");
                    if (cows > 1) {
                        grade.append("s");
                    }
                }
            }
            System.out.println(grade);

            if (bulls == length) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
            turn++;
        }
        sc.close();
    }
}