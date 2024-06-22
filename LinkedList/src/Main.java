
public class Main {

	public static void main(String[] args) 
	{
		LinkedList li = new LinkedList();
		
		li.insert(10);
		li.insert(20);
		li.insert(30);
		li.insert(40);
		li.insert(50);
		
		li.display();
		
		System.out.println("\nInsert data by position");
		li.insertAtPosition(8000, 1);
		li.insertAtPosition(4000, 5);
		li.insertAtPosition(1000, 8);
		li.insertAtPosition(12000,12);
		li.display();
		
		System.out.println("\nDelete by value");
		li.deleteByVal(8000);
		li.display();
		li.deleteByVal(4000);
		li.display();
		li.deleteByVal(1000);
		li.display();
		
		System.out.println();
		li.insertAtPosition(8000, 1);
		li.insertAtPosition(4000, 5);
		li.insertAtPosition(1000, 8);
		li.insertAtPosition(12000,12);
		li.display();
		System.out.println("Delete by position");
		li.deleteByPosition(1);
		li.display();
		li.deleteByPosition(4);
		li.display();
		li.deleteByPosition(6);
		li.display();
		
		System.out.println("\nReverse using stack");
		li.displayReverseUsingStack();
		System.out.println("\nReverse using recursion");
		li.displayReverseUsingRecursion(li.getHead());
//		li.display();
		System.out.println("\nReverse using swapping");
		li.displayReverseUsingSwapping();
		li.display();
	}

}
