class LongestIncreasingSubSequence {

    static int lengthOfLIS(int nums[])
    {

        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
          int i = 0, j = size;
          while (i != j) {
              int m = (i + j) / 2;
              if (tails[m] < x)
                i = m + 1;
              else
                j = m;
            }
            tails[i] = x;
            System.out.println("Tails["+i+"]="+x);
            if (i == size)
              ++size;
        }
        return size;
    }

  static public int lengthOfLISb(int[] nums) {
      return lengthofLISb(nums, Integer.MIN_VALUE, 0);
    }

  static public int lengthofLISb(int[] nums, int prev, int curpos) {
      if (curpos == nums.length) {
          return 0;
      }
      int taken = 0;
      if (nums[curpos] > prev) {
          taken = 1 + lengthofLISb(nums, nums[curpos], curpos + 1);
      }
      int nottaken = lengthofLISb(nums, prev, curpos + 1);
      return Math.max(taken, nottaken);
  }


    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 10,9,2,5,3,7,101,18  };
        int n = arr.length;
        System.out.println(lengthOfLIS(arr));

        //System.out.println(lengthOfLISb(arr));
    }
}
