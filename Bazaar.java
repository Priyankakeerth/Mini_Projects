package projects.org;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Bazaar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bazaar bb=new Bazaar();
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: "+date);
	    System.out.println("Month: "+ date.getMonth());
	    System.out.println("**************************");
	    System.out.println();
		System.out.println("Welcome to Big Bazaar");
Scanner sc=new Scanner(System.in);
System.out.println("Scan your Day");
String day=sc.next();
          if(day.equalsIgnoreCase("Wednesday"))
               {
               bb.method2();
               }
           else
              {
              bb.method1();
              }	
}

	private void method2() {
		System.out.println("Welcome to wednesday Offer");
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap();
		hm.put("Apple", 60);
		hm.put("Banana", 40);
		hm.put("Dhaal", 100);
		hm.put("Sugar", 70);
		hm.put("Rice", 30);
		hm.put("WashingPowder", 90);
		hm.put("Toothpaste", 45);
		System.out.println(hm);
		
	/*	for(Object ob:hm.entrySet())
		{
			Entry entry=(Entry)ob;
			System.out.println(entry.getKey()+" Price "+ entry.getValue());
			
		}*/
		TreeMap<String,Integer> tm=new TreeMap();  //for values returns
          for(int i=0;i<7;i++)
            {
		                  System.out.println("Enter your product");
		                  String Product=sc.next();
	                      boolean result=	hm.containsKey(Product);
	
	                      
	            if(result==true)
	               {
		               System.out.println("enter kg");
		               int Quantity=sc.nextInt();
	
		               int price=(Integer)hm.get(Product);
		
		               int total_price=Quantity*price;
		
		               tm.put(Product, total_price);
		              }
	            else
	                  {
		             System.out.println("Please enter Correctly");
		             break;
	                    }
	            //For continue next product
	                    System.out.println("Do you want to continue");
	                    char option=sc.next().charAt(0);
			           if(option=='y')
			                   {
				                   i++;
			                    }
			            else
				                  break;
                 }
System.out.println("Your Purchase is");
System.out.println(tm);
}

	private void method1() {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String,Integer> hm=new LinkedHashMap();
		hm.put("Apple", 120);
		hm.put("Banana", 80);
		hm.put("Dhaal", 200);
		hm.put("Sugar", 140);
		hm.put("Rice", 60);
		hm.put("Washing Powder", 180);
		hm.put("Toothpaste", 90);
		System.out.println(hm);
		
		TreeMap<String,Integer> tm=new TreeMap();  //for values returns
        for(int i=0;i<7;i++)
          {
		                  System.out.println("Enter your product");
		                  String Product=sc.next();
	                      boolean result=	hm.containsKey(Product);
	
	            if(result==true)
	               {
		               System.out.println("enter quantity");
		               int Quantity=sc.nextInt();
	
		               int price=(Integer)hm.get(Product);
		
		               int total_price=Quantity*price;
		
		               tm.put(Product, total_price);
		              }
	            else
	                  {
		             System.out.println("Please enter correct product");
	                    }
	            //For continue next product
	                    System.out.println("Do you want to continue");
	                    char option=sc.next().charAt(0);
			           if(option=='y')
			                   {
				                   i++;
			                    }
			            else
				                  break;
   }
System.out.println("Your Purchase is");
System.out.println(tm);

}
}