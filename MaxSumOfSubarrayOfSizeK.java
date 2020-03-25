import java.util.Arrays;

class MaxSumOfSubarrayOfSizeK {
  public static int findMaxSum(int K, int[] arr) {
    int maxSum =0;
    int  windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd]; // add the next element
      // slide the window, we don't need to slide if we've not hit the required window size of 'k'
      if (windowEnd >= K - 1) {
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= arr[windowStart]; // subtract the element going out
        windowStart++; // slide the window ahead
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int result = MaxSumOfSubarrayOfSizeK.findMaxSum(6, new int[] { 2, 1, 5, 1, 3, 2 });
    System.out.println("MaxSum of subarrays of size 3:" + result);
    result = MaxSumOfSubarrayOfSizeK.findMaxSum(2, new int[] { 2, 3, 4, 1, 5 });
    System.out.println("MaxSum of subarrays of size 2: " + result);
  }
}
