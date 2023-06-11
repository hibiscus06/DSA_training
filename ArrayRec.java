public class ArrayRec {

    public static int product(int[] arr,int p,int i)
    {
        if(i==arr.length)
        return p;

        p=p*arr[i];
        return product(arr,p,i+1);

    }
   
   public static String[] cap(String[] arr,int i)
   {
       if(i==arr.length)
       {
           return arr;
       }
       String str=arr[i];
       arr[i]=str.toUpperCase();

       return cap(arr,i+1);
   }
    
   public static int highest(int[] arr,int i,int max)
   {
    if(i==arr.length)
    return max;

    if(arr[i]>max)
    max=arr[i];

    return highest(arr,i+1,max); 
   }
   
   public static void main(String[] args)
    {
         int[] arr={11,12,73,14,65};
        // System.out.println(product(arr,1,0));
        // String[] ar={"foo","bar", "word"};
        //   cap(ar,0);
        // for(int i=0;i<ar.length;i++)
        // {
        //     System.out.println(ar[i]);
        // }

        System.out.print(highest(arr,0,Integer.MIN_VALUE));
    }
}










