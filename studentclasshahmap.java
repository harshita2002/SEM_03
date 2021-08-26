import java.util.HashMap;
import java.util.LinkedList;

class student1
{
    String name;
    int a;
    String branch;
    Double mark;
    student1(String name,int a,Double mark,String branch)
    {
        this.name=name;
        this.a=a;
        this.mark=mark;
        this.branch= branch;
    }
        
    
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int a)
    {
        this.a=a;
    }
    public void setmark(Double mark)
    {
        this.mark=mark;
    }
    public void setbranch(String branch)
    {
        this.branch= branch;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return a;
    }
    public Double getmark()
    {
        return mark;
    }
    public String getbranch()
    {
        return branch;
    }
    
    public String toString()
    {
        return "name-"+name+"age-"+a+"mark"+mark+"branch"+branch;
    }
}
public class studentclasshahmap
{
 
    public static void main(String args[]) 
    {
        LinkedList<student1> t1=new LinkedList<student1>();
        t1.add(new student1("a",6,6.0,"cse"));
        LinkedList<student1> t2=new LinkedList<student1>();
        t2.add(new student1("b",3,4.1,"cse"));
        LinkedList<student1> t3=new LinkedList<student1>();
		t3.add(new student1("c",3,5.0,"cse"));
        HashMap<Integer, LinkedList<student1>> hm =new HashMap<Integer,LinkedList<student1>>();
        hm.put(6,t1);
        hm.put(5,t2);
        hm.put(4,t3);
        for(Integer key:hm.keySet())
        {
            System.out.println(key+" "+hm.get(key));
        }        
    }
}
