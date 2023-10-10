package com.edubridge;

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:-");
		String name= sc.next();
		System.out.println("Emter your Age"); 
		int age=sc.nextInt();
		System.out.println("Enter your salary:-"); 
		float salary=sc.nextFloat();
		System.out.println("Enter Your gender" ); 
		char Gender=sc.next().charAt(0);
		
		
		System.out.println("Employee Details ");
        System.out.println("Name = "+name);	
        System.out.println("Age ="+age);
        System.out.println("Salary ="+salary);
        System.out.println("Gender ="+Gender);
		
		
	}

}
