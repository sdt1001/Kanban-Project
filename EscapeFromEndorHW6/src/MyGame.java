
public class MyGame {

	public static void main(String[] args) {

		QuitCommand.getInstance().subscribe(GameController.getInstance());
		HelpCommand.getInstance().subscribe(GameController.getInstance());
		
		System.out.println("Welcome to Escape From Endor!");
		
		while(true) {
			
			GameController.getInstance().getCommand();
		}

	}

}
