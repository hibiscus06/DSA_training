public class BitatPosnK {
    public static void main(String[] args) {

        int n=10; //1010
        int k=2;
        
        //First way
        n=n>>(k-1); // 01101
        //System.out.println(n);
        int digit=n&1;  // 01101 & 1 = 0 
        //System.out.println(digit); //1

        //Second way 
        int n2=4;  //1010
        int mask=1<<(k-1);    //10
        int dig= n2 & mask;
        if(dig>0)
        System.out.println(1);
        else
        System.out.println(0);
    }
}
