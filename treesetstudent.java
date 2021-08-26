import java.util.Comparator;
import java.util.*;
//making student class.
class student
{
    String name;
    int a;
    int r;
    student(String name,int a,int r)
    {
        this.name=name;
        this.a=a;
        this.r=r;
    }
        
    
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int a)
    {
        this.a=a;
    }
    public void setroll(int r)
    {
        this.r=r;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return a;
    }
    public int getroll()
    {
        return r;
    }
    public String toString()
    {
        return "name-"+name+"age-"+a+"rooll"+r;
    }
}
class mycomp implements Comparator<student>
{
   
    public int compare(student s1,student s2)
    {
        Integer a=s1.r;
        Integer b=s2.r;
        return a.compareTo(b);
    }
}
public class treesetstudent
{
	public static void main(String[] args) 
	{
		TreeSet<student> t=new TreeSet<student>(new mycomp());
		t.add(new student("a",6,6));
		t.add(new student("b",3,4));
		t.add(new student("c",3,5));
	    t.forEach(s-> System.out.println(s.toString()+"\n"));
		
		
	}
}