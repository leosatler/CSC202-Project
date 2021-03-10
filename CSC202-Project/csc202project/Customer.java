package csc202project;

public class Customer {
	private String name;
	private String password;
	private int id;
	private int nextNum = 000;
	
public Customer() {
	
}
public Customer(String n, String p) {
	name = n;
	password = p;
	id = nextNum;
	nextNum++;
}
	public String toString() {
		return name + "(ID: " + id + ")" + " is a valued customer! ";
}
	public String getName() {
		return name;
}
	public void setName(String name) {
		this.name = name;
}
	public String getPassword() {
		return password;
}
	public void setPassword(String password) {
		this.password = password;
}


}// end of blueprint