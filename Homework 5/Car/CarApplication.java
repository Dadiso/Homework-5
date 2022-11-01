
/**
 * Write a description of class CarApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CarApplication
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Enter year of model: ");
        int yearModel = sc.nextInt();
        
        System.out.println("Enter make: ");
        String make = sc.next();
        
        Car emp = new Car(yearModel, make);
        for(int i = 0;i<5;i++){
            System.out.println(emp.accelerate());
        }
        
        for(int j = 0;j<5;j++){
            System.out.println(emp.brake());
        }
        
        System.out.println("Year of car model: " + yearModel);
        
        System.out.println("Make of car: " + make);
    }
    
    
}