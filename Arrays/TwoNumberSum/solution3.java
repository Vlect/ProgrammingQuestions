package Arrays.TwoNumberSum;
import java.util.Arrays;

public class solution3 {
  // O(nlog(n)) | O(1) space
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
      int currentSum = array[left] + array[right];
      if(currentSum == targetSum) {
        System.out.println("Result: " + "[" + array[left] + ", " + array[right] + "]");
        return new int[] {array[left], array[right]};
      } else if (currentSum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
    return new int[0];
  }

  public static void main(String[] args) {
    twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
  }
}
