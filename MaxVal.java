public class MaxVal 
{
    public static void main(String[] args) 
    {
        //int arr[]=new int[5];
        int arr[]={1,2,3,4,5};
       int x= maximum(arr);
       System.out.println(x);
       


    }

    private static int maximum(int[] arr)
     {
       
        int max=arr[0];
        for (int i : arr) 
        {

            if(i>max)
            {
              max=i;
            }
        }
        return max;
    
        
}
}
