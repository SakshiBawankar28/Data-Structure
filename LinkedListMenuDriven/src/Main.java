import java.util.Scanner;

public class Main {

	// Menu-driven program
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int choice, data, position;

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Insert at beginning");
			System.out.println("2. Insert at end");
			System.out.println("3. Insert at specific position");
			System.out.println("4. Display");
			System.out.println("5. Delete from beginning");
			System.out.println("6. Delete from end");
			System.out.println("7. Delete from specific position");
			System.out.println("8. Find maximum node");
			System.out.println("9. Find minimum node");
			System.out.println("10. Sort in ascending order");
			System.out.println("11. Sort in descending order");
			System.out.println("12. Remove duplicates");
			System.out.println("13. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter data to insert at beginning: ");
				data = scanner.nextInt();
				list.insertAtBeginning(data);
				break;
			case 2:
				System.out.print("Enter data to insert at end: ");
				data = scanner.nextInt();
				list.insertAtEnd(data);
				break;
			case 3:
				System.out.print("Enter data to insert: ");
				data = scanner.nextInt();
				System.out.print("Enter position to insert: ");
				position = scanner.nextInt();
				list.insertAtPosition(data, position);
				break;
			case 4:
				list.display();
				break;
			case 5:
				list.deleteFromBeginning();
				break;
			case 6:
				list.deleteFromEnd();
				break;
			case 7:
				System.out.print("Enter position to delete: ");
				position = scanner.nextInt();
				list.deleteByPosition(position);
				break;
			case 8:
				System.out.println("Maximum node value: " + list.findMax());
				break;
			case 9:
				System.out.println("Minimum node value: " + list.findMin());
				break;
			case 10:
				list.ascendingOrder();
				break;
			case 11:
				list.descendingOrder();
				break;
			case 12:
				list.removeDuplicates();
				break;
			case 13:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
