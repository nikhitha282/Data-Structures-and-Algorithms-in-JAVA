//Program to check if a number is happy using hash set

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
		sc.close();
	}
	
	public static boolean isHappy(int n) {
		
		Set<Integer> hashset = new HashSet<>();
		int sum = 0;
		
		while(sum != 1) {
			sum = sumOfDigits(n);
			
			if(sum==1) return true; //number is happy
			
			if(hashset.contains(sum)) return false; //avoids iterating infinitely
			else hashset.add(sum);
			
			n=sum;
			sum=0;
		}
		
		return false;
	}
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n != 0) {
			sum += (n%10)*(n%10);
			n/=10;
		}
		return sum;
	}
}
