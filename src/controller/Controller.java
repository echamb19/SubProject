package controller;

import javax.swing.JOptionPane; 
import model.Sweater; 

public class Controller
{
	
	private Sweater userSweater;
	public void start()
	{
		info();
	}
	private void info()
	{
		boolean isValid = false; 
		
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
		userInput = JOptionPane.showInputDialog(null, "You need to type in a whole number.");
		
		if(validInt(userInput)) 
		{
			
			userSweater.setPockets(Integer.parseInt(userInput)); 
		}
		
		}
		
		// Test the Code 
		while(!isValid)
		{
			
		}
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false; 
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error) //Two things inside perens is formal parameter
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number. :)");
		}
		
		return isValid;
	}
}
