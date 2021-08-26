import java.util.HashSet;
import java.util.Scanner;

public class remove_1 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        String a =sc.next();
        sc.close();
        char b[] = a.toCharArray();
        HashSet<Character> chra=new HashSet<Character>();
        for(int i =0;i<b.length;i++)
        {
            chra.add(b[i]);
        }
        for(Character n:chra)
        {
            System.out.print(n);
        }

        
    }
    
}
