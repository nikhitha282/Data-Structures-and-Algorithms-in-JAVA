import java.util.*;
import java.lang.*;
import java.io.*;

class ISBOTH
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNext()) n = scanner.nextInt();
		
		if(n%55 == 0) System.out.println("BOTH");
		else if(n%5 == 0 || n%11 == 0) System.out.println("ONE");
		else System.out.println("NONE");
    
    scanner.close();
	}
}
