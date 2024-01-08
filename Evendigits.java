public class Evendigits 
{
    public static void main(String[] args) {
        int arr[] = {12, 20, 30, 80, 23,90};
        int c=0;
       
        System.out.println("Numbers with even digits:");
        for (int i = 0; i < arr.length; i++) 
        { int m=0;
           m=Even_show(arr[i]);
           if(m==2)
           {
            c=c+1;
           }
        }
        System.out.println(c);
    }

    private static int Even_show(int x) {
        int count = 0;

        // Count the number of digits in x
        while (x > 0) 
        {
            int rem = x % 10;
            count++;
            x = x / 10;
        }
        return count;
       
        
    }
}

