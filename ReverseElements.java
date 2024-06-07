//wajp to reverse elements in an array
import java.util.*;

class ReverseElements{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();  // Read elements and store them in the array
        }

        System.out.println("Reversed elements:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");  // Print elements in reverse order
        }
    }
}