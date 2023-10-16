package lab10;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int b=sc.nextInt();
		int sum=0;
		
		int a[]=new int[b];
		
		System.out.println("Enter"+b+"Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			}
		System.out.println("Elements of array are");
		for(int i=0; i<b;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}System.out.println("Sum of array is :"+sum);
		
	} 


}

