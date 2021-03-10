package csc202project;

public class Item {
	private String name;
	private double startingCost;
	

	public Item() {
	
}
	public Item(String n, double sc) {
		name = n;
		startingCost = sc;
}
	public String toString() {
		return "Item: " + name + " " + " Starting Price: $" + startingCost;
}
	public String getName() {
		return name;
}
	public void setName(String name) {
		this.name = name;
}
	public double getStartingCost() {
		return startingCost;
}
	public void setStartingCost(double startingCost) {
		this.startingCost = startingCost;
}

}// end of blueprint