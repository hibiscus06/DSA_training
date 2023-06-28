public class Twosum {
    public static void main(String[] args) {
        //Approach - Hash via Array
        //thIS APPROACH DID NOT WORK IN LEETCODE because it does not run for all cases 
        /*int[] arr={3,2,5,8,4};
        int target=6;
        int max = 0;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
 
        int[] hash=new int[max+1];

        for(int i=0;i<arr.length;i++)
        {
            if(hash[arr[i]]==0)
            {
                int index=Math.abs(target-arr[i]);
                hash[index]=i;
            }
            else{
                int a=i;
                int b=hash[arr[i]];
                System.out.println(b+" "+a);
            }
        }*/
    
        //HASHING
        /*
         int max = 0;
        int indexes []= new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
       
               
                for(int i = 0; i<arr.length; i++){
                    if(hash.get(arr[i])==null){
                        int index = target - arr[i];
                        hash.put(index, i); // put (key, value)
                        
                    }
                    else{
                        
                        indexes[0] = hash.get(arr[i]);
                        indexes[1] = i;
                        //System.out.println("Two Sum "+firstPair + " "+secondPair);
                        //return;
                    }
           */
              
           
           //TWO POINTER APPROACH
           /*
           Sort the Array and Use 2 Pointer Approach
        Arrays.sort(arr); // N Log N
        int low = 0 ;
        int high = arr.length-1;
        while(low<high){ // N
            if((arr[low] + arr[high]) == target){
                System.out.println("Two Sum "+arr[low]+" "+arr[high]);
                return;
            }
           if((arr[low] + arr[high]) < target){
            low ++;
           }
           else 
           if((arr[low] + arr[high]) > target){
            high--;
           }

        */
    }
}
