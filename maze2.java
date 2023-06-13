import javax.swing.plaf.synth.SynthSplitPaneUI;

public class maze2 {

    public static void maze(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.print(p+",");
            return;
        }
        
        if(r>1)
        {
            maze(p+"D",r-1,c);
        }
        
        if(c>1)
        {
            maze(p+"R",r,c-1);
        }
        
    }

    public static void mazed(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.print(p+",");
            return;
        }

        if(r>1 && c>1)
        {
            maze(p+"W",r-1,c-1);
        }
        
        if(r>1)
        {
            maze(p+"D",r-1,c);
        }
        
        if(c>1)
        {
            maze(p+"R",r,c-1);
        }

        
    }


    public static void main(String[] args) {
        mazed(" ",3,3);
        System.out.println();
        //maze(" ",3,3);
    }
}
