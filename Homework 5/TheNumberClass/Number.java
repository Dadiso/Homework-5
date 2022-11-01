
/**
 * Write a description of class Number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number
{
    // instance variables - replace the example below with your own
    int value;

    /**
     * Constructor for objects of class Number
     */
    public Number(int value)
    {
        // initialise instance variables
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public double factorial(){
        int i, factorial = 1;
        for (i = 1; i <= value; i++){
            factorial = factorial * i;
        }
        if (factorial > 9999999){
            return -1.0;
        }
        return factorial;
    }
    
    public boolean isPrime(){
        for (int n = 2; n < value; ++n){
            if (value % n == 0){
                return false;
            }
        }
        return true;
    }
    
    public void printFactors(){
        for (int p = 1; p <= value; ++p){
            if (value %  p == 0){
                System.out.println(p);
            }  
        }
    }
    
    public void printEvenDigits(){
        for (int d = 1; d <= value; ++d){
            if (d % 2 == 0){
                System.out.println(d);
            }
        }
    }
    
    public int countDigits(){
        int count = 0;
        while (value != 0){
            value /= 10;
            count += 1;
        }
        
        return count;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
}
