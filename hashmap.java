import java.util.HashMap;

public class hashmap 
{
    public static void main(String args[]) 
    {
        HashMap<Integer, String> hm =new HashMap<Integer,String>();
        hm.put(123, "abc");
        hm.put(124, "pqr");
        hm.put(125, "xyz");
        for(Integer key:hm.keySet())
        {
            System.out.println(key+" "+hm.get(key));
        }
        hm.entrySet().forEach(s->System.out.println(s.getKey()+" "+s.getValue()));

        
    }
    
}
