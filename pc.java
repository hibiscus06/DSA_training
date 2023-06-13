import java.util.ArrayList;

public class pc {

    //using ArrayList
   public static ArrayList<String> pc(String str)
   {
       if(str.length()==0)
       {
        ArrayList<String> l=new ArrayList<>();
        l.add("");
        return l;
       }

       char firstchar=str.charAt(0);
       ArrayList<String> finalList=new ArrayList<>(); //keep returning finalList 

       ArrayList<String> res=pc(str.substring(1));  //here we will get the result from previous value like - [bc,cb]
       for(String t:res)   //now we can add the first char let's say a to bc at 3 pos and to cb also at 3 pos
       {
            for(int i=0;i<=t.length();i++)
            {
                StringBuilder sb=new StringBuilder(t);
                sb.insert(i,firstchar);
                finalList.add(sb.toString());
            }
       }
       return finalList;
   }

//    public static void pc(String p,String up)
//    {
//        if(up.length()==0)
//        {
//            System.out.println(p);
//            return;
//        }

//        char firstchar=up.charAt(0);
//        for(int i=0;i<p.length();i++)
//        {
//         String f=p.substring(0,i);
//         String s=p.substring(i,p.length());
//         pc(f+firstchar+s,up.substring(1));
//        }

//    }

   public static void pc(String p,String up)
   {
       if(up.length()==0)
       {
           System.out.println(p);
           return;
       }

       char firstchar=up.charAt(0);
       for(int i=0;i<p.length();i++)
       {
        StringBuilder sb=new StringBuilder(p);
        sb.insert(i,firstchar);
        pc(sb.toString(),up.substring(1));
       }

   }

    public static void main(String[] args) {

        pc(" ","abc");
    }
}















