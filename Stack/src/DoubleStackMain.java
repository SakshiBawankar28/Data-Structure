import java.util.Scanner;

public class DoubleStackMain 
{
	public static void main(String[] args) 
	{
		DoubleStack<Integer> ds = new DoubleStack(5);
		boolean exit = false;
		int choice, elem1, elem2;
		Scanner sc = new Scanner(System.in);
		
		while(!exit)
		{
			System.out.println("1.Push element into Stack1 \n2.Push element into Stack2"
					+ "\n3.Display all element \n4.Pop element from Stack1"
					+ "\n5.Pop element from Stack2");
			System.out.println("Enter the chioce");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the element to push into stact1");
				elem1 = sc.nextInt();
				System.out.println(ds.push1(elem1));
				System.out.println("Element added successfully into stack1");
				break;
				
			case 2:
				System.out.println("Enter the element to push into stact2");
				elem2 = sc.nextInt();
				System.out.println(ds.push2(elem2));
				System.out.println("Element added successfully into stack1");
				break;

			case 3:
				ds.display();
				
			case 4:
				System.out.println(ds.pop1());
				System.out.println("Element is popped from stack1 successfully");
				break;
				
			case 5:
				System.out.println(ds.pop2());
				System.out.println("Element is popped from stack2 successfully");
				break;
			}
		}
	}

	

}
