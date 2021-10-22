import java.util.*;
import java.lang.*;
import java.io.*;

class RNGEODD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int l = 0, r = 0;
		String out = "";
		
		if(sc.hasNext()) l = sc.nextInt();
		if(sc.hasNext()) r = sc.nextInt();
		
		if(l%2 == 0) //if lower bracket is even
		    for(int i = l+1; i <= r; i = i+2) //start from next number
		        System.out.print(i + " ");
		else
		    for(int i = l; i <= r; i = i+2) //else, start directly
		        System.out.print(i + " ");  
		
		sc.close();
	}
}
