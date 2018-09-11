package Monster;

import model.MarshmallowMash; 

public class Mash
{
	//Data member section
	//Declaration section
	private MarshmallowMash myMonster;
	
	//Constructors initialize data members!
	public Mash()
	{
		myMonster = new MarshmallowMash();
		
	}
	
	public void start()
	{
		System.out.print(myMonster);
	}
}
