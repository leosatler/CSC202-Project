package csc202project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class ProjectGUI extends JFrame implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel password;
	private static JPasswordField passText;
	private static JButton loginB;
	private static JLabel success;
	private static ImageIcon imageIcon;
	private static ImageIcon background;
	
	//GUI for Bidding Project
	ProjectGUI(){
	imageIcon = new ImageIcon("auction.jpg");
	background = new ImageIcon("greyback.jpg");
	JPanel panel = new JPanel();
	
	this.setTitle("Bidding Wars");
	this.setSize(720,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(panel);
	this.setIconImage(imageIcon.getImage());
	panel.setLayout(null);
	
	
	
	
	userLabel = new JLabel("User: ");
	userLabel.setBounds(200,100,80,25);
	panel.add(userLabel);
	
	userText = new JTextField(20);
	userText.setBounds(280,100,165,25);
	panel.add(userText);
	
	password = new JLabel("Password: ");
	password.setBounds(200,140,80,25);
	panel.add(password);
	
	passText = new JPasswordField();
	passText.setBounds(280,140,165,25);
	panel.add(passText);
	
	loginB = new JButton("Login");
	loginB.setBounds(320,180,80,25);
	loginB.addActionListener(new GUITester());
	panel.add(loginB);
	
	success = new JLabel("");
	success.setBounds(210,205,300,25);
	panel.add(success);
	//success.setText(text);
	
	this.setVisible(true);
	
	
	
	
	
	
	}

	

	public static JLabel getUserLabel() {
		return userLabel;
	}

	public static void setUserLabel(JLabel userLabel) {
		ProjectGUI.userLabel = userLabel;
	}

	public static JTextField getUserText() {
		return userText;
	}

	public static void setUserText(JTextField userText) {
		ProjectGUI.userText = userText;
	}

	public static JLabel getPassword() {
		return password;
	}

	public static void setPassword(JLabel password) {
		ProjectGUI.password = password;
	}

	public static JPasswordField getPassText() {
		return passText;
	}

	public static void setPassText(JPasswordField passText) {
		ProjectGUI.passText = passText;
	}

	public static JButton getLoginB() {
		return loginB;
	}

	public static void setLoginB(JButton loginB) {
		ProjectGUI.loginB = loginB;
	}

	public static JLabel getSuccess() {
		return success;
	}

	public void setSuccess(JLabel success) {
		this.success = success;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
