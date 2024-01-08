import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args)
     {
        int [] arr={5,4,3,2,1};
        selection(arr);
       System.out.println( Arrays.toString(arr));

    }

    private static void selection(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
          int end=arr.length-i-1;
          //System.out.println(end);
          int mi=  maxIndex(arr,end,0);
          swap(arr,mi,end);
        }
    }

    private static void swap(int[] arr, int mi,int end) 
    {
        int temp=0;
        temp=arr[mi];
        arr[mi]=arr[end];
        arr[end]=temp;


    }

    private static int maxIndex(int[] arr, int end,int start) 
    {    int max=start;
        for(int i=0;i<=end;i++)
        {
           if(arr[i]>arr[max])
           {
               max=i;
           }
        }
        return max;
    }
}
