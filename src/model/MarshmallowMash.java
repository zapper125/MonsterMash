package model;

public class MarshmallowMash
{
	// --------Declaration Section---------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;

	public MarshmallowMash()
	{
		// default constructor
		// generally boring and not as helpful
	}
	
	public MarshmallowMash(String name, double legCount, int eyeCount , boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount; 
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms; 
	}
	//==============Setter==========
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArms()

	{
		return armCount; 
	}
	
	//================Setters==============
	
	public void setName(String name)
	{
		this.name = name; 
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;  
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int ArmCount)
	{
		this.armCount = armCount; 
	}
	
	//==============Thing===========
	
	public String toString()
	{
	
		String description = "This monster is named " + name
								+" and it has " + legCount + " legs"
								+" it also has " + armCount + " arms"
								+" it is " + hasNoses + " about his nose I dont know where you heard else where"
								+" lastly he has " + armCount + " arms" 
								+" it's favorite spooky thing to say is minion"
								+" boo";
		return description;
	}
}
