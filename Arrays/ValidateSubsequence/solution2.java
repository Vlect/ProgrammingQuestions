package Arrays.ValidateSubsequence;
import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int seqIdx = 0;
    for(var value : array) {
      if(seqIdx == sequence.size()) {
        break;
      }

      if(value == sequence.get(seqIdx) /* sequence.get(seqIdx).equals(value) */) {
        seqIdx++;
      }
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
