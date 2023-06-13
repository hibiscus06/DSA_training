import java.util.ArrayList;

public class subseq {
    
    static ArrayList<String> sub (String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> l=new ArrayList<>();
        l.add("");
        return l;
        }
        
        char firstchar=str.charAt(0);
        ArrayList<String> finalList=new ArrayList<>();
        ArrayList<String> arr=sub(str.substring(1));
        for(String t:arr)
        {
            finalList.add(t); //not include
            finalList.add(firstchar+t); //include
        }

        return finalList;
    }

    static void sub(String p,String up)
    {
        if(up.length()==0)
        {
            System.out.print(p+",");
            return;
        }

        char firstchar=up.charAt(0);
        
            sub(p+firstchar,up.substring(1)); //include 
            sub(p,up.substring(1));  //not include
        
    }

    public static void main(String[] args) {
        //System.out.println( sub("abc"));
        sub(" ","abc");
       
    }
}








