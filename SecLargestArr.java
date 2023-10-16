package lab10;

import java.util.Scanner;

public class SecLargestArr {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int Arr[]= {15,30,46,1,24,36};
	for(int i=0;i<Arr.length;i++) {
		for(int j=0;j<Arr.length-i-1;j++) {
			
			if (Arr[j] > Arr[j + 1]) {
                int temp = Arr[j];
                Arr[j] = Arr[j + 1];
                Arr[j + 1] = temp;
			}
		}
	
		
	}
	System.out.println(Arr[Arr.length-2]);

}
}