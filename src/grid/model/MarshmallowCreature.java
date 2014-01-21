package grid.model;

public class MarshmallowCreature
{
	
	private String name;
	private int numberOfEyes;
	private int numberOfLegs;
	private int numberOfArms;
	private boolean singleButton;
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setNumberOfEyes (int numberOfEyes)
	{
		this.numberOfEyes = numberOfEyes;
	}

	public void setNumberOfLegs (int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}
	
	public void setNumberOfArms (int numberOfArms)
	{
		this.numberOfArms = numberOfArms;
	}
	
	public void setsingleButton (boolean singleButton)
	{
		this.singleButton = singleButton;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public int getNumberOfEyes ()
	{
		return numberOfEyes;
	}
	
	public int getNumberOfLegs ()
	{
		return numberOfLegs;
	}
	
	public int getNumberOfArms ()
	{
		return numberOfArms;
	}
	
	public boolean getSingleButton ()
	{
		return singleButton;
	}
	
	/**
	 * Default constructor - should not be used to make a MarshmallowCreature.
	 */
	
	public MarshmallowCreature()
	{
		name = "nameless";
		numberOfArms = -1;
		numberOfEyes = -1;
		numberOfLegs = -1;
		singleButton = false;
		
	

		
	}
	
	/**
	 * Create a MarshmallowCreature
	 * @param name Name of the creature.
	 * @param numberOfEyes Number of eyes the creature has.
	 * @param numberOfLegs Legs on the creature.
	 * @param numberOfArms Arms on the creature.
	 * @param singleButton This creature has one single button.
	 */
	public MarshmallowCreature(String name, int numberOfEyes, int numberOfLegs, int numberOfArms, boolean singleButton)
	{
		this.name = name;
		this.numberOfArms = numberOfArms;
		this.numberOfEyes = numberOfEyes;
		this.numberOfLegs = numberOfLegs;
		this.singleButton = singleButton;
		
	}
}
