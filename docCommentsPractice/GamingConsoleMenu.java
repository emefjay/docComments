package docCommentsPractice;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class GamingConsoleMenu {
	
	
	private static void menuPrompt()
	{
		System.out.println("1. Show all gaming consoles");
		System.out.println("2. Add a device");
		System.out.println("3. Find a device");
		System.out.println("4. Delete a device");
		System.out.println("5. Number of devices");
		System.out.println("6. Exit");
		System.out.print("Enter your selection: ");
	}
	
	public static void main(String[] args)
	{

	ArrayList<GamingConsole> consoles = new ArrayList<GamingConsole>();
		consoles.add(new GamingConsole ("Switch","Nintendo",2017) );
		consoles.add(new GamingConsole ("Xbox Series x", "Microsoft", 2020) );
		consoles.add(new GamingConsole ("Playstation 5", "Sony", 2020) );
		
		
		
		Scanner input = new Scanner(System.in);
		int choice;
		do 
		{
			menuPrompt();
			choice = input.nextInt();
			int idNumber;
			
			switch(choice)
			{
				case 1:
					for(int i = 0; i < consoles.size(); i++)
					{
						System.out.println(consoles.get(i));
						System.out.println();
					}
					break;
				case 2: 
					addConsole();
					consoles.add();
					break;
				case 3: 
					{
						System.out.println();
						System.out.println("Id: ");
						idNumber = input.nextInt();
						
						for(int i =0; i < 3; i++)
						{
							@SuppressWarnings("unlikely-arg-type")
							boolean retval = consoles.contains(idNumber); 
					        
						      if (retval == true) 
						      {
						         System.out.println(consoles.get(i));
						      } else 
						      	{
						    	  	System.out.printf("Id number %d was not found", idNumber);
						      	}
						}
						
						System.out.println();
						
					}
					break;
				case 4: 
					break;
				case 5:
					{
						System.out.println();
						System.out.println("Number of consoles: " + consoles.size());
						System.out.println();
					}
					break;
				case 6: 
					{
						System.out.println();
						System.out.println("Goodbye");
					}
					break;
				default:
					
				
			}
			
		}while(choice != 6);
		
		
	}	
	
		private static GamingConsole addConsole() {
		
		Scanner input = new Scanner(System.in);
		String consoleName;
		String companyName;
		int consoleYear;
		int selection;
		
			
		System.out.println("What is the name of the console you would like to add?");
		consoleName = input.nextLine();
		
		System.out.println("What is the name of console's comapny?");
		companyName = input.nextLine();
		
		System.out.println("What year was the console made?");
		consoleYear = input.nextInt();
		
		return new GamingConsole(consoleName, companyName, consoleYear);
			
		}
	
}
