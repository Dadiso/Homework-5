/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature
{
    // instance variables - replace the example below with your own
    double fahrenheit;

    /**
     * Constructor for objects of class Temperature
     */
    public Temperature(double fahrenheit)
    {
        // initialise instance variables
        this.fahrenheit = fahrenheit;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public double getFahrenheit(){
        return fahrenheit;
    }
    
    public double toCelsius()
    {
        return ((fahrenheit - 32) * 5) / 9;
    }
    
    public double toKelvin()
    {
        return toCelsius() + 273.15;
    }
}
