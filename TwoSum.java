package lab10;

import java.util.Scanner;

class Solution {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num[]=new int[4];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int target=sc.nextInt();


        for(int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                if(num[i]+num[j]==target){
                    
                    System.out.println("["+num[i]+num[j]+"]");
                }
                else 
                {
                    System.out.println();
                }
            }
        }
        
    }
}