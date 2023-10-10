package lab6;

import java.util.Scanner;

public class Evenodd {
	

		int num;
		Scanner sc=new Scanner(System.in);
		void getData() {
			num=sc.nextInt();
			
		}
		public int display() {
			if ( num%2==0) {
				return 0;
			}
			else 
				return 1;
		}
		
		public static void main(String[] args) {
			
			
			Evenodd oddEven=new Evenodd();
			oddEven.getData();
			switch (oddEven.display()) {
			
			case 0:
				System.out.println("the number is even");
				break;
				
			case 1:
				System.out.println("the number is odd");
				break;
				
				default:
					System.out.println("Invalid data");
					
			}
		}

	}


