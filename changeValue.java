import java.util.Arrays;

public class changeValue 
{
    public static void main(String[] args) 
    {
       int arr[]={10,20,30,40};
       changing c=new changing();

       c.change(arr);
       System.out.println( Arrays.toString(arr));     

    }
}
class changing
{
     void change(int l[])   //for complex data types like arrays refernce will be passed in java
    {
        l[0]=99;
    }
}

