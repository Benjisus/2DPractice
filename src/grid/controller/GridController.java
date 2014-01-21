package grid.controller;

import grid.model.MarshmallowCreature;
import grid.view.GridView;

public class GridController
{
	private int[][] myNumbers;
	private String[][] friendNames;
	
	private MarshmallowCreature [][] myMonsters;
	
	public GridController()
	{
		friendNames = new String[4][4];
		myNumbers = new int[3][3];
		myMonsters = new MarshmallowCreature[2][2];
		
		fillNumbers();
		fillNames();
		fillMonsters();
	}
	
	private void fillNumbers()
	{
		myNumbers[0][0]= 1;
		myNumbers[0][1]= 2;
		myNumbers[0][2]= 3;
		myNumbers[1][0]= 4;
		myNumbers[1][1]= 5;
		myNumbers[1][2]= 6;
		myNumbers[2][0]= 7;
		myNumbers[2][1]= 8;
		myNumbers[2][2]= 9;
												
				
	}
	
	private void fillNames()
	{
		friendNames[0][0] = "Jessie";
		friendNames[0][1] = "Richie";
		friendNames[0][2] = "Christian";
		friendNames[0][3] = "Reggie";
		friendNames[1][0] = "Dahlin";
		friendNames[1][1] = "Taylor";
		friendNames[1][2] = "Josh";
		friendNames[1][3] = "Sierrah";
		friendNames[2][0] = "Hunter";
		friendNames[2][1] = "Austin";
		friendNames[2][2] = "Nick";
		friendNames[2][3] = "Kenny";
		friendNames[3][0] = "Sally";
		friendNames[3][1] = "Colton";
		friendNames[3][2] = "Chad";
		friendNames[3][3] = "Charlie";
		
		
	}
	
	private void fillMonsters()
	{
		myMonsters[0][0] = new MarshmallowCreature();
		myMonsters[0][1] = new MarshmallowCreature("Ben",1,2,3,true);
		
		myMonsters[1][0] = new MarshmallowCreature();
		myMonsters[1][1] = new MarshmallowCreature("Ben",2,3,4,false);
		
												
	}
	
	
	public void start()
	{
		GridView myView = new GridView();
		myView.printStringInformation(friendNames);
		myView.printMonsterInformation(myMonsters);
		myView.printIntInformation(myNumbers);
	
	}
}
