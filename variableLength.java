import java.util.Arrays;
public class variableLength 
{
    public static void main(String[] args) 
    {
         fun(1,2,3,4,5,6,7,8,9);
    }
    static void fun(int ... v)                           // variable length Arguments
    {
         System.out.println (Arrays.toString(v));
        for (int i : v) 
        {
          // System.out.println (Arrays.toString(v));
            System.out.println(i);
        }
    }
}