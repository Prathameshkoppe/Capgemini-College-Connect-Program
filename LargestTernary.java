package Operators;

import java.util.Scanner;

public class LargestTernary {
	public static void main(String[] args) {
		int n1,n2,n3,n4,l;
		Scanner sc = new Scanner(System.in);
		n1 =sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		
		//l=(n1>n2 && n1>n3)?n1: (n2>n3 && n2>n1)?n2:n3;
		l=(n1>n2 && n1>n3 && n1>n4)?n1: (n2>n3 && n2>n1 && n1>n4)?n2:(n3>n1 && n3>n2 && n3>n4)?n3:n4;
		System.out.println("The largest of "+n1+ " and " +n2+ " is " +l);
	}

}
