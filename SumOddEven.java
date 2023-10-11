package lab7;

import java.util.Scanner;

public class SumOddEven {
	int evensum;
	int oddsum;
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	void calculation() {
		for (int i=0;i<n;i++) {
			if(i%2==0) {
				 evensum=evensum+i;
			}
			else {
				oddsum=oddsum+i;
			}
			SumOddEven s= new SumOddEven();
			s.calculation();
			System.out.println("Sum of even number in 1 to "+n+evensum);
			System.out.println("Sum of oddnumber in 1 to"+n+oddsum);
		}
		
	}
	

}
