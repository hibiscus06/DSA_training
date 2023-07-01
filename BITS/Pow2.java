public class Pow2 {
   public static void main(String[] args) {
       int n=20;
       int k=3;
       int mask= (~0<<k);
       n=n & mask;
       System.out.println(mask);
       System.out.println(n);
   } 
}
