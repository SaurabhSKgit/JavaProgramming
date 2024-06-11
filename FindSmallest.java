public class FindSmallest {
  public static void main(String[] args) {
    int[] arr = {100, 20, 5, 10, 12};
    int smallest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) 
      {
        smallest = arr[i];
      }
    }

    System.out.println("Smallest element in given array is: " + smallest);
  }
}
