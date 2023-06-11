import java.net.SocketPermission;
import java.util.*;
import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthOptionPaneUI;

class Solution{

    
 //power of number
    static int pow(int num,int p)
    {
        if(p==0)
        {
            return 1;
        }
      return num*pow(num,p-1);

    }

    //Count 0 in a number
    static void count0(int num,int cnt)
    {
        if(num==0)
        {
            System.out.println(cnt) ;
            return ;
        }
        if(num%10==0)
        {
            cnt++;
        }
        count0(num/10,cnt);

    }

    //sum of N natural numbers
    static int sumofN(int num,int sum)
    {
        if(num==1)
        {
            return 1;
        }

        sum=num+sumofN(num-1,sum);
        return sum;

    }

//series 1/1^1 + 2 / 2 ^2 + 3 / 3^3 
static double series(int num,double sum)
{
    if(num==1)
        {
            return 1;
        }

    double n=1/(Math.pow(num,num-1));

    sum=n+series(num-1,sum);
    return sum;
}

//prime no.
static boolean prime(int num,int i)
{
    if(num==2)
    return true;

     if(i>=Math.sqrt(num))
     {
         return true;
     }

     if(num%i==0)
     {
         return false;
     }

     return prime(num,i+1);
}

//Armstrong
static boolean armstrong(int num,int l,int sum,int copy)
{
    if(num==0)
    {
        if(copy==sum)
        return true;

        else return false;
    }
     sum+=Math.pow(num%10,3);
     return armstrong(num/10,l,sum,copy);
}
//another way for armstrong
public static boolean isArm(int n) {
    return n == getSum(n, getDigitCount(n));
}

public static int getSum(int n, int power) {
    return n == 0 ? 0 : (int) Math.pow(n % 10, power) + getSum(n / 10, power);
}

public static int getDigitCount(int n) {
    return n == 0 ? 0 : 1 + getDigitCount(n / 10);
}

//last index of
public static void lastIndexOf(int[] arr,int el,int i, ArrayList<Integer> cpy,int k)
{
    if(i==arr.length)
    {
        return;
    }
    if(arr[i]==el)
    {
        cpy.add(i);
    }
     lastIndexOf(arr, el, i+1, cpy, k+1);
}

//replace value
public static void replace(int[] arr,int el,int r,int i)
{
    if(i==arr.length)
    {
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
        return ;
    }

    if(arr[i]==el)
    {
        arr[i]=r;
    }

    replace(arr,el,r,i+1);
}

//Given a String find the adjacent element if it is same as the previous element so replace the element with #.

public static String repadj(String str,int i,StringBuilder sb)
{
    if(i==sb.length())
    {
        //System.out.print(str);
        return sb.toString();
    }
    if(sb.charAt(i)==sb.charAt(i-1))
    {
        sb.replace(i,i+1,"#");
    }

    return repadj(str,i+1,sb);
}
public static void main(String[] args){
    //System.out.println(pow(12,2));
    //count0(102030,0);
    //System.out.println(sumofN(5,0));
    //System.out.println(series(3,0));
    //System.out.println(prime(17,2));
    //System.out.println(armstrong(372,3,0,371));
    //System.out.println(isArm(371));
     int[]arr={2,1,3,1,4,5,1,6};
    // ArrayList<Integer> cpy=new ArrayList<>();
    // lastIndexOf(arr, 1, 0, cpy, 0);
    //System.out.println(cpy.size()+" "+cpy.get(cpy.size()-1));
    int el=1;
    int r=0;
    // replace(arr,1,0,0);
    String str="aabc";
    StringBuilder sb= new StringBuilder(str);
    System.out.println(repadj(str,1,sb));
    
}


}








