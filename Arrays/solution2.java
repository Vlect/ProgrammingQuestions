package Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution2 {
  // O(n) time | O(n) space
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> nums = new HashSet<>();
    for(int num : array) {
      int potentialMatch = targetSum - num;
      if(nums.contains(potentialMatch)) {
        System.out.println("Result: " + "[" + potentialMatch + ", " + num + "]");
        return new int[] {potentialMatch, num};
      } else {
        nums.add(num);
      }
    }
    return new int[0];
  }
  public static void main(String[] args) {
    twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
  }
}
