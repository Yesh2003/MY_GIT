public class StringPalindrome
 {
    public static void main(String[] args)
    {
      /*   String s1="Yeshwanth";
        String s2="Yeshwanth";
        System.out.println(s1);           //Strings are immutable
        System.out.println(s2);
        s2="saiYeshwanth";
        System.out.println(s1);
        System.out.println(s2);
                                 
        */

         /* 
          String s1=new String("Yeshwanth");
           String s2=new String("Yeshwanth");
           System.out.println(s1.equals(s2));
        
           */

        String str="level";
        System.out.println( ispalindrome(str));
          
    }

    public static boolean ispalindrome(String s)   
    {
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            char start=s.charAt(i);
            char end=s.charAt(s.length()-i-1);
            if(start==end)
            {
                return true;
            }
        }
        return false;
    } 
}
