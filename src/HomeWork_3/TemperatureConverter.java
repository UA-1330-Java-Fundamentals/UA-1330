package HomeWork_3;

public class TemperatureConverter {
    // Метод для конвертації температури з Фаренгейта в Цельсій
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit =105;//пература у Фаренгейтах (наприклад, температура тіла)
        double celsius = fahrenheitToCelsius(fahrenheit); // Викликаємо метод конвертації

        System.out.println(fahrenheit + "°F = " + celsius + "°C"); // Виводимо результат
    }
}