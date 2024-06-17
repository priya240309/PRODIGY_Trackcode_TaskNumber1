# Temperature Converter

This is a simple Java program to convert temperatures between Celsius and Fahrenheit.

## Usage

The `TemperatureConverter` class provides two static methods:

- `celsiusToFahrenheit(double celsius)`: Converts a temperature from Celsius to Fahrenheit.
- `fahrenheitToCelsius(double fahrenheit)`: Converts a temperature from Fahrenheit to Celsius.

### Example

Here is an example of how to use the `TemperatureConverter` class:

```java
public class TemperatureConverterExample {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        System.out.println(celsius + "°C is " + TemperatureConverter.celsiusToFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F is " + TemperatureConverter.fahrenheitToCelsius(fahrenheit) + "°C");
    }
}
