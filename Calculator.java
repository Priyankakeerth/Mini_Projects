package projects.org;

import java.util.Scanner;

public class Calculator {
	
	int storageno;
	
	static int num,num2;

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		 num=sc.nextInt();
		System.out.println("Enter your second number");
		num2=sc.nextInt();
		int storageno;
		int i=0;
		while(true)
//		for(int i=0;i<7;i++)
		{
		System.out.println("Choose your option");
		System.out.println("1.Addition\n"+ "2.Subtraction\n" + "3.Multiplication\n"+ "4.Division\n");
		int input=sc.nextInt();
		
		if(input==1)
		{
			obj.addition();
			System.out.println("Do you want to proceed");
			char in=sc.next().charAt(0);
			if(in=='y')
		i++;
			else if(in=='n')
			{
				System.out.println("Thank You");
				break;
			
			}
		}
		if(input==2)
		{
			obj.subtraction();
			System.out.println("Do you want to proceed");
			char in=sc.next().charAt(0);
			if(in=='Y')
			i++;
			else if(in=='n')
			{
				System.out.println("Thank You");
				break;
			}
			
			
		
	}
 if(input==3)
{
	obj.multiplication();
	System.out.println("Do you want to proceed");
	char in=sc.next().charAt(0);
	if(in=='y')
		i++;
	else if(in=='n')
	{
		System.out.println("Thank You");
		break;
	}
	
}
 if(input==4)
	{
		obj.dividion();
		System.out.println("Do you want to proceed");
		char in=sc.next().charAt(0);
		if(in=='y')
		{
			i++;
		}
		else if(in=='n')
		{
			System.out.println("Thank You");
			break;
		
		}
		
	
	}
	}



		
	}


	private void dividion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the second number");
		int scn=sc.nextInt();
		storageno=storageno/scn;
		System.out.println("Division of two numbers: "+storageno);
		
	}


	private void multiplication() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the second number");
		int scn=sc.nextInt();
		storageno=storageno*scn;
		System.out.println("Multiplication of two numbers: "+storageno);
		
		
	}


	private void subtraction() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the second number");
		int scn=sc.nextInt();
	storageno=storageno-scn;
		System.out.println("Subtraction of two numbers: ");
		System.out.println(storageno+ "- "+scn+" "+ "=" +storageno);
		
		
	}
private void addition()
	{
		//Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your first number");
//		int num1=sc.nextInt();
//		System.out.println("Enter your second number");
//		int num2=sc.nextInt();
		System.out.println("Addition of two numbers" );
		storageno=num+num2;
		System.out.println(num+ "+ "+num2+" "+ "=" +storageno);
	}
	

}
