// create a function to find the sum of the digits of a number.Invoke the execution.

import java.util.Scanner;

public class sum_of_digit 
{
	static void Sumdigit(int n)
	{
	int sum=0;
	int r=0;
	while (n>0)
	{
		r=n%10;
		sum+=r;
		n=n/10;
	}
	System.out.println("sum");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sumdigit(234);
	}

}


/*public class FileSeparator
{
	
}*/
