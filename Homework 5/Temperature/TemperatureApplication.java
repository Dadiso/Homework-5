
/**
 * Write a description of class TemperatureApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TemperatureApplication
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        Temperature temp = new Temperature(temperature);
        
        System.out.println("Temperature in Fahrenheit: "+ temp.fahrenheit);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());
        System.out.println("Temperature in Kelvin: " + temp.toKelvin());
        
    }
}
