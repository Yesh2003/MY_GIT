import java.util.*;
public class ArrayListEX


{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
    
   ArrayList<Integer>list=new ArrayList<>();
  // list.add(67);
  // list.add(78);
  // list.set(0, 91);
   
  for(int i=0;i<5;i++)
  {
     list.add(sc.nextInt());
  }
   //System.out.println(list.size());
   //System.out.println(list);
   Collections.sort(list);
   
for(int i=0;i<list.size();i++)
 {
    System.out.print(list.get(i)+" ");
   
}
   } 
}
