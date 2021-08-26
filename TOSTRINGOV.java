class conv
{
    int a;
    int r;
    conv(int a,int r)
    {
        this.a=a;
        this.r=r;
    }
        
    
    public void setage(int a)
    {
        this.a=a;
    }
    public void setroll(int r)
    {
        this.r=r;
    }
    
    public int getage()
    {
        return a;
    }
    public int getroll()
    {
        return r;
    }
    //overite to make it use and not give the reference
    public String toString()
    {
        return a+"  i"+r;
    }
}

public class TOSTRINGOV 
{
     public static void main(String[] args)
     {
         System.out.println(new conv(1,2));
        
    }
}
