public class FirstLastOccur {
   public static void main(String[] args) {
       int[] arr={10,20,30,40,40,40,40,50,60,70};
       int search=40;
       int firstIndex=-1;
       int lastIndex=-1;
       int s=0;
       int end=arr.length-1;
 
       //first index
       while(s<=end)
       {
           int mid=(s+end)/2;

           if(arr[mid]==search)
           {
               firstIndex=mid;
               end=mid-1;
           }

           else if(arr[mid]<search)
           {
               s=mid+1;
           }
           else{
               end=mid-1;
           }

       
        }

        //last index
        s=0;
        end=arr.length-1;
        while(s<=end)
       {
           int mid=(s+end)/2;

           if(arr[mid]==search)
           {
               lastIndex=mid;
               s=mid+1;
           }

           else if(arr[mid]<search)
           {
               s=mid+1;
           }
           else{
               end=mid-1;
           }

       }
       System.out.println(firstIndex);
       System.out.println(lastIndex);
       System.out.println(lastIndex-firstIndex+1);

   } 
}
