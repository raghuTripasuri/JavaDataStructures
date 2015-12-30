package packQueue;

public class EmpQueueManager {
	
	public static void main(String args[]){
		Queue queue = new Queue();
		StringBuffer str = new StringBuffer();
		//build the queue
		for (int i=0; i<20; i++){
			str.setLength(0);
			str.append("abc");
			str.append("_");
			str.append(i);
			Employee emp = new Employee(i, str.toString());
			queue.enqueue(emp);
		}
		System.out.println(queue.toString());
		
		for(int i=0; i < 5; i++){
			System.out.println("Service completed for  - " + (queue.dequeue()).toString());
			System.out.println("Next in line is - " + (queue.firstEl()).toString());
		}
		
		System.out.println(queue.toString());
	}
	
}
