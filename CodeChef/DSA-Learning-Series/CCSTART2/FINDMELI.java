import java.util.*;
import java.lang.*;
import java.io.*;

class FINDMELI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0, k = 0, i = 0, flag = -1;
		
		if(sc.hasNext()) n = sc.nextInt();
		if(sc.hasNext()) k = sc.nextInt();
		
		while(sc.hasNext() && i < n) {
		    if(sc.nextInt() == k)
		        flag = 1;
		    i++;
		}
		
		System.out.println(flag);
		    
	}
}
