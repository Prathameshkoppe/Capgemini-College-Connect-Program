package Operators;

import java.util.Scanner;

class Bill {
	Scanner sc= new Scanner(System.in);
	String Cname;
	int Units;
	int rate;
	double Bill;
	double charge;
	void accept() {
		System.out.println("Enter name:");
		Cname=sc.next();
		System.out.println("Enter units:");
		Units=sc.nextInt();
		
		
	}
	void calculate() {
		if (Units <=100) {
			Bill=Units*2;
		charge=1;
		
	}else if(Units>100 && Units <=200) {
		Bill=(100*2)+(Units-100)*3;
		charge=1;
	}else if(Units >=300){
		Bill=(100*2)+(100*3)+(Units-200)*5;
		charge=0.025;

} else {System.out.println("Units not allowed in Negative");

}
	}
	void print() {
		System.out.println("Name of Coustomer:" + Cname);
		System.out.println("Units Consumed by Coustomer:"+ Units);
		System.out.println("Total Bill to Pay:"+(Bill*charge));
	}
}
public class ElectricBill{
	public static void main(String[] args) {
		Bill  B=new Bill();
		B.accept();
		B.calculate();
		B.print();
		
	}
	
}
