import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Random_permutation 
{
	public static List<Integer> computeRandomPermutation(int n)
	{
		List<Integer>permutation=new ArrayList<>(n);
		for(int i=0;i<n;++i)
		{
			permutation.add(i);
		}
		randomSampling(permutation.size(),permutation);
		return permutation;
	}
	public static void randomSampling (int k,List<Integer> A)
	{
		Random gen=new Random();
		for(int i=0;i<k;++i)
		{
			Collections.swap(A,i,i+gen.nextInt(A.size()-i));
		}
	}
	public static void main(String[] args) 
	{
		List<Integer>res=computeRandomPermutation(10);
		System.out.println(res);
	}
}
