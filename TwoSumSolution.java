import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

class TwoSumSolution {
  public static int[] twoSum(int target, int[] arr) {
    int[] results = new int[2];
    int currentDiff = 0;
    int currentIndex = 0;
    int currentElement = 0;
    HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>();
    while (currentIndex<arr.length) {
      System.out.println("CurrentIndex:"+currentIndex);
      currentDiff = target - arr[currentIndex];
      System.out.println("currentDiff:"+currentDiff);
      if (map.containsKey(currentDiff)) {  //if the current diff is already stored in hashmap add it along with currentIndex
        results[0]=map.get(currentDiff);
        results[1]=currentIndex;
        break;
      }
      map.put(arr[currentIndex],currentIndex);
      System.out.println("Map:"+map);
      currentIndex++;
    }
    return results;
  }

  public static void main(String[] args) {
    int[] result = TwoSumSolution.twoSum(6, new int[] { 3,3});
    System.out.println("TwoSum indexes : " +result[0]+":"+result[1]);
  }
}
