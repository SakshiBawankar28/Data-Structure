public class Main {

	public static void main(String[] args) 
	{
		Queue queue = new Queue(4);
		
		System.out.println("Insert operation");
		System.out.println(queue.insert(10));
		System.out.println(queue.insert(20));
		System.out.println(queue.insert(30));
		System.out.println(queue.insert(40));
		System.out.println(queue.insert(50));
		
		System.out.println("\nDelete opretion");
		System.out.println(queue.delete());
		
		System.out.println();
		CircularQueue cq = new CircularQueue(5);

        System.out.println(cq.insert(10));
        System.out.println(cq.insert(20));
        System.out.println(cq.insert(30));
        System.out.println(cq.insert(40));
        System.out.println(cq.insert(50));
        System.out.println(cq.insert(50));

        System.out.println(cq.delete());
        System.out.println(cq.insert(60));
        System.out.println(cq.delete());
        System.out.println(cq.insert(60));
		
	}

}
