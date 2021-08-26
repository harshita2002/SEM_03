import java.util.Scanner;

public class srtname 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string :");
        a = s.nextLine();
        int n = a.length();
        int sind=0;
		for(int i=0;i<n;i++)
		{
			b+=(char)(a.indexOf(sind)+32)+" ";
			sind++;
		}
		System.out.println("Short form is :"+b);
	}

}
