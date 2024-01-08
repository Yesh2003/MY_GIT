public class BinarySearchReccursion 
{
    public static void main(String[] args) 
    {
    int [] arr={10,20,30,40,50};
    int key =20;
    int s=0;
    int e=arr.length;
    int index= BSR(arr,key,s,e);
    System.out.println(index);
    }

    private static int BSR(int[] arr, int key, int s, int e) 
    {
        int mid=(s+e)/2;
        if(key==arr[mid])
        {
            return  mid;
        }
        else if (key<arr[mid]) 
        {
            return(BSR(arr, key, s, mid-1));
        }
        else
        {
             return(BSR(arr, key, mid+1, e));
        }

    }
}
