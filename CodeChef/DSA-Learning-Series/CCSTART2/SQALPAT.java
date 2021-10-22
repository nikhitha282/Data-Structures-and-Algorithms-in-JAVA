import java.util.*;
import java.lang.*;
import java.io.*;

class SQALPAT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
		    if(i%2 == 0) { //for lines 2,4,6,..
		        for(int k=0; k>-5; k--)
		            System.out.print(i*5+k+ " ");
		    }
	    	else { //for lines 1,3,5,..
		        for(int j=-4; j<1; j++)
		            System.out.print(i*5+j+ " ");
		    }
		    System.out.println();
		}		
	}
}
