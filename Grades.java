package lab6;


import java.util.Scanner;
public class Grades
{
    public static void main(String [] args)
  {  System.out.println("Enter the Marks of S1-");
  Scanner sc=new Scanner(System.in);
   int A =sc.nextInt();
  

 if(A>=0 && A <=100)
{if(A > 80 && A<100)
{
System.out.println("Grade is A");
}
else if(60<A && A<69)
{
System.out.println("Grade is B");
}
else if(40<A && A<59)
{
System.out.println("Grade is C");
  }


else if (A<39)
{
System.out.println("Grade is Fail ");
}

  
}
else{
  System.out.println("Invalid input");
}

  }
}
