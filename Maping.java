package projects.org;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Maping {

	 static Map<String, Double> itemPrices = new HashMap<>();
	 static Map<String, Double> itemDiscounts = new HashMap<>();
	 static HashMap<String, Double> bill = new HashMap<>();
	 static Date d = new java.util.Date();
	

	

	
	

		 public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);

		  System.out.println("Welcome to the PAYILAGAM Supermarket!");
		  System.out.println("----------------------------");

		  initializeItemPrices();

		  System.out.println(itemPrices);
		  double totalAmount = 0.0;
		  String itemName;

		  do {
		   System.out.println("Enter item name or enter 'exit' to exit: ");

		   itemName = scanner.nextLine();

		   if (!itemName.equalsIgnoreCase("exit")) {
			   
		    if (itemPrices.containsKey(itemName)) {
		    	
		    	
		     double itemPrice = itemPrices.get(itemName);
		     System.out.print("Enter quantity: ");
		     int quantity = scanner.nextInt();
		     scanner.nextLine(); // Consume the newline character

		     double itemTotal = itemPrice * quantity;
		     totalAmount += itemTotal;
		     bill.put(itemName, itemTotal);
		     // System.out.println("Total price for " + itemName + ": $" + itemTotal);
		    } else {
		     System.out.println("Item not found!");
		    }
		   }
		  } while (!itemName.equalsIgnoreCase("exit"));

		  System.out.println("----------------------------");
		  Set s = bill.entrySet();
		  for (Object o : s) {
		   Entry entry = (Entry) o;
		   String item = (String) entry.getKey();
		   double price = (double) entry.getValue();
		   System.out.println(item + "=" + price);
		  }

		  System.out.println("Total amount: INR " + totalAmount);
		  System.out.println("Thank you for shopping with us!");
		 }

		 private static void initializeItemPrices() {
		  // Initialize item prices

		  if (d.getDay() == 6) {
		   System.out.println("SALE !!! Special Discount on Wednesday ");
		   itemPrices.put("Apple", (double) 5);
		   itemPrices.put("Banana", (double) 4);
		   itemPrices.put("Oil", (double) 120);
		   itemPrices.put("Sugar", (double) 80);
		   itemPrices.put("Rice", (double) 60);
		   itemPrices.put("Dhall", (double) 120.50);
		   itemPrices.put("Tamarind", (double) 160.70);
		   itemPrices.put("Maggie", (double) 15.50);

		  } else {
		   itemPrices.put("Apple", (double) 10);
		   itemPrices.put("Banana", (double) 8);
		   itemPrices.put("Oil", (double) 110);
		   itemPrices.put("Sugar", (double) 80);
		   itemPrices.put("Rice", (double) 60);
		   itemPrices.put("Dhall", (double) 120.50);
		   itemPrices.put("Tamarind", (double) 80.70);
		   itemPrices.put("Maggie", (double) 15.50);
		  }
		  
		 }
//method closing
		 
		

	}


