
public class Main {

	public static void main(String[] args) 
	{
		CircularList cl = new CircularList();
		
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);

		cl.display();
		
		System.out.println("\nInsert data by position");
		cl.insert(60, 1);
        cl.display();
        cl.insert(70, 4);
        cl.display();
        cl.insert(80, 8);
        cl.display();
        cl.insert(90, 12);
        cl.display();
		System.out.println();
		cl.insertAtPosition(8000, 1);
		cl.insertAtPosition(4000, 5);
		cl.insertAtPosition(1000, 8);
		cl.insertAtPosition(12000,12);
		cl.display();
		
		System.out.println("\nDelete by value");
		cl.deleteByVal(8000);
		cl.display();
		cl.deleteByVal(4000);
		cl.display();
		cl.deleteByVal(1000);
		cl.display();
		
		System.out.println();
		cl.insertAtPosition(8000, 1);
		cl.insertAtPosition(4000, 5);
		cl.insertAtPosition(1000, 8);
		//li.insertAtPosition(12000,12);
		cl.display();
		System.out.println("Delete by position");
		cl.deleteByPosition(1);
		cl.display();
		cl.deleteByPosition(4);
		cl.display();
		cl.deleteByPosition(6);
		cl.display();
		
	}

}
