import java.util.Calendar;

//WhatToEatDecider.java
public class WhatToEatDecider {
	
	//Creating properties for Project Name and Number
	private String ProjName;
	private int ProjNum;
	
	//Default Constructor which sets the project name if it is not known
	public WhatToEatDecider()
	   {
	      this("ProjectName Unknown", 0000);
	   }
	
	//Constructor to set Project Name and Number	
	public WhatToEatDecider( String name, int num) 
	   {
	      setProjectName (ProjName);
	      setProjectNumber (ProjNum);
	   }
	
	//Method to display Project Information
	public void ProjectInfo () {
		
		//Print project Number to Screen
		System.out.println("\nProject Number: " + ProjNum);
		
		//Print Project Name and Project Information to Screen
		System.out.println("\nThe project will be called: " + ProjName + 
				 "\n\nThe project agent will determine what a user should eat based on the time of day");

	}
	
	//Method to Display PEAS 
	public void PEAS () {
		// Print Performace Measure to Screen
		System.out.println("\nPerfomance Measure: "
				+ "Healthiness, satiety level, costliness, time taken to prepare  ");

		//Print Environment to screen
		System.out.println("Environment:"
				+ "Location, availability of food, time of day ");
		
		//Print Actuators to screen
		System.out.println("Actuators: "
				+ "Screen display, questions, survey");

		//Print Sensors to screen
		System.out.println("Sensors: "
				+ "Keyboard, microphone, LCD digitizer");
		
	}
	
	//Method to set Project Name
	public void setProjectName(String name) {
		ProjName = name; 
	}
	
	//Method to get Project Name
	public String getProjectName()
	   {
		   return ProjName;
	   }
	
	//Method to set Project Number
	public void setProjectNumber(int num) {
		ProjNum = num; 
	}
	
	//Method to get Project Number
	public int getProjectNumber()
	   {
		   return ProjNum;
	   }
	
	public static void suggestFood (){
		System.out.println("\n\n\nDeciding what you should eat..");
		
		int time= checkTime();// runs method that gets current time and stores the hour
		
		/*Assuming morning is between 5am and before 11:59 am
		 * Compares current time to morning hours
		 */
		if(time >= 5 && time <= 11) {
			 System.out.print("\n\nIt is morning");
			 System.out.print("\n\nYou should eat bacon and eggs and cereal");
		}
				
		/*Assuming afternoon is from 12middday to 4:59pm
		 * Compares current time to  afternoon hours
		 */		
		else if(time >= 12 && time <= 16) {
			 System.out.print("\n\nIt is afternoon");
			 System.out.print("\n\nYou should eat a turkey and cheese sandwich");
		}
		
		
		/*Assuming evening is from 5pm to 9:59pm
		 * Compares current time to evening hours
		 */		
		else if(time >= 17 && time <= 21) {
			 System.out.print("\n\nIt is evening");
			 System.out.print("\n\nYou should eat chicken shrimp alfredo pasta");
		}
		
		/*Assuming late night is from 10pm to 4:59am
		 * Compares current time to evening hours
		 */	
		else if(((time >= 22))|| (time >=0 && time <5)) {
			 System.out.print("\n\nIt is late night");
			 System.out.print("\n\nYou should eat cookies and milk");
		}
			
	}
	
	//method to get current time
		public static int checkTime() {
			Calendar timeNow = Calendar.getInstance();
			int hourNow = timeNow.get(Calendar.HOUR_OF_DAY);
			return hourNow;
			}

		
	


}

