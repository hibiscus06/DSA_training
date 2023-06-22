public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr={999,220,190,-100,1,44};
        int first= Integer.MIN_VALUE; 
        int sec= Integer.MIN_VALUE; 
        int third= Integer.MIN_VALUE; 

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                third=sec;
                sec=first;
                first=arr[i];
            }
            else if(arr[i]<first && arr[i]>sec)
            {
                third=sec;
                sec=arr[i];
            }
            else if(arr[i]<first && arr[i]<sec && arr[i]>third)
            {
                third=arr[i];
            }
        }
        System.out.println(first + " " + sec + " " + third);
    }
}
