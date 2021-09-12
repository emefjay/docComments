package docCommentsPractice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author emmajuvenal
 * @author Jaland Aland
 * @author Dorian Glines
 * 
 *         Class for accessing and displaying Gaming Console Objects. Includes a
 *         private menuPrompt method and the main method.
 */

public class GamingConsoleMenu {

	/**
	 * Method for the menu display.
	 */

	private static void menuPrompt() {
		System.out.println("1. Show all gaming consoles");
		System.out.println("2. Add a device");
		System.out.println("3. Find a device");
		System.out.println("4. Delete a device");
		System.out.println("5. Number of devices");
		System.out.println("6. Exit");
		System.out.print("Enter your selection: ");
	}

	/**
	 * @param args
	 * 
	 *             The main method. Declares and initializes GamingConsole objects.
	 *             Includes a switch statement with the code for the menuPrompt.
	 */
	public static void main(String[] args) {

		ArrayList<GamingConsole> consoles = new ArrayList<GamingConsole>();
		consoles.add(new GamingConsole("Switch", "Nintendo", 2017));
		consoles.add(new GamingConsole("Xbox Series x", "Microsoft", 2020));
		consoles.add(new GamingConsole("Playstation 5", "Sony", 2020));

		Scanner input = new Scanner(System.in);
		int choice;
		do {
			menuPrompt();
			choice = input.nextInt();
			input.nextLine();
			int idNumber;

			switch (choice) {

			case 1:
				for (int i = 0; i < consoles.size(); i++) {
					System.out.println(consoles.get(i));
					System.out.println();
				}
				break;
			case 2:

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

				GamingConsole newConsole = new GamingConsole(consoleName, companyName, consoleYear);
				consoles.add(newConsole);
				break;

			case 3: {
				System.out.println();
				System.out.println("Id: ");
				idNumber = input.nextInt();

				for (int i = 0; i < consoles.size(); i++) {
					if (consoles.get(i).getUniqueId() == idNumber) {
						System.out.println(consoles.get(i).toString());
						System.out.println();
						break;
					}

				}
			}

			case 4: {
	

			}
				break;
			case 5: {
				System.out.println();
				System.out.println("Number of consoles: " + consoles.size());
				System.out.println();
			}
				break;
			case 6: {
				System.out.println();
				System.out.println("Goodbye");
			}
				break;

			}

		} while (choice != 6);

	}
}
