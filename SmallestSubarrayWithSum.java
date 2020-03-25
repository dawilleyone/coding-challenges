import java.util.Arrays;

class SmallestSubarrayWithSum {
  public static int findMinSubArrary(int S, int[] arr) {
    int windowSum = 0;
    int minArraySize = arr.length;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      if (arr[windowEnd]>=S)
        return 1;
      windowSum += arr[windowEnd]; // add the next element , keep adding until we hit >= K
      if (windowSum >= S) {
        minArraySize = windowEnd - windowStart;
        windowSum -= arr[windowStart];  //subtract the first element in current window
        windowStart++;
      }
    }
    return minArraySize;
  }

  public static void main(String[] args) {
    int result = SmallestSubarrayWithSum.findMinSubArrary(7, new int[] { 2,1,5,2,3,2});
    System.out.println("Min subarray length for sum : " +result);
  }
}
