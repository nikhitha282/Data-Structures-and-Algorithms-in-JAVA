import java.util.*;
import java.lang.*;
import java.io.*;

class REVMEE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		while(i<n)
		    arr[i++] = sc.nextInt();

		while(--i>=0)
		    System.out.print(arr[i] + " ");
		
		sc.close();
	}
}
