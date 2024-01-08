import java.util.Scanner;

public class Pattren2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int row=1;row<=x;row++)
        {
            int rs=x-row;
            for(int s=0;s<rs;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }

    }
}
