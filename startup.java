
//startup.java

import java.util.Calendar;
import java.util.Scanner;


public class startup {
	
	private static Scanner input;
	//private static Scanner input2;

	//main method
	public static void main(String[] args) {
		
		//instantiate WhatToEatDecider as "project1"
		WhatToEatDecider project1 = new WhatToEatDecider();
		
		/*
		 * set Project Name and Number 
		 */
		project1.setProjectName(getProjectName());
		project1.setProjectNumber(getProjectNumber());	
		
		/*
		 * call methods from object
		 */
		project1.ProjectInfo();
		project1.PEAS();
	
		initiateAI();
		
	}
	
	//Method to Start AI 
	public static void initiateAI () {
		
		 //Call method to start running AI application
		 runningAI();
	     
	}
	
	//Method to Run AI
	public static void runningAI () {
		
		WhatToEatDecider.suggestFood();
	}
	
	//method to get Project Name
	public static String getProjectName()
	   {
	      String name;
	     // input = new Scanner(System.in);
	     // System.out.print("Enter Project Name >> ");
	     // name = input.nextLine();
	      name = "What Should I Eat Decider";
	      return name;
	   } 
	
	//method to get Project Number
	public static int getProjectNumber()
	   {
	      int num;
	      //input2 = new Scanner(System.in);
	      //System.out.print("Enter Project number >> ");
	     // num = input2.nextInt();
	      num = 001;
	      return num;
	   } 
	
	
}


