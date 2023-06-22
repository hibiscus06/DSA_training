import java.util.Arrays;

public class nthLargest {
   public static void main(String[] args) {
    int arr[] = {999,20,90,100,1,44};
    int n=3;
    Arrays.sort(arr);
   
    System.out.println(arr[arr.length-1-(n-1)]);
    
   } 
}
