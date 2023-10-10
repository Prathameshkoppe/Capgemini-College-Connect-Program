package lab6;

import java.util.Scanner;

public class Area {
	Scanner  sc = new Scanner(System.in);
	
	
	void square() {
		System.out.println(" Enter length:");
		double A=sc.nextDouble();	
		System.out.println("Area is :"+ (A*A));
	}
	void rectangle() {
		System.out.println(" Enter length:");
double A=sc.nextDouble();
		double B=sc.nextDouble();
	
		System.out.println("Area is :"+ (A*B));
		
	}
	void triangle() {
		System.out.println(" Enter length:");
double A=sc.nextDouble();
		double B=sc.nextDouble();
	
		System.out.println("Area is :"+ ((1/2)*A*B));
	}
	void circle() {
		System.out.println(" Enter radius:");
double A=sc.nextDouble();
		
	
		System.out.println("Area is :"+ ((A*A)*3.14));
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Select the Operation");
		System.out.println("1:Square");
		System.out.println("2:rectangle");
		System.out.println("3:triangle");
		System.out.println("4:circle");
		
		int X= sc.nextInt();
	
		Area a= new Area();
	
		switch(X) {
		case 1: {a.square();
		
		}
		break;
		case 2:{a.rectangle();
		}
		break;
		case 3:{a.triangle();
		
	}
		break;
		case 4:{
			a.circle();
		}
		default :{
			System.out.println("Invalid input");
		}
}
	}}
	
