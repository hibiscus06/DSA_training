public class ClearBit {
   public static void main(String[] args) {
       int n=20; //10100
       int k=2;
       int mask=~(1<<k); // ~(00100)=11011 <--mask
       int d=n&mask; // 10100 & 11011 = 10000
       System.out.println(d);
   } 
}
