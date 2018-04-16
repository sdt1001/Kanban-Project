
public class Worker {

	
	private long WorkerID;
	public Worker(long ID) {
		WorkerID = ID;
	}
	public WorkItem performWork(WorkItem item) {
		
		if (item.WorkerID == WorkerID) {
			System.out.println("Worker " + WorkerID + " processed WorkItem " + item.ID);
			item.WorkerID++;
			return item;	
		} 
		else {
			return null;
		}
				
	}
	
}
