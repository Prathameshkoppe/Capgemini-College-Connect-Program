package lab10;

import java.util.Scanner;

public class InsertElementArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {10,20,30,40,50,60};
		
		int position=sc.nextInt();
		int number= sc.nextInt();
		arr[position-1]= number;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	
	

}
