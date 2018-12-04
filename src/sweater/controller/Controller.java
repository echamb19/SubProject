package sweater.controller;

import javax.swing.JOptionPane;
import sweater.model.Sweater; 

public class Controller
{
	
	private Sweater userSweater;
	private Sweater[] sweaterArray;
	Sweater yourSweater = new Sweater();
	//Sweater mySweater = new Sweater();
	Sweater hisSweater = new Sweater();
	Sweater herSweater = new Sweater();
	private Sweater mySweater;
	
	
	public void start()
	{
		getInfo();
	}
	
	public Controller()
	{
		sweaterArray = new Sweater[4];
		
		sweaterArray[0] = yourSweater;
		sweaterArray[1] = mySweater;
		sweaterArray[2] = hisSweater;
		sweaterArray[3] = herSweater;
	}
	
	private void getInfo()
	{
	
		
		userSweater = new Sweater(); 
		
		String userInput = JOptionPane.showInputDialog(null, "What color is your sweater?");
		userSweater.setColor(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "Does your sweater have a zipper?"); 
		if (userInput.contains("true") || userInput.contains("yes") || userInput.contains("True") || userInput.contains("Yes"))
		{
			userSweater.setHasZipper(true);
		}
		
		userInput = JOptionPane.showInputDialog(null, "Does your sweater have a hood?");
		if (userInput.contains("true") || userInput.contains("yes") || userInput.contains("True") || userInput.contains("Yes"))
		{
			userSweater.setHasHood(true);
		}
		
		userInput = JOptionPane.showInputDialog(null, "How many pockets does your sweater have?");
		while(!validInt(userInput))
		{
			userInput = JOptionPane.showInputDialog(null, "How many pockets does your sweater have?");
		}
		userSweater.setPockets(Integer.parseInt(userInput)); 

		JOptionPane.showMessageDialog(null, "Your sweater is " + userSweater.getColor() + "." + "\nYou're sweater has a zipper? -->" + userSweater.getHasZipper() + "\nYour sweater has a hood? -->" + userSweater.getHasHood() + "\nYour sweater has " + userSweater.getPockets() + " pockets.");
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false; 
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error) //Two things inside parens is formal parameter
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number. :)");
		}
		
		return isValid;
	}
}
