package csc202project;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


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
	
	
	
	
	public static BufferedReader openRead() {
		Frame f = new Frame();
		// decide from where to read the file
		FileDialog foBox = new FileDialog(f, "Pick location for reading your file", FileDialog.LOAD);
		System.out.println("The dialog box will appear behind Eclipse.  " + 
		      "\n   Choose where you would like to read from.");
		foBox.setVisible(true);
		// get the absolute path to the file
		String foName = foBox.getFile();
		String dirPath = foBox.getDirectory();

		// create a file instance for the absolute path
		File inFile = new File(dirPath + foName);
		if (!inFile.exists()) {
			System.out.println("That file does not exist");
			System.exit(0);
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(inFile));
		} catch (IOException e) {
			System.out.println("You threw an exception. ");
		}
		return in;

	}

	public static ArrayList<Item> readText() 
	{
		ArrayList<Item> item = new ArrayList<Item> ();
		
		BufferedReader in=openRead();
		try
		{
			
			// read in the first entire line from the file
			String line = in.readLine();
			
			// continue until the line is null (ie you are at the end of the file)
			while(line!=null)
			{
				// create a StringTokenizer instance that will break the line apart at each | symbols
				// NOTE: the second parameter is the symbols used to separate fields
				StringTokenizer t = new StringTokenizer(line,",");
				
				// check to see if it is the next customer number that we wrote at the end of the file
				// if it is, set the static num field to this value
				// but anything read from a text file is  text so we must convert it to the correct
				// data type (int).  Also trim off any blanks or the conversion will blow up
				//NOTE: YOU DO NOT NEED THE NEXT TWO LINES OR THE ELSE{} IF YOU DO NOT HAVE THE
				//STATIC NUMBER FOR THE ID.   JUST USE SIMILAR TO LINES 244-2509
				
					// it gets here if it is a Customer object.
					// the line in the text file looks like Mickey|Mouse|201 and will be broken into three parts
					// Now get each token and put it in a variable
					String n = t.nextToken().trim();
					double sc = Double.parseDouble(t.nextToken().trim());
					
					// create a Customer instance for the data
					Item c = new Item(n,sc);
					// add the instance to the ArrayList
					item.add(c);
				//}
				// read in the next line
				line=in.readLine();
			}
		}
		// catch any IOException that occurs
		catch (IOException io)
		{
			System.out.println("An IO Exception occurred");
			io.printStackTrace();
		}
		finally    // finally always runs no matter what so close the file here!
		{
			// close the file. Java is neurotic - it worried "but what if it is already closed?" so needs another try/catch 
			try{
			in.close();
			}
			catch (Exception e) {}   // note the {} - means "do nothing".  I wanted it closed anyway.
		}
		return item;
   	
	}
	static ArrayList<Item> item = readText();
	
	public static void print() {
	
		for (int i=0;i<item.size();i++)
			System.out.println(item.get(i).toString());
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