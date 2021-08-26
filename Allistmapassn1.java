import java.util.ArrayList;
import java.util.Scanner;

public class Allistmapassn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();
		System.out.println("Add all 5 elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;++i)
			ar.add(s.nextInt());
		System.out.println(ar.sort());

	}

}
