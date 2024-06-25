import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>(5);
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		
		while(!exit)
		{
			System.out.println("1.Push the element \n2.Display all element \n3.Pop the element \n4.Check Stack is Empty or not "
					+ "\n5.Check Stack is Full or not \n6.Peek into the stack" );
			
			int elem , choice;
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to push into the stack");
				elem = sc.nextInt();
				stack.push(elem);
				System.out.println("Element push into the stack successfully");
				break;

			case 2:
				stack.display();
				break;
				
			case 3:
				System.out.println(stack.pop());
				System.out.println("Element pop successfully");
				break;
				
			case 4:
				System.out.println(stack.isEmpty());
				break;
				
			case 5:
				System.out.println(stack.isFull());
				break;
			
			case 6:
				System.out.println(stack.peek());
			}
		}

	}

}
