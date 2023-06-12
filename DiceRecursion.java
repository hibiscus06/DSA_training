import java.util.ArrayList;

class DiceRecursion{

    public static ArrayList<String> dicegame(String p,int goal)
    {
        if(goal==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> arr=new ArrayList<>();

        for(int i=1;i<=6 && i<=goal; i++)
        {
            arr.addAll(dicegame(p+i,goal-i));
        }

        return arr;

    }
    public static void main(String[] args) {
       System.out.println(dicegame(" ",3));
    }
}





