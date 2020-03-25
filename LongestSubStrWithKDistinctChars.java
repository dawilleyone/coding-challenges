import java.util.Arrays;
import java.util.HashMap;

class LongestSubStrWithKDistinctChars {

  public static int findLength(String str, int k) {
    HashMap<Character, Integer> charMap = new HashMap<>();
    int winStart = 0;
    int maxSize=0;
    int distinctCnt=0;

    for (int winEnd=0; winEnd<str.length(); winEnd++) {
      char c = str.charAt(winEnd);
      charMap.put(c,charMap.getOrDefault(c, 0) + 1);
      while (charMap.size() > k) {
        char leftChar = str.charAt(winStart);
        
      }

  }

  return maxSize;
}
  public static void main(String[] args) {
    int result = LongestSubStrWithKDistinctChars.findLength("araaci", 2);
    System.out.println("Max subarray for string is : " +result);
  }
}
