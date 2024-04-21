/*
    *
   * *
  * * *
 * * * *
* * * * *
 */
public class Pattern20{
    public static void main(String[] args) {
        int rows = 5;

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
