package projects.org;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class EB_bill {
	
	
	//method for commercial
	private void commercial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to commercial Tarif");
		System.out.println();
		System.out.println("Enter the Unit");
		int unit=sc.nextInt();
		
		if(unit>0 && unit<=50)
		{
			int per_unitvalue=6;
			System.out.println("Fixed charges for 0-50kw: 100/kW/Month");
			//int units=100;
			int payable_amount=unit*per_unitvalue;
			System.out.println("This month payable unit is "+payable_amount+" rs");
			
		}
			else if(unit>=51 && unit<=112)
			{
				float per_unitvalue=9.5f;
				System.out.println("Fixed charges for 51-112KW: 300/kW/Month");
				//int units=300;
				float payable_amount= unit*per_unitvalue;
				System.out.println("This month payable unit is "+payable_amount+ " rs");
			}
			else if(unit>=112)
			{
				float per_unitvalue=9.5f;
				System.out.println("Fixed charges for above 112kw: 550/kW/Month");
				//int units=550;
				float payable_amount=unit*per_unitvalue;
				System.out.println("This month payable unit is "+payable_amount+ " rs");
			}
	
		
	}
		
	
              //main method
		public static void main(String[] args) {
			EB_bill eb=new EB_bill();
	
			Scanner sc=new Scanner(System.in);
			System.out.println("EB Bill Calculation");
			System.out.println("-----------------");
			LocalDate date = LocalDate.now();
			System.out.println("Current Date: "+date);
		    System.out.println("Month: "+ date.getMonth());
		    
			System.out.println("***********************************");
			System.out.println();
			eb.method1();
			
			//while(true)
			for(int i=0;i<5;i++)
			{
			System.out.println("Do you want to continue");
			String op=sc.next();
		  
	         if (op.equalsIgnoreCase("yes")) {
	          
	           eb.method1();
	
	         } else if (op.equalsIgnoreCase("no")) {
	           System.out.println("Thank you");
	           i=6;
	         }
			}
		
	
		

	}

	private void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type Option:1.Commercial\t 2.House\t3.Agriculture\t4.Huts\t");
		String select=sc.next();
		if(select.equalsIgnoreCase("commercial"))
			
		{
			commercial();
			
		}
		else if(select.equalsIgnoreCase("huts"))
		{
			System.out.println("Fixed charges for All: 	300/Service/month");
		}
		else if(select.equalsIgnoreCase("agriculture"))
		{
			System.out.println("Fixed charges for All: 3250/HP/Annum");
		}
			
		
		else if(select.equalsIgnoreCase("house"))
				{
			
				//Looping for  Eb_Home
		for(int j=0;j<6;j++)
		{
			System.out.println("Options");
		System.out.println(" 1.Person-in_home\n 2.Door-locked\n 3.Meter-not-working\n 4.Cash-Depoist\n 5.Exit\n");
		System.out.println("Press the number for your options");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			
			System.out.println("Enter your previous month reading");
			int pre_reading=sc.nextInt();
			System.out.println("Enter your current month reading");
			int current_reading=sc.nextInt();
			
			//exception possible if we entered - units  wrongly
			int reading=current_reading-pre_reading;
			
		       	try
			       {
				         if(reading<0)
				          {
					      //userdefined Exception
					     throw new WronglyEnteredException(reading);
				          }
		          	}
                    //Exception catch-area
			
			    catch(WronglyEnteredException e)
				{
				System.err.println("Error:current reading must be higher than previous reading ");
					System.err.println("Enter correct reading");
				}
		   
		
	System.out.println("Reading is "+reading+" Units");
    int freeunit=100;
	
//condition for Units 
if(reading>=0 && reading<=500)
			
{
				//Slabwise Calculation
			   //0-100=   o unit   rate0
				//101-200 100 2.25
				//201-400  200 4.5
				//401-500 100 6
			     if(reading<=100)
				{
					//0-100=   100 unit   rate=0
					System.out.println("No need to pay");
					System.out.println("free unit is "+freeunit);
				}
			     else if(reading>=101 &&reading<=200)
				{
					//0-100=   100unit   rate0
					//101-200 100 2.25
					int last=reading-100;
					double total=(last*2.25);
					System.out.println("Payable amount is "+total+ "Rs");
					
				}
			     else if(reading>=201&&reading <=400)
				{
					//0-100=   o unit   rate0
					//101-200 100 2.25
					//201-400  200 4.5
					
					int last=reading-200;
					double total=((100*2.25)+(last*4.5));
					System.out.println("Payable amount is "+total+ "Rs");
				}
			     else if(reading>=401&&reading <=500)
				{
					//0-100=   o unit   rate0
					//101-200 100 2.25
					//201-400  200 4.5
					//401-500 100 6
					
					int last=reading-400;
					double total=((100*2.25)+(200*4.5)+(last*6));
					System.out.println("Payable amount is "+total+ "Rs");
				}
				
	}
	
 if(reading>=501 && reading<=1000)
			
 {
				//above >500 unit slab wise calculation
			 if(reading<=600)
					{
						//0-100=100 0
						//101-400 =300 4.5
						//401-500=100 6
						//501-600=100 8
						//or
						//501-550 =50 8
								int last=reading-500;
						double tot=((300*4.5)+(100*6)+(last*8));
						System.out.println("Payable amount is "+tot+ "Rs");
					}
					
			 else if(reading>=601&& reading<=800)
					{
						//0-100=100 0
						///101-400 =300 4.5
						//401-500=100 6
						//501-600=100 8
						//601-800=200 9
						//or
						//600-750 =150
								int last=reading-600;
						double tot=((300*4.5)+(100*6)+(100*8)+(last*9));
						System.out.println("Payable amount is "+tot+ "Rs");
					}
			 else if(reading>=801&& reading<=1000)
					{	
						//0-100=100 0
						//101-400 =300 4.5
						//401-500=100 6
						//501-600=100 8
						//601-800=200 9
						//801-1000=200 10
						//or
						//800-950 =150  
					
						int last=reading-800;
						double tot=((300*4.5)+(100*6)+(100*8)+(200*9)+(last*10));
						System.out.println("Payable amount is "+tot+ "Rs");
					}
					
				
	}

if(reading>=1001)
{
				//0-100=100 0
					//101-400 =300 4.5
					//401-500=100 6
					//501-600=100 8
					//601-800=200 9
					//801-1000=200 10
				 //1000> 11
					//or
				 int last=reading-1000;
					double tot=((300*4.5)+(100*6)+(100*8)+(200*9)+(200*10)+(last*11));
					System.out.println("Payable amount is "+tot+ "Rs");
}
            System.out.println("--------------------------------------");
            break;			
case 2:
			System.out.println("Enter your previous month EB-bill amount");
			int prebill=sc.nextInt();
			System.out.println("Your payable amount for this month: "+prebill+"Rs");
			System.out.println("--------------------------------------");
			break;
			
case 3:
			System.out.println("Enter your last 6 month bill-amount");
			int[] cc=new int[6];
			int max=0;
            for(int i=0;i<cc.length;i++)
			{
				cc[i]=sc.nextInt();
				if(cc[i]>max)
				{
					max=cc[i];
				}
				
			}
           System.out.println("You have to pay "+max +" rs for this month");
			
		System.out.println("--------------------------------------");
			
			break;
case 4:
			System.out.println("Enter your past 6 month paid amount");
			int[] ccc=new int[6];
			int total=0;
			for(int i=0;i<ccc.length;i++)
			{
				ccc[i]=sc.nextInt();
				total=total+ccc[i];
			}
			System.out.println("Total Eb-bill amount for last year "+total+" Rs");
			int value=total/12;
			int deposit_value=value*3;
			System.out.println("Your deposit value for this year "+deposit_value+" Rs");
			System.out.println("--------------------------------------");
			break;
case 5:
		       
			System.out.println("You are exited from House option");
			//System.out.println("Thank you!");
			j=6;
		    break;
		
	}
		
	}
}
		
}
}
