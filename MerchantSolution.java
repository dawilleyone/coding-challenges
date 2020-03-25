import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MerchantSolution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

      System.out.println(Arrays.toString(ar));
      int pairCount = 0;
      Map<String,Integer> pairs = new HashMap<String, Integer>();
      String currValue="";

      for (int x=0; x<n;x++)
      {
        currValue = Integer.toString(ar[x]);
        if (!pairs.containsKey(currValue))
        {
          pairs.put(currValue,1);
        }
        else
        {
         pairs.remove(currValue,1);
         pairCount++;
       }

      }
      System.out.println(pairs.toString());
      return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
/*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        System.out.println("Result:"+result);
        scanner.close();
    }
}
