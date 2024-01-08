import java.util.Arrays;
import java.util.Scanner;

public class Arr2D
{
    public static void main(String a[])
    {
       int arr[][]=new int[3][2];
       Scanner sc=new Scanner(System.in);
    for(int rows=0;rows<arr.length;rows++)
    {
        for(int col=0;col<arr[rows].length;col++)
        {
            arr[rows][col]=sc.nextInt();
        }
    }
          for(int rows=0;rows<arr.length;rows++)
    {
        for(int col=0;col<arr[rows].length;col++)
        {
           System.out.print( arr[rows][col]+ " ");
           
        }
        System.out.print("\n");
    }
    }
}
