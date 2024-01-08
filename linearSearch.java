import java.util.Scanner;

public class linearSearch 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int key=6;
        //sc.nextInt();
        int [] ar=new int[x];
        for(int i=0;i<ar.length;i++)
       {
        ar[i]=sc.nextInt();
       }
       int l=LS(ar,key);
       System.out.println(l);
       
    }

    private static int LS(int[] ar,int key)
     {
        int i=0;
        int m=0;
        for(i=0;i<ar.length;i++)
        {
            if(key==ar[i])
            {
                 m=i;
            }
         
        }
        return m;
       
    }
}
