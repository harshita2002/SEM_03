class complex{
    double real;
    double img;
    complex(double real,double img){
        this.img=img;
        this.real=real;

    }
   public String toString()
    {
        return real+" i"+img;

    }
}

public class EQUALSFORCOMPLEXNUM 
{
    public static void main(String[] args) {
        complex c1 =new complex(10.2, 2.0);
        complex c2 =new complex(10.2, 2.0);
        if(c1.equals(c2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        //it gives false because it compares the reference of the classes objects
    }
}
