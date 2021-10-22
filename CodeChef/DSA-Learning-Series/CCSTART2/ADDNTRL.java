import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class ADDNTRL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		
		BigInteger sum = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.ONE.add(BigInteger.ONE)); //n(n+1)/2 using BigInteger
		
		System.out.println(sum);
		
		sc.close();
	}
}
