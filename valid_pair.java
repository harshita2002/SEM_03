import java.util.Scanner;
public class valid_pair 
{
	public static int parity_using_DLSB(int n)
	{
		int parity=0;
		while(n!=0)
		{
			parity^=1;
			n=n&(n-1);
		}
		return parity;
	}
	public static void main(String[] args) 
	{
		System.out.println(parity_using_DLSB(10));
		System.out.println(parity_using_DLSB(11));
	}
}
