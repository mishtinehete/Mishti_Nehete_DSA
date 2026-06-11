import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
    int[] array = {64, 25, 12, 22, 11};
    int totalSwaps = 0, n = array.length;

    System.out.println("=== Bubble Sort ===");
    System.out.println("Before: " + Arrays.toString(array));
    System.out.println("-------------------");

    for (int i = 0; i < n - 1; i++) {
      System.out.println("Pass " + (i + 1) + ":");
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          totalSwaps++;
          System.out.println("  Swapped = "
            + Arrays.toString(array));
        }
      }
    }
    System.out.println("-------------------");
    System.out.println("Total Swaps : " + totalSwaps);
    System.out.println("Sorted Array: "
      + Arrays.toString(array));
  }
}

