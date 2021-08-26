import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Random_sample 
{
	public static void randomSampling(int k,List<Integer>A)
	{
		Random gen=new Random();
		for(int i=0;i<k;++i)
		{
			Collections.swap(A, i, i+gen.nextInt(A.size()-i));
		}
		System.out.println(A.subList(0, k));
	}
	static List <Integer>list=new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(11);
		randomSampling(3,list);
	}
}
