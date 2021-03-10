package csc202project;

import java.util.ArrayList;

import java.util.Scanner;

public class AuctionDriver {

		public static void main(String[] args) 
		{
			ArrayList<Item> itemList = new ArrayList();
			ArrayList<Admin> adminList = new ArrayList();
			ArrayList<Customer> custList = new ArrayList();
			mainMenu(itemList, adminList, custList);
			System.out.println("\nBye!!!!!");
			System.exit(0);
			
			
		} //end of main

		public static void mainMenu(ArrayList<Item> itemList, ArrayList<Admin> adminList, ArrayList<Customer> custList) {
			Scanner scan = new Scanner(System.in);
			boolean correct = false;
			while(correct == false)
			{
				System.out.println("------Main Menu------"
					+ "\n(select the number you want)"
					+ "***LOAD ITEM AND CUSTOMER DATA***"
					+ "\n1.) Load item data"
					+ "\n2.) Process the backlogged data"
					+ "\n3.) Log in as administrator"
					+ "\n4.) Log in as customer"
					+ "\n5.) Exit the application \n");
				int initial = scan.nextInt();
			
			
				if(initial == 1) { //load sample data
					loadItems(itemList);
					
				} 
				else if(initial == 2) { //Process the backlogged data
					processBacklog();
					
				}
				else if(initial == 3) { //log in as administrator
					adminLogin(adminList);
					
				}
				else if(initial == 4) { //log in as customer
					customerLogin(custList, itemList);
					
					
				} //end of customer menu choice
				else if(initial == 5) { //exit the application
					break;
					
				}
				else {
					System.out.println("You entered something incorrectly\n");
					correct = false;
				}
			} //end of while
		}
		public static void customerLogin(ArrayList<Customer> custList, ArrayList<Item> itemList) {
			Scanner scan = new Scanner(System.in);
			boolean correct = false;
			while(correct == false)
			{
				System.out.println("-----Customer Login------"
						+ "\n1.) Load customers"
						+ "\n2.) Returning customer"
						+ "\n3.) New customer"
						+ "\n4.) Return to main menu");
				int choice = scan.nextInt();
				if(choice == 1) { //loads customers
					loadCust(custList);
				}
				else if(choice == 2) //Returning customer
				{
					boolean bool = false;
					if(returningCustSearch(custList) == true) {
						System.out.println("Would you like to access the customer menu? (true/false)");
						bool = scan.nextBoolean();
						if(bool == true) {
							customerMenu(itemList, custList);
						}
						else {
							System.out.println("Returning to login menu... ");
							
						}
					}
					else {
						System.out.println("Login failed! ");
					}
					
				}
				else if(choice == 3) //New customer
				{
					addCust(custList);
					
				}
				else if (choice == 4) //return
				{
					System.out.println("Returning to main menu...\n");
					correct = true;
				}
				else
				{
					System.out.println("You entered something incorrectly");
				}
			} //end of while
		} //end of customerLogin
		
		public static int customerMenu(ArrayList<Item> itemList, ArrayList<Customer> custList) {
			Scanner scan = new Scanner(System.in);
			boolean correct = false;
			while(correct == false)
			{
				System.out.println("-----Customer Menu------"
						+ "\n1.) Check on active bids"
						+ "\n2.) Check winning bids"
						+ "\n3.) Bid on an item"
						+ "\n4.) Pay for a won item"
						+ "\n5.) Return to customer login menu");
				int choice = scan.nextInt();
				
				if(choice == 1) //Check on active bids
				{
					viewActiveBids();
				}
				else if(choice == 2) //Check on winning bids
				{
					viewWinningBids();
				}
				else if(choice == 3) //Bid on an item
				{
					bidOnItem(itemList, custList);
				}
				else if(choice == 4) //pay for an item
				{
					payForItem();
				}
				else if (choice == 5) //return
				{
					System.out.println("Returning to customer login menu...");
					return choice;
				}
				else
				{
					System.out.println("You entered something incorrectly");
				}
			} //end of while
			return 0;
		} //end of customerMenu
		
