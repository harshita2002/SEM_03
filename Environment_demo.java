import java.util.Map;

public class Environment_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getenv("PATH"));//Gets the value of the key path
		System.out.println(System.getenv("USERNAME"));
		System.out.println(System.getenv("TEMP"));
		Map<String,String> env=System.getenv();
		for(String envName:env.keySet()) 
		{
			System.out.format("%s=%s%n", envName,env.get(envName));
		}
		
		String s=new String();
		

	}

}
