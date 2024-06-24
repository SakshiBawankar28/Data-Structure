
public class Main {

	public static void main(String[] args) 
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		
		dll.display();
		
		System.out.println("\ninsert by position");
		dll.insertAtPosistion(60, 4);
        dll.display();
        dll.insertAtPosistion(70, 7);
        dll.display();
        dll.insertAtPosistion(90, 10);
        dll.display();
        
        System.out.println("\ndelete by value");
        dll.deleteByValue(50);
        dll.display();
        dll.deleteByValue(60);
        dll.display();
        dll.deleteByValue(70);
        dll.display();
        dll.deleteByValue(50);
        dll.display();
        
        System.out.println();
        dll.insertAtPosistion(60, 4);
        dll.insertAtPosistion(70, 1);
        dll.insertAtPosistion(90, 4);
        dll.display();
        System.out.println("\ndelete by position");
        dll.deleteByPosition(1);
        dll.display();
        dll.deleteByPosition(3);
        dll.display();
        dll.deleteByPosition(5);
        dll.display();
        dll.deleteByPosition(5);
        dll.display();
	}

}
