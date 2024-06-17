
//build a temparature conversion program//
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Temperature Converter!");
            System.out.println("Please choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Convert Celsius to Kelvin");
            System.out.println("4. Convert Kelvin to Celsius");
            System.out.println("5. Convert Fahrenheit to Kelvin");
            System.out.println("6. Convert Kelvin to Fahrenheit");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            if (choice == 7) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.print("Enter the temperature to convert: ");
            double temperature = scanner.nextDouble();
            double convertedTemperature = 0.0;

            switch (choice) {
                case 1:
                    convertedTemperature = celsiusToFahrenheit(temperature);
                    System.out.println(temperature + " Celsius is " + convertedTemperature + " Fahrenheit");
                    break;
                case 2:
                    convertedTemperature = fahrenheitToCelsius(temperature);
                    System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius");
                    break;
                case 3:
                    convertedTemperature = celsiusToKelvin(temperature);
                    System.out.println(temperature + " Celsius is " + convertedTemperature + " Kelvin");
                    break;
                case 4:
                    convertedTemperature = kelvinToCelsius(temperature);
                    System.out.println(temperature + " Kelvin is " + convertedTemperature + " Celsius");
                    break;
                case 5:
                    convertedTemperature = fahrenheitToKelvin(temperature);
                    System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Kelvin");
                    break;
                case 6:
                    convertedTemperature = kelvinToFahrenheit(temperature);
                    System.out.println(temperature + " Kelvin is " + convertedTemperature + " Fahrenheit");
                    break;
                default:

                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
