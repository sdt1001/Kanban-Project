import java.util.ArrayList;

public class WorkManager {

	WorkManager() {
	}
	
	public void receive(WorkItem item) {
		
		for (Worker worker : Workers) {
			WorkItem returnedItem = worker.performWork(item);
			if (returnedItem != null) {
				long id = returnedItem.WorkerID;
				if (id >= 1 && id <= 4) {
					receive(returnedItem);
				}
				else {
					System.out.println("Work completed on WorkItem "+ item.ID);
				}
			}
		}
	}
	public void subscribe(Worker worker) {
		Workers.add(worker);
	}
	
	public ArrayList<Worker> Workers = new ArrayList<Worker>();
}
