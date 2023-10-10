package Operators;

import java.util.Scanner;

 class Checknumbers{
	 
	void Check() {
		Scanner sc =new Scanner(System.in);
		int a;
		a =sc.nextInt();
		//b=sc.nextInt();
		if(a>0)
		{
		 System.out.println( "It is a positive number");
		}
		else {
			System.out.println("It is a negative number");
		}
	}
	}
 public class Conditionals{
	 public static void main(String[] args) {
		 Checknumbers num =new Checknumbers();
		 num.Check();
		
	}
 }
 
 

