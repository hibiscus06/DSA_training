public class SetBit {
   public static void main(String[] args) {
       int n=12; //1100
       int k=2;
       int mask=1<<(k-1); //10
       int digit=n | mask; //1110
       System.out.println(digit);  //14
   } 
}
