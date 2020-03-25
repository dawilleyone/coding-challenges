import java.util.Arrays;
import java.util.HashMap;

class LongestSubArrayWithSum {

  public static int[] findMax(int[] array, int k) {

    int winStart = 0;
    int[] result= new int[2];
    int currentSum=0;
    int currentLong=0;
    int maxLong=0;

    for (int winEnd=0; winEnd<array.length; winEnd++) {
        currentSum+=array[winEnd];
        if(currentSum==k) {
          currentLong=winEnd-winStart+1;
          System.out.println("currentLong:"+currentLong);
          if (currentLong>=maxLong)
            maxLong=currentLong;
          currentSum-=array[winStart];
          winStart++;
        }

      }
          System.out.println("maxLong:"+maxLong);
    return result;
  }



  public static void main(String[] args) {
    int[] result = LongestSubArrayWithSum.findMax(new int[]{1,2,3,4,5,0,0,0,0,6,7,8,9,10}, 15);
    System.out.println("Max subarray for string is : " +result[0]+","+result[1]);
  }
}
