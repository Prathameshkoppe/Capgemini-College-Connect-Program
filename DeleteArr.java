package lab10;

import java.util.Scanner;

public class DeleteArr {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Arr[]= {10,20,30,40,50};
		int key=sc.nextInt();
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]==30) {
				Arr[i]=Arr[i+1];
			}
			
		}
	for(int i=0;i<Arr.length;i++) {
		System.out.println(Arr[i]);
	}
	}
}
