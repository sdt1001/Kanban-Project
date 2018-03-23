import java.util.ArrayList; 
import java.util.Scanner; 

public class GameController {

	//static means it exists outside of any other instances; final means its constant so 
	//it cannot be changed while the program is running; this is a Singleton Instance
	private static final GameController INSTANCE = new GameController();
	
	//variable called Commands that holds Commandable
	public ArrayList<Commandable> Commands = new ArrayList<Commandable>();
	
	private Scanner reader;
	
	private GameController() {
		//constructor sets up the class
		reader = new Scanner(System.in); //reads from System.in for user input
	}
	
	public static GameController getInstance() {
		//after object is constructed above privately, this method provides the single 
		//instance of the class
		return INSTANCE; 
	}
	//method: wait for user input, then send to each Commandable to determine if valid
	public void getCommand() {
		
		System.out.println("Enter a command:");
		String Input = reader.nextLine(); //takes the user's input and places it in String Input
		
		//in the collection of commands, will run loop once for each item in that collection and 
		//stores the item it is looking in the variable created
		for (Commandable command : Commands) { 
			
			if (command.matchCommand(Input)) {
				
				command.doCommand();
				return;	//this ends the method to break out of the loop
			}
		}
		System.out.println("Command not recognized");
	}
}
