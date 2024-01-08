import java.util.Scanner;

public class Pattrens 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int row=1;row<=x;row++)
        {
            for(int col=1;col<=row;col++)
            {
              //  System.out.print(row);
                System.out.print("*");
            }
            System.out.println();
        }
       for(int row=1;row<=x;row++)
        {
            for(int col=1;col<=(x-row+1);col++)
            {
                //System.out.print(col);
                System.out.print("*");
            }
            System.out.println();
        }
        

       
    }
}
