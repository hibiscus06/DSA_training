public class NearestLowestGreates {
   public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60,70,80,90,100};
    int search=91;
    int lowest=0;
    int greatest=0;
    int s=0;
    int end=arr.length-1;
    int i=0;
    
    while(s<=end) //my way
    {
        int mid=(s+end)/2;
        if(search>arr[mid])
        {
            s=mid+1;
        } 
        else if(search<arr[mid])
        {
            end=mid-1;
        } 
        else{
           lowest=greatest=arr[mid];
           return;
        }
    }
    System.out.println("G"+" "+arr[s]);
    System.out.println("L"+" "+arr[end]);

    while(i<arr.length)
    {
        int mid=(s+end)/2;
        if(search>arr[mid])
        {
            lowest=arr[mid];
            s=mid+1;
        }
        else if(search<arr[mid]){
            greatest=arr[mid];
            end=mid-1;
        }
        else if(arr[mid]==search){
            lowest=greatest=arr[mid];
            return;
        }
        i++;

    }

        // System.out.println("Search "+search);
        // System.out.println("Nearest Greater Element "+greatest);
        // System.out.println("Nearest Lowest Element "+lowest);

   } 
}
