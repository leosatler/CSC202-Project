package csc202project;

import java.util.ArrayList;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu implements CustLogin , AdminMenu{
	
	CustLogin myCustLogin;
	AdminMenu myAdminMenu;
	
	
	
	
	public MainMenu() {
		// TODO Auto-generated constructor stub
	}
	public void adminLogin() {
		AdminMenu.super.adminLogin();
	}
	public void custLogin() {
		CustLogin.super.custLogin();
	}


	public void menu() {
		
		Scanner Scan = new Scanner (System.in);
		boolean correct = false;
		while(correct==false) {
			System.out.println("------Main Menu------"
					+ "\n(select the number you want)"
					+ "***LOAD ITEM AND CUSTOMER DATA***"
					+ "\n1.) Load item data"
					+ "\n2.) Process the backlogged data"
					+ "\n3.) Log in as administrator"
					+ "\n4.) Log in as customer"
					+ "\n5.) Exit the application \n");
			int choice = Scan.nextInt();
			
			if(choice==1) {
				Item item = new Item();
				item.readText();
			}
			else if(choice==2) {
			
			}
			else if(choice==3) {
				adminLogin();
			}
			else if(choice==4) {
				custLogin();
			}
			else if(choice==5) {
				System.exit(0);
			}
			else {
				System.out.println("Your entered something incorrectly");
				
			}
			
		
			
		}
		
	}

}
