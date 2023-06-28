public class barChart {
   public static void main(String[] args) {
       int[]arr={2,1,7,9,5};
       int max=0;
       for(int el:arr)
       {
            if(el>max)
            {
                max=el;
            }
       }

       for(int i=max;i>0;i--)
       {
           for(int j=0;j<arr.length;j++)
           {
               if(arr[j]>=i)
               {
                   System.out.print("*\t");
               }
               else{
                   System.out.print("\t");
               }
           }
           System.out.println();
       }
   } 
}
