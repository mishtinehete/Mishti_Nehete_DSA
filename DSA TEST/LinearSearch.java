public class LinearSearch {
    public static void main(String[] args) {
    int[] array = {23, 67, 4, 89, 31, 55, 12};
    int target = 89;
    int steps = 0, foundIndex = -1;

    System.out.println("=== Linear Search ===");
    System.out.println("Target: " + target);
    System.out.println("---------------------");

    for (int i = 0; i < array.length; i++) {
      steps++;
      System.out.println("Step " + steps +
        ": Checking index " + i +
        " Value = " + array[i]);
      if (array[i] == target) {
        foundIndex = i;
        break;
      }
    }
    System.out.println("---------------------");
    if (foundIndex != -1) {
      System.out.println("Result : FOUND");
      System.out.println("Index  : " + foundIndex);
    } else {
      System.out.println("Result: Not found");
    }
    System.out.println("Total Steps: " + steps);
    }
}
