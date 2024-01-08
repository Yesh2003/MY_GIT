import java.util.Arrays;

public class Array2DSearch 
{
    public static void main(String[] args)
     {
        int arr[][]=
        {
        {10,20,30},
        {50,60,70},
        {90,100,120}
           
        };
        int key=70;
       int l[]= search2D(arr,key);
       System.out.println(Arrays.toString(l));
    }

    private static int[] search2D(int[][] arr, int key)
     {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
        if(key==arr[i][j])
           return new int[]{i,j};
        }
       }
    return null;
    }
}