		public static void adminLogin(ArrayList<Admin> adminList) {
			Scanner scan = new Scanner(System.in);
			boolean correct = false;
			while(correct == false)
			{
				System.out.println("-----Administrator Login------"
						+ "\n1.) Load administrators"
						+ "\n2.) Returning administrator"
						+ "\n3.) Access admin menu"
						+ "\n4.) Return to main menu");
				int choice = scan.nextInt();
				if(choice == 1) // loads admins
				{
					loadAdmin(adminList);
				}
				
				else if(choice == 2) //Returning admin
				{
					returningAdminSearch(adminList);
					
				}
				else if(choice == 3) {
					adminMenu();
				}
				else if (choice == 4) //return
				{
					System.out.println("Returning to main menu");
					correct = true;
				}
				else
				{
					System.out.println("You entered something incorrectly");
				}
			} //end of while
		} //end of adminLogin
		
		public static void adminMenu() {
			Scanner scan = new Scanner(System.in);
			boolean correct = false;
			while(correct == false)
			{
				System.out.println("-----Administrator Menu------"
						+ "\n1.) List current ongoing auctions"
						+ "\n2.) Choose an ongoing auction and check the bidding history"
						+ "\n3.) List information about completed auctions"
						+ "\n4.) Summary data of winning bids"
						+ "\n5.) Add and activate a new auction"
						+ "\n6.) Return to main menu");
				int choice = scan.nextInt();
				
				if(choice == 1) //List current ongoing auctions
				{
					listCurrentAuctions();
				}
				else if(choice == 2) //Choose an ongoing auction and check the bidding history
				{
					checkOngoingAuction();
				}
				else if(choice == 3) //list info on complete auctions
				{
					listInfoCAuction();
				}
				else if(choice == 4) //summary of data on winning bids
				{
					summaryBidData();
				}
				else if(choice == 5) //add and activate a new auction
				{
					addAuction();
				}
				else if (choice == 6) //return
				{
					System.out.println("Returning to main menu");
					correct = true;
				}
				else
				{
					System.out.println("You entered something incorrectly");
				}
			} //end of while
		} //end of adminMenu
		public static void loadItems(ArrayList<Item> itemList) {
			itemList.add(new Item("Couch", 200));
			itemList.add(new Item("King Sized Bed", 250));
			itemList.add(new Item("Cloud's Buster Sword", 23000));
			itemList.add(new Item("Stand Arrow", 69000));
			itemList.add(new Item("Korok Seed", 50));
			itemList.add(new Item("Jotaro's Hat", 175));
			itemList.add(new Item("Fly that landed on Mike Pence", 690));
		
		}
		public static void loadAdmin(ArrayList<Admin> adminList) {
			adminList.add(new Admin("Admin", "Admin"));
		}
		public static void bidOnItem(ArrayList<Item> itemList, ArrayList<Customer> custList) {
			Scanner scan = new Scanner(System.in);
			double currentHighest = 0;
			double finalAmt = 0;
			double currentBid = 0;
			int choice = 0;
			int custChoice = 0;
			int inc = 1;
			boolean bool = true;
			Item item = null;
			if(itemList.isEmpty()) {
				System.out.println("All items have been sold! Please check in another time.");
			}
			else {
			System.out.println("Choose which item you would like to bid on: \n");
			for(int i = 0; i < itemList.size(); i++) {
				System.out.println(inc++ + ".) "+ itemList.get(i).getName() + " starting at $" + itemList.get(i).getStartingCost());
			}// end of for loop
			choice = scan.nextInt();
			choice = choice - 1;
			System.out.println(itemList.get(choice).getName() + " is the item chosen.");
			item = itemList.get(choice);
			while(bool == true) {
				System.out.println("Select customer to bid: \n\n" + "1.) Tommy Helvey\n2.) Mason Spillman\n3.) Leo Rosa\n4.) Dr. Wolff\n");
				custChoice = scan.nextInt();
				custChoice = custChoice - 1;
				Customer cust = custList.get(custChoice);
				System.out.println(cust.getName() + " is the person bidding. \n\n Please enter an amount you want to increment the starting price by: ");
				currentBid = scan.nextDouble();
				currentHighest = item.getStartingCost() + currentBid;
				item.setStartingCost(currentHighest);
				System.out.println(cust.getName() + " added the amount of $" + currentBid + ". Current highest bid: $" + currentHighest + "\n");
				System.out.println("More bids? (true/false) ");
				bool = scan.nextBoolean();
				if(bool == false) {
					System.out.println(item.getName() + " sold for $" + currentHighest + " to the lucky winner " + cust.getName() + "!!\n");
					System.out.println("Removing item from the stock... \n");
					itemList.remove(choice);
				}
				
			}// end of while loop
			}//end of else
		}// end of method
		public static void loadCust(ArrayList<Customer> custList) {
			custList.add(new Customer("Tommy Helvey", "twh"));
			custList.add(new Customer("Mason Spillman", "ms"));
			custList.add(new Customer("Leo Rosa", "lr"));
			custList.add(new Customer("Dr. Wolff", "baseball"));
		}
		public static boolean returningCustSearch(ArrayList<Customer> custList) { // This method searches through the loop and tries to find the customer
			Scanner scan = new Scanner(System.in);
			String password = null;
			System.out.println("Enter your name: \n(Tommy Helvey, Leo Rosa, Mason Spillman for testing)\n");
			String custName = scan.nextLine();
			for(int i = 0; i < custList.size(); i++) {
				if(custList.get(i).getName().equalsIgnoreCase(custName) != true) {
					System.out.println("Searching...");
				}
				else if(custList.get(i).getName().equalsIgnoreCase(custName) == true) {
					System.out.println(custList.get(i).getName() + " found.\n");
					System.out.println("Enter your password: \n(twh, lr, ms for testing)\n");
					password = scan.nextLine();
					if(custList.get(i).getPassword().equals(password) == true) {
						System.out.println("Welcome back, " + custList.get(i).getName() + "\n");
						return true;
					}
					else {
						System.out.println("Incorrect password.\n");
						return false;
					}
				}
				else {
					System.out.println(custName + " was not found.");
				}
			}// end of for loop
			return false;
		}
		public static boolean returningAdminSearch(ArrayList<Admin> adminList) {
			Scanner scan = new Scanner(System.in);
			String password = null;
			System.out.println("Enter your name: \n(Admin for testing)\n");
			String custName = scan.nextLine();
			for(int i = 0; i < adminList.size(); i++) {
				if(adminList.get(i).getName().equalsIgnoreCase(custName) != true) {
					System.out.println("Searching...");
				}
				else if(adminList.get(i).getName().equalsIgnoreCase(custName) == true) {
					System.out.println(adminList.get(i).getName() + " found.");
					System.out.println("Enter your password: \n(Admin for testing)\n");
					password = scan.nextLine();
					if(adminList.get(i).getPassword().equals(password) == true) {
						System.out.println("Welcome back, " + adminList.get(i).getName());
						return true;
					}
					else {
						System.out.println("Incorrect password.");
						return false;
					}
				}
				else {
					System.out.println(custName + " was not found.");
				}
			}// end of for loop
			return false;
		}
		
		
		
		// -------METHOD STUBS-------
		public static void processBacklog() {
			
		}
		public static void addCust(ArrayList<Customer> custList) {
			
		}
		public static void viewActiveBids() {
			
		}
		public static void viewWinningBids() {
			
		}
		public static void payForItem() {
			
		}
		public static void listCurrentAuctions() {
			
		}
		public static void checkOngoingAuction() {
			
		}
		public static void listInfoCAuction() {
			
		}
		public static void summaryBidData() {
			
		}
		public static void addAuction() {
			
		}
		
	} //end of code
