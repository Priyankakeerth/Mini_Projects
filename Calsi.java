package projects.org;

import java.util.Scanner;

public class Calsi {
	static int result,num1,num2;
	
private int adition()
{
	result=num1+num2;
	System.out.println("Addition of two number ");
	System.out.println(num1+ " "+ "+" +" " +num2+ " ="+ " "+ result);
	return result;
	
}
private int subtraction()
{
	result=num1-num2;
	System.out.println("Subtraction of two number");
	System.out.println(num1+ " "+ "-" +" " +num2+ " ="+ " "+ result);
	return result;
}
private int multiplication()
{
	result=num1*num2;
	System.out.println("Multiplication of two number");
	System.out.println(num1+ " "+ "*" +" " +num2+ " ="+ " "+ result);
	return result;
}
private int Division()
{
	result=num1/num2;
	System.out.println("Division of two number");
	System.out.println(num1+ " "+ "/" +" " +num2+ " ="+ " "+ result);
	return result;

}
static void repeated()
{
	Scanner sc=new Scanner(System.in);
	int i=0;
while(true)
	{
	System.out.println("Choose your option");
	System.out.println("1.Addition\n"+ "2.Subtraction\n" + "3.Multiplication\n"+ "4.Division\n");
	int input2=sc.nextInt();
	 if(input2==1)
	{
		System.out.println("Enter the second number");
		int secno=sc.nextInt();
	    System.out.println("Addition of previous number and newno");
		System.out.println(result=result+secno);
		
	}
	
	else if(input2==2)
	{
		System.out.println("Enter the second number");
		int secno=sc.nextInt();

		System.out.println("Subtraction of previous number and newno");
		System.out.println(result=result-secno);
			}
	else if(input2==3)
	{
		System.out.println("Enter the second number");
		int secno=sc.nextInt();
		System.out.println("Multiplication of previous number and newno");
		System.out.println(result=result*secno);
			}
	else if(input2==4)
	{
		System.out.println("Enter the second number");
		int secno=sc.nextInt();
		System.out.println("Division of previous number and newno");
		System.out.println(result=result/secno);
		
	}
	 System.out.println("do you want to proceed");
		int in=sc.next().charAt(0);
		if(in=='y')
		{
	i++;
		}
		else if(in=='n')
		{System.out.println("Thank you");
			break;
		}
}
}
	public static void main(String[] args) {
		Calsi cc=new Calsi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Calculator\n");
		System.out.println("Enter your first number");
		 num1=sc.nextInt();
		System.out.println("Enter your second number");
		num2=sc.nextInt();

	for(;true;)
	{
		System.out.println("Choose your option");
		System.out.println("1.Addition\n"+ "2.Subtraction\n" + "3.Multiplication\n"+ "4.Division\n");

		int input=sc.nextInt();
		if(input==1)
		{
			 result=cc.adition();
			 	
		}
		else if(input==2)
			 {
				 result=cc.subtraction();	 
			}
			 else if(input==3)
			 {
		
		result =cc.multiplication();
				
			}
			 else if(input==4)
			 {
			result =cc.Division();
			 }
		System.out.println("do you want to proceed with previous result");
		int in=sc.next().charAt(0);
		if(in=='y')
		{
			
			repeated();		
		}
		else if(in=='n')
		{
			System.out.println("Thank you");
			break;
		}
		
	}

	}

}
