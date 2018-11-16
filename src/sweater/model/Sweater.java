package sweater.model;

public class Sweater
{
	// V Gives variables existence. V
	private String color;
	private boolean hasZipper; 
	private boolean hasHood; 
	private int pockets; 
	
	
	/**
	 * This is the default constructor for the Sweater. It initializes variables to valid values and allows for later customization. 
	 */
	public Sweater()
	{
		this.color = "COLOR of Pizza";
		this.hasZipper = false; 
		this.hasHood = false; 
		this.pockets = 0; 
	}
	
	
	
	/**
	 * Initializes the stuff with values for the stuff. 
	 * @param color
	 * @param hasZipper
	 * @param hasHood
	 * @param pockets
	 */
	public Sweater(String color, boolean hasZipper, boolean hasHood, int pockets)
	{
		this.color = color; 
		this.hasZipper = hasZipper; 
		this.hasHood = hasHood; 
		this.pockets = pockets; 
	}
	
	// V Getters V
	public String getColor()
	{
		return color; 
	}
	public boolean getHasZipper()
	{
		return hasZipper; 
	}
	public boolean getHasHood()
	{
		return hasHood;
	}
	public int getPockets()
	{
		return pockets; 
	}
	
	// V Setters V 
	public void setColor (String color)
	{
		this.color = color;
	}
	public void setHasZipper (boolean hasZipper)
	{
		this.hasZipper = hasZipper; 
	}
	public void setHasHood (boolean hasHood)
	{
		this.hasHood = hasHood; 
	}
	public void setPockets (int pockets)
	{
		this.pockets = pockets;
	}
}
