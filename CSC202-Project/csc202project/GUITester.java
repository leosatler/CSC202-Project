package csc202project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITester implements ActionListener  {
	
	
	public static void main(String[] args) {
		
		ProjectGUI gui =new ProjectGUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 	String user = ProjectGUI.getUserText().getText();
			String pass = ProjectGUI.getPassText().getText();
			System.out.println(user + ", " + pass);
			
			if(ProjectGUI.getUserText().getText().equalsIgnoreCase("admin") && ProjectGUI.getPassText().getText().equalsIgnoreCase("admin")) {
				ProjectGUI.getSuccess().setText("Login Successful");
			}
			else
				ProjectGUI.getSuccess().setText("Incorrect Username or Password");
		
	}

	
		
	}

	


