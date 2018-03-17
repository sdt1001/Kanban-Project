
public interface Commandable {

	public String getCommandText();
	
	public void doCommand();
	
	public boolean matchCommand(String input);
	
	public void subscribe(GameController controller);
	
	public void unsubscribe(GameController controller);
	
}
