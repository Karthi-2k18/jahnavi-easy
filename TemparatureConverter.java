import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Enter temperature value:");
        double temperature = scanner.nextDouble();
        
        System.out.println("Enter current scale (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char currentScale = scanner.next().charAt(0);
        
        System.out.println("Enter target scale (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char targetScale = scanner.next().charAt(0);
        
        double convertedTemperature;
        switch (currentScale) {
            case 'C':
                if (targetScale == 'F') {
                    convertedTemperature = celsiusToFahrenheit(temperature);
                } else if (targetScale == 'K') {
                    convertedTemperature = celsiusToKelvin(temperature);
                } else {
                    convertedTemperature = temperature; // No conversion needed
                }
                break;
            case 'F':
                if (targetScale == 'C') {
                    convertedTemperature = fahrenheitToCelsius(temperature);
                } else if (targetScale == 'K') {
                    convertedTemperature = fahrenheitToKelvin(temperature);
                } else {
                    convertedTemperature = temperature; // No conversion needed
                }
                break;
            case 'K':
                if (targetScale == 'C') {
                    convertedTemperature = kelvinToCelsius(temperature);
                } else if (targetScale == 'F') {
                    convertedTemperature = kelvinToFahrenheit(temperature);
                } else {
                    convertedTemperature = temperature; // No conversion needed
                }
                break;
            default:
                System.out.println("Invalid scale!");
                return;
        }
        
        System.out.println("Converted temperature: " + convertedTemperature + " " + targetScale);
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
