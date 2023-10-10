package com.edubridge;

import java.util.Scanner;

class Employee{
	
	String name;
	int Age;
	float Salary;
	char Gender;
	void inputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:-");
	 name= sc.next();
	System.out.println("Emter your Age"); 
	 Age=sc.nextInt();
	System.out.println("Enter your salary:-"); 
	 Salary=sc.nextFloat();
	System.out.println("Enter Your gender" ); 
    Gender=sc.next().charAt(0);
}
void displayData(){
	System.out.println("Employee Details ");
    System.out.println("Name = "+name);	
    System.out.println("Age ="+Age);
    System.out.println("Salary ="+Salary);
    System.out.println("Gender ="+Gender);
	
}
}

public class MainappEncapsulation {
	public static void main(String[] args) {
		Employee gd=new Employee();
		gd.inputData();
		gd.displayData();
		
	}
	

}
