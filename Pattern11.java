/*
 * * * * *
  * * * *
   * * *
    * *
     *

   */

   public class Pattern11{

    public static void main(String[] args) {
      int rows = 5;
  
      for (int i = rows; i >= 1; i--) {
        // Print leading spaces
        for (int j = 1; j <= rows - i; j++) {
          System.out.print(" ");
        }
  
        // Print stars
        for (int k = 1; k <= 2 * i - 1; k++) {
          System.out.print("*");
        }
        System.out.println(); // Move to the next line after each row
      }
    }
  }
  