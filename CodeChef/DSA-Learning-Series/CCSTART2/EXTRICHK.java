import java.util.*;
import java.lang.*;
import java.io.*;

class EXTRICHK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		if(sc.hasNext()) a = sc.nextInt();
		if(sc.hasNext()) b = sc.nextInt();
		if(sc.hasNext()) c = sc.nextInt();
		
    //Check if it is a triangle: Sum of two sides always greater than third side
		if(a+b>c && b+c>a && c+a>b) {
		    if(a==b && b==c && c==a) System.out.println("1");
		    else if(a==b || b==c || c==a) System.out.println("2");
            else if(a!=b && b!=c && c!=a) System.out.println("3");
		}
		else System.out.println("-1");
		
		sc.close();
	}
}
