public class MaxBitwiseAnd {
   public static void main(String[] args) {
       int[] arr={3,5,8,10,12};
       int max=0;
       for(int i=0;i<arr.length-1;i++)
       {
           max=Math.max(arr[i]&arr[i+1],max);
       }

       System.out.println(max);

       int n=5;
       int c=0;
       for(int i=0;i<=n;i++)
       {
           int x=n & i;
           if( x==i)
           {
               c++;
           }
       }
       System.out.println("count-->"+c);
 
   } 
}
