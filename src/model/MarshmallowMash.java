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

	//public MarshmallowMash(String name)
	//{
	//	this.name = name;
	//}
	
	public MarshmallowMash(String name, double legCount, int eyeCount , boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount; 
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms; 
	}
	
	public String toString()
	{
		String description = "";

		return description;
	}
}
