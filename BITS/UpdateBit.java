public class UpdateBit {
   public static void main(String[] args) {
       int n=5;
       int bit=1;
       int i=2;

       int mask=~(1<<i);
       n=n&mask;

       mask=bit<<(i-1);
       int d=n | mask;

       System.out.println(d);

       
   } 
}
