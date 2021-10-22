import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
		
		  int n = sc.nextInt();
		  int[] arr = new int[n+1];
	    int count = 0;
	    
      //Loop only until square root of n
	    int i = (int)Math.floor(Math.sqrt(n));
	    
      //filling only at index where factor is present - enables easy printing in ascending order
	    while(i>0) {
	        if(n%i == 0) {
	            arr[i] = i;     //first factor
	            arr[n/i] = n/i; //second factor
	            count+=2;       //count of number of factors
	        }
	        i--;
	    }
	    
	    if(Math.sqrt(n) == Math.floor(Math.sqrt(n)))
	        System.out.println(count-1); //for perfect square, one factor is counted twice (squareroot)
	    else
	        System.out.println(count);
	        
	    for(int j=1; j<n+1; j++)
	        if(arr[j]!=0)
	            System.out.print(j + " ");
	        
		  sc.close();
	}
}
