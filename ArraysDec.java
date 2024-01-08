import java.util.Arrays;
import java.util.Scanner;

public class ArraysDec 
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int [] ar=new int[x];
     for(int i=0;i<ar.length;i++)
     {
        ar[i]=sc.nextInt();
     }
     //System.out.println(Arrays.toString(ar));
     int k[]=new int[4];
     int j=k.length;
     System.out.println(j);
     for(int i=0;i<k.length;i++)
       {
         k[(k.length)-1-i]=ar[i];          //
       }
     System.out.println(Arrays.toString(ar));
     System.out.println(Arrays.toString(k));
    }
}
