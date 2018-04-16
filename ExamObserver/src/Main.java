
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkManager Manager = new WorkManager();
		for (int i = 1; i < 5; i ++) {
			Manager.subscribe(new Worker(i));
		}
		Manager.receive(new WorkItem("A", 1));
		Manager.receive(new WorkItem("B", 2));
		Manager.receive(new WorkItem("C", 3));
		Manager.receive(new WorkItem("D", 4));
	}

}
