import java.util.*;
import java.lang.*;
import java.io.*;

class SECLAR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc = new Scanner(System.in);
		
	    int a = 0, b = 0, c = 0, max = 0;
	    
	    if(sc.hasNext()) a = sc.nextInt();
	    if(sc.hasNext()) b = sc.nextInt();
	    if(sc.hasNext()) c = sc.nextInt();
	    
	    max = Math.max(a, b);
	    if (max == Math.max(b, c)) max = Math.max(a, c); //if max(a,b) == max(b,c), then second largest number is max(a,c)
	    else max = Math.min(max, Math.max(b, c)); //else max is min of max(a,b) and max(b,c)
	    		
	    System.out.println(max);
	    
	    sc.close();
	}
}
