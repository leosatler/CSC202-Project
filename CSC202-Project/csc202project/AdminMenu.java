package csc202project;

import java.util.ArrayList;
import java.util.Scanner;

public interface AdminMenu  {
	default void adminLogin() {
		Scanner scan = new Scanner(System.in);
		boolean correct = false;
		while(correct == false)
		{
			System.out.println("-----Administrator Login------"
					+ "\n1.) Log in as admin Mason Spillman"
					+ "\n2.) Log in as admin Leo Rosa"
					+ "\n3.) Log in as admin Thomas Helvey"
					+ "\n4.) Return to main menu");
			int choice = scan.nextInt();
			if(choice == 1) // loads Mason
			{
				boolean leave = false;
				
				while(leave == false)
				{
					System.out.println("Enter Mason's password (type exit to leave)");
					String password = scan.next();
					
					if (password.equals("Mason"))
					{
						System.out.println("Welcome admin Mason");
						menu();
					}
					
					else if (password.equalsIgnoreCase("exit"))
					{
						leave = true;
					}
					
					else
					{
						System.out.println("You entered the wrong password");
					}
				}
			}
			
			else if(choice == 2) // loads Leo
			{
				boolean leave = false;
				
				while(leave == false)
				{
					System.out.println("Enter Leo's password (type exit to leave)");
					String password = scan.next();
					
					if (password.equals("Leo"))
					{
						System.out.println("Welcome admin Leo");
						menu();
					}
					
					else if (password.equalsIgnoreCase("exit"))
					{
						leave = true;
					}
					
					else
					{
						System.out.println("You entered the wrong password");
					}
				}
				
			}
			else if(choice == 3) { // loads Thomas
				boolean leave = false;
				
				while(leave == false)
				{
					System.out.println("Enter Thoma's password (type exit to leave)");
					String password = scan.next();
					
					if (password.equals("Thomas"))
					{
						System.out.println("Welcome admin Thomas");
						menu();
					}
					
					else if (password.equalsIgnoreCase("exit"))
					{
						leave = true;
					}
					
					else
					{
						System.out.println("You entered the wrong password");
					}
				}
			}
			else if (choice == 4) 
			{
				MainMenu menu = new MainMenu();
				menu.menu();
				System.out.println("Returning to main menu");
				correct = true;
			}
			
			else
			{
				System.out.println("You entered something incorrectly");
			}
		} //end of while
		
		
		
	} //end of adminLogin
	
	public static void menu()
	{
		Scanner scan = new Scanner(System.in);
		boolean correct = false;
		while(correct == false)
		{
			System.out.println(
					"\n-----Administrator Menu------"
					+ "\n1.) List current ongoing auctions"
					+ "\n2.) Choose an ongoing auction and check the bidding history"
					+ "\n3.) List information about completed auctions"
					+ "\n4.) Summary data of winning bids"
					+ "\n5.) Add and activate a new auction"
					+ "\n6.) Return to main menu");
			int choice = scan.nextInt();
			
			if(choice == 1) //List current ongoing auctions
			{
				
				Item item = new Item();
				item.print();
			}
			else if(choice == 2) //Choose an ongoing auction and check the bidding history
			{
				//checkOngoingAuction();
			}
			else if(choice == 3) //list info on complete auctions
			{
				//listInfoCAuction();
			}
			else if(choice == 4) //summary of data on winning bids
			{
				//summaryBidData();
			}
			else if(choice == 5) //add and activate a new auction
			{
				//addAuction();
			}
			else if (choice == 6) //return
			{
				MainMenu menu = new MainMenu();
				menu.menu();
				System.out.println("Returning to main menu");
				correct = true;
			}
			else
			{
				System.out.println("You entered something incorrectly");
			}
		} //end of while
		
		
		
	} //end of adminMenu
	
	

}
