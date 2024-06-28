package list;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        Scanner scanner = new Scanner(System.in);
        int choice, data, position;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at specific position");
            System.out.println("4. Display");
            System.out.println("5. Delete at beginning");
            System.out.println("6. Delete at end");
            System.out.println("7. Delete at specific position");
            System.out.println("8. Find maximum node");
            System.out.println("9. Find minimum node");
            System.out.println("10. Sort in ascending order");
            System.out.println("11. Sort in descending order");
            System.out.println("12. Remove duplicates");
            System.out.println("13. Find Middle Element");
            System.out.println("14. Delete alternate element");
            System.out.println("15. Display last 3 element");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    data = scanner.nextInt();
                    list.insert(data, 1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    data = scanner.nextInt();
                    list.insert(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.insert(data, position);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    list.deleteByPosition(1);
                    break;
                case 6:
                    Node temp = list.getHead();
                    int count = 1;
                    while (temp.getNext() != list.getHead()) {
                        temp = temp.getNext();
                        count++;
                    }
                    list.deleteByPosition(count);
                    break;
                case 7:
                    System.out.print("Enter position to delete: ");
                    position = scanner.nextInt();
                    list.deleteByPosition(position);
                    break;
                case 8:
                    try {
                        System.out.println("Maximum node: " + list.findMax());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Minimum node: " + list.findMin());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    list.sortAscending();
                    System.out.println("List sorted in ascending order.");
                    break;
                case 11:
                    list.sortDescending();
                    System.out.println("List sorted in descending order.");
                    break;
                case 12:
                    list.removeDuplicates();
                    System.out.println("Duplicates removed.");
                    break;
                case 13:
                        System.out.println("Middle Element: " + list.findMiddle());
                    break;
                case 14:
                	list.deleteAlternate();
                	System.out.println("Alternate element deleted!!");
                	break;
                case 15:
                	list.displayLastThree();
                	break;
                case 16:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}