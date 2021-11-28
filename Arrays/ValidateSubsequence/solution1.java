package Arrays.ValidateSubsequence;
import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrIdx = 0;
    int seqIdx = 0;
    while(arrIdx < array.size() && seqIdx < sequence.size()) {
      if(array.get(arrIdx).equals(sequence.get(seqIdx))) {
        seqIdx++;
      }
      arrIdx++;
    }

    return seqIdx == sequence.size();
  }

  public static void main(String[] args) {

    List<Integer> firstList = new ArrayList<Integer>();

    firstList.add(5);
    firstList.add(1);
    firstList.add(22);
    firstList.add(25);
    firstList.add(6);
    firstList.add(-1);
    firstList.add(8);
    firstList.add(10);

    List<Integer> secondList = new ArrayList<Integer>();

    firstList.add(5);
    firstList.add(1);
    firstList.add(22);
    firstList.add(22);
    firstList.add(25);
    firstList.add(6);
    firstList.add(-1);
    firstList.add(8);
    firstList.add(10);

    isValidSubsequence(firstList, secondList);
  }
}
