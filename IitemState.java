
public interface IitemState {

	abstract void InventoryItem(); // Stored in backpack or on belt.
	abstract void DescribeItem(); // What you are currently looking at...
	abstract void EquipedItem(); // Is in your hand.
	abstract void UseItem(); //Item is activated
	abstract void ConsumeItem(); //Item is removed from inventory...
	
}
