import java.util.*;
import java.lang.*;
import java.io.*;

class BUYPLSE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a = 0, b = 0, x = 0, y = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNext())
		    a = Integer.parseInt(scanner.next());
		if(scanner.hasNext())
		    b = Integer.parseInt(scanner.next());
		if(scanner.hasNext())
    		x = Integer.parseInt(scanner.next());
        if(scanner.hasNext())
    		y = Integer.parseInt(scanner.next());
		
		System.out.print(a*x+b*y);
		
		scanner.close();
		
	}
}
