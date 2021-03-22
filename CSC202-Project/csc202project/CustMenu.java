package csc202project;

import java.util.ArrayList;
import java.util.Scanner;

public class CustMenu implements CustLogin {
	public void CustMenu(){
		Scanner scan = new Scanner (System.in);
		boolean correct = false;
		while(correct==false) {
			System.out.println("-----Customer Menu------"
					+ "\n1.) Check on active bids"
					+ "\n2.) Check winning bids"
					+ "\n3.) Bid on an item"
					+ "\n4.) Pay for a won item"
					+ "\n5.) Return to customer login menu");
			int choice = scan.nextInt();
		
		if(choice == 1) //Check on active bids
		{
			
		}
		else if(choice == 2) //Check on winning bids
		{
			
		}
		else if(choice == 3) //Bid on an item
		{
			
		}
		else if(choice == 4) //pay for an item
		{
			
		}
		else if (choice == 5) //return
		{
			this.custLogin();
			
		}
		else
		{
			System.out.println("You entered something incorrectly");
		}
				
		
	}
	}

}
