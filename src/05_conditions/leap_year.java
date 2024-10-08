
// Check if a year is a leap year or not.
import java.util.Scanner;

public class leap_year {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter a number: ");
         int year = input.nextInt();

         if (year % 4 == 0) {
            if (year % 100 == 0) {
               if (year % 400 == 0) {
                  System.out.println(year + " is a leap year.");
               } else {
                  System.out.println(year + " is not a leap year.");
               }
            } else {
               System.out.println(year + " is a leap year.");
            }
         } else {
            System.out.println(year + " is not a leap year.");
         }
      }
   }
}
