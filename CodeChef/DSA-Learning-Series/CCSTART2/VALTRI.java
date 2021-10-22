import java.util.*;
import java.lang.*;
import java.io.*;

class VALTRI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		
		if(sc.hasNext()) a = sc.nextInt();
		
		if(a%5==0 || a%6==0) System.out.println("YES");
		else System.out.println("NO");
		
		sc.close();
	}
}
