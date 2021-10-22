import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class SUMEVOD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		
    //Based of formulae of sum of first n odd numbers (n*n) and sum of first n even numbers (n*(n+1))
		System.out.println(
		    n.multiply(n) + " " +
		    n.multiply(n.add(BigInteger.ONE))
		    );
    
    //Below code works for smaller integers
		/*
		int n = sc.nextInt();
		
		int even = 0, odd = 0;
		
		for(int i=2; i<=2*n; i=i+2) {
		    even+= i;
		    odd+= i-1;
		}
		
		System.out.println(odd + " " + even);
    */
	}
}
