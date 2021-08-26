import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomSubset 
{
	public static List<Integer>randomSubset(int n,int k)
	{
		Map<Integer,Integer> changedElements=new HashMap<>();
		System.out.println(changedElements);
		Random randldxGen=new Random();
		for (int i=0;i<k;++i)
		{
			int randldx=i+randldxGen.nextInt(n-i);
			Integer ptr1=changedElements.get(randldx);
			Integer ptr2=changedElements.get(i);
			System.out.println(changedElements);
			if(ptr1==null && ptr2==null)
			{
				changedElements.put(randldx,i);
				changedElements.put(i,randldx);
			}
			else if(ptr1==null && ptr2!=null)
			{
				changedElements.put(randldx,ptr2);
				changedElements.put(i,randldx);
			}
			else if(ptr1!=null && ptr2==null)
			{
				changedElements.put(i,ptr1);
				changedElements.put(randldx,i);
			}
			else
			{
				changedElements.put(i,ptr1);
				changedElements.put(randldx,ptr2);
			}
		}
		List<Integer> result = new ArrayList<>(k);
		for(int i=0;i<k;++i)
		{
			result.add(changedElements.get(i));
		}
		System.out.println(changedElements);
		return result;
	}
	public static void main(String[] args) 
	{
		List<Integer>res=randomSubset(10,4);
		System.out.println(res);
	}
}