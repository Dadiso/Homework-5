
/**
 * Write a description of class NumberApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumberApplication
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Enter the value for the number: ");
        int value = sc.nextInt();
        Number val = new Number(value);
        
        System.out.println("The factorial of " + value + " is: ");
        val.printFactors();
        if (val.isPrime()){
            System.out.println(value + " is a prime number");
        }
        else{
            System.out.println(value + " is not a prime number");
        }
        System.out.print("The even digits are: ");
        val.printEvenDigits();
        System.out.println();
        System.out.println("Number of digits in number: " + val.countDigits());
        
    
        
        
        
    }
}
