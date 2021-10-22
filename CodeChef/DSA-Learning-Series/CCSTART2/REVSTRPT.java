import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {      //number of lines
		    for(int j=i; j>0; j--)     //number of stars in each line = number of the line
		        System.out.print("*"); //print each star
		        
		    System.out.println();      //go to next line
		}
	}
}
