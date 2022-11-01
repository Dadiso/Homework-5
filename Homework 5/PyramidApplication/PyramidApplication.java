
/**
 * Write a description of class Pyramid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PyramidApplication
{
   public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    int k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
