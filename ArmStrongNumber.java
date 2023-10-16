package lab10;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
		int num=i,d,result=0;
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter number:-");
		//num=sc.nextInt();
		int onum=num,n=0;
		
		
		while(num>0) {
			n++;
			num /=10;
		}
        
		num=onum;
		
		while(num>0) {
			d=num%10;
			result=(int)(result+Math.pow(d, n));
			num /=10;
			
		}
		
		if(onum==result) {
			System.out.println(onum);
		}/*else {
			System.out.println(onum+"is not armstrong number");
		}*/
	}
	}

}