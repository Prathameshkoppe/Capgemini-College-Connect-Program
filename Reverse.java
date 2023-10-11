package lab7;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
	
	Scanner  sc = new Scanner(System.in);
	int n=sc.nextInt();
	String s= Integer.toString(n);
	int a=s.length();
	 int res=0;
	    int mod;
	   for(int i=a;i>0;i--) {
	        mod = n%10;
	        res=res*10+mod;
	        n = n/10;
	        
	   }
	     System.out.println(res); 
	
	  
	        
	

}
	}
