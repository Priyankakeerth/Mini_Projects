package userfunctions;

import java.util.Scanner;

public class Atmfunctionprogram {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int password=12345;
		int Acc_balance=30500;
		System.out.println("Welcome to our Bank Sevice");
System.out.println("Please Enter your password:");
int userpassword=obj.nextInt();
int flag=0;
if(userpassword==password)
{

	while(flag==0)
	{
	//System.out.println("Password Match");
	System.out.println("Please choose your options");
    System.out.println("1.Cash withdrawal\n"+"2.Cash Deposit\n"+"3.Account Balance\n"+"4.Exit");
	int option=obj.nextInt();
	switch(option)
	{
	case 1:
		System.out.println("Enter withdrawal Amount");
		int withdraw_amount=obj.nextInt();
		System.out.println("You successfully withdrawn your amount:"+withdraw_amount);
		Acc_balance=Acc_balance-withdraw_amount;
		System.out.println("Account Balance:"+Acc_balance);
		break;
	case 2:
		System.out.println("Enter your Deposit Amount");
		int Deposit_amount=obj.nextInt();
		System.out.println("You Successfully Deposited"+Deposit_amount);
		Acc_balance=Acc_balance+Deposit_amount;
		System.out.println("Account Balance :"+Acc_balance);
		break;
	case 3:
	System.out.println(" Available Balance is");
	System.out.println(Acc_balance);
	System.out.println("Do you want receipt? \n Press 'Y'-Yes \n Press 'N'-No");
	char receipt=obj.next().charAt(0);
	if(receipt=='Y')
		System.out.println("Collect your receipt");
	else
		System.out.println("Thank for using ATM Services");
	break;
	case 4:
		flag=1;
		System.out.println("Thanks for using our ATM Service");
		break;
	}
		
		
}

}
else
{
	System.out.println("Invalid Password, Please try again later");
}
	}
}


