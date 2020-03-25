import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValleySolution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
      int numValleys=0;
      int elevation=0;


      String[] path= s.split("");
      for (String ch : path ){
        //System.out.println("Elevation:"+elevation+" step:"+ch);
          if (ch.equals("U")) {
            elevation++;
            if (elevation==0) // just came out of Valleys
             numValleys++;
          }
          if (ch.equals("D"))
            elevation--;
        }


      //System.out.println("Valleys:"+numValleys);
      return numValleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
