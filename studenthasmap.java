import java.util.HashMap;
import java.util.LinkedList;

public class studenthasmap 
{
    public static void main(String args[]) 
    {   
        LinkedList<String> l1 =new LinkedList<String>();
        l1.add("e");
        LinkedList<String> l2 =new LinkedList<String>();
        l2.add("q");
        LinkedList<String> l3 =new LinkedList<String>();
        l3.add("p");

        HashMap<Integer, LinkedList<String>> hm =new HashMap<Integer,LinkedList<String>>();
        hm.put(6,l1);
        hm.put(5,l2);
        hm.put(4,l3);
        for(Integer key:hm.keySet())
        {
            System.out.println(key+" "+hm.get(key));
        }        
    }
    
}
