package Monster;

import model.MarshmallowMash; 
import java.util.Scanner;

public class Mash
{
	//Data member section
	//Declaration section
	
	private MarshmallowMash myMonster;
	
	private MarshmallowMash userMonster;
	
	//Constructors initialize data members!
	
	public Mash()
	{
		//String name, double legCount, int eyeCount, int hasNose, int arms
		myMonster = new MarshmallowMash("DD", .5, 2, true, 3);
		userMonster = new MarshmallowMash();

	}
	
	public void start()
	{
		System.out.print(myMonster);
		
		Scanner textScanner;
		System.out.println("");
		System.out.println("");
		
		System.out.println("What is your monsters name?");
		textScanner = new Scanner(System.in);
		String name = textScanner.nextLine();
		userMonster.setName(name);
		System.out.println("your boi is named " + userMonster.getName() );
		
		System.out.println("");
		
		System.out.println("How many legs does " + userMonster.getName() + " Have" );
		double legCount = textScanner.nextDouble();
		userMonster.setLegCount(legCount);
		System.out.println("your boi has " + userMonster.getLegCount() + " legs!");
		
		System.out.println("");
		
		System.out.println("How many arms does you boi have?");
		int arms = textScanner.nextInt();
		userMonster.setArmCount(arms);
		System.out.println("your boi has " + userMonster.getArmCount() + " arms!");
		
		textScanner.close();
	}
}
