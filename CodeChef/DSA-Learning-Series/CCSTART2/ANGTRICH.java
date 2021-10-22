import java.util.*;
import java.lang.*;
import java.io.*;

class ANGTRICH
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		if(sc.hasNext()) a = sc.nextInt();
		if(sc.hasNext()) b = sc.nextInt();
		if(sc.hasNext()) c = sc.nextInt();
		
		if(a+b+c==180 && a!=0 && b!=0 && c!=0) System.out.println("YES");
		else System.out.println("NO");
	}
}
