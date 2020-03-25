import java.util.Arrays;

class FindIndexes {

  public static int[] findProduct(int[] arr) {
    int [] result = new int[arr.length];
     int product = 1;

     for (int i=0; i<arr.length; i++) {
         product = product * arr[i];
     }
     System.out.println("Product:"+product);
     for (int j=0; j<arr.length; j++) {
             int temp = arr[j];
             if (product==0 && temp==0) {
               result[j]=0;
             }
             else
              result[j] = (temp==0) ? product/1 : product/temp;
             System.out.print(result[j]+",");
         }
         System.out.println();
          return result;
     }



  public static void main(String[] args) {
    int[] input = new int[] { 0,1,2};
    int[] result = FindIndexes.findProduct(input);
    System.out.println("Indexes:" + result);

  }
}
