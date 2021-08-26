class student23
{
    String name;
    int a;
    int r;
    student23(String name,int a,int r)
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
    public boolean equals(student23 s1 )
    {
        if(s1==this)
        {
            return true;
        }
        if(s1==null)
        return false;
        if((s1.name==this.name)&&(s1.r==this.r)&&(s1.a==this.a))
        {return true;}
        else{return false;}
    }
}
public class stuclassequal 
{
    public static void main(String[] args) 
    {
        student23 s1 = new student23("a",6,6);
        student23 s2 = new student23("a",5,6);
        if(s1.equals(s2))
        {
            System.out.println("equal");

        }
        else
        {
            System.out.println("false");
        }


    }
    
}
