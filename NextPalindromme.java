package lab8;

import java.util.Scanner;

public class NextPalindromme{
	
	
	public static void main(String[] args) { 
	
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int c=num;
		
		String s= Integer.toString(num);
		int n=s.length();
		
		int count=0;
		for (int i=1;i<=n; i++) {
			int digit=num%10;
			count=(count*10)+digit;
			num=num/10;
		}
		
		
	}
	
	}
	
		
	

}