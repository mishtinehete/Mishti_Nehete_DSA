public class BinarySearch {
    public static void main(String[] args) {
    int[] array = {4, 12, 23, 31, 55, 67, 89};
    int target = 12;
    int left = 0, right = array.length - 1;
    int steps = 0, foundIndex = -1;

    System.out.println("=== Binary Search ===");
    System.out.println("Target: " + target);
    System.out.println("---------------------");

    while (left <= right) {
      steps++;
      int mid = (left + right) / 2;
      System.out.println("Step " + steps +
        ": Left=" + left + "  Right=" + right +
        "  Mid=" + mid +
        "  Value=" + array[mid]);
      if (array[mid] == target) {
        foundIndex = mid; 
        break;
        } 
      else if (array[mid] < target) {
        System.out.println("  Search RIGHT half");
        left = mid + 1;
      } else {
        System.out.println("  Search LEFT half");
        right = mid - 1;
      }
    }
        System.out.println("---------------------");
      if (foundIndex != -1)
        System.out.println("Result: FOUND at index " + foundIndex);
      else
        System.out.println("Result: NOT FOUND");
        System.out.println("Total Steps: " + steps);
  }
}
