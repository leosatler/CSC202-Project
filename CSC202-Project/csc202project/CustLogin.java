package csc202project;

import java.util.Scanner;

public interface CustLogin  {
	
	
	default void custLogin() {
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
				
			}
			else if(choice == 2) //Returning customer
			{
				
				
			}
			else if(choice == 3) //New customer
			{
				
				
			}
			else if (choice == 4) //return
			{
				MainMenu menu = new MainMenu();
				menu.menu();
			}
			else
			{
				System.out.println("You entered something incorrectly");
			}
		} //end of while
	}

}
