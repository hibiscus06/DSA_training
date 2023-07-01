public class XOR {
   public static void main(String[] args) {
       int a=5;
       int b=6;
       //a^b = a|~b + b|~a ;
       int res= (a & (~b)) | (b & (~a));
       System.out.println(res);
   } 
}
