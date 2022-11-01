
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    int yearModel;
    String make;
    int speed;

    /**
     * Constructor for objects of class Car
     */
    public Car(int yearModel, String make)
    {
        // initialise instance variables
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    public int getYearModel(){
        return yearModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int accelerate()
    {
        speed = speed + 5;
        return speed;
    }
    
    public int brake(){
        speed = speed - 5;
        return speed;
    }
}
