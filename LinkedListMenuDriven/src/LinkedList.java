public class LinkedList 
{
	private Node head;

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Insert at the beginning
    public boolean insertAtBeginning(int data) 
    {
        Node newNode = new Node(data);
        if (newNode == null) 
        {
            return false;
        }
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    // Insert at the end
    public boolean insertAtEnd(int data) 
    {
        Node newNode = new Node(data);
        if (newNode == null) 
        {
            return false;
        }
        if (head == null) 
        {
            head = newNode;
            return true;
        }
        Node temp = head;
        while (temp.getNext() != null) 
        {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        return true;
    }

    // Insert at a specific position
    public boolean insertAtPosition(int data, int position) 
    {
        if (position <= 0 || (head == null && position > 1)) 
        {
            return false;
        }
        Node newNode = new Node(data);
        if (newNode == null) 
        {
            return false;
        }
        if (position == 1) 
        {
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        Node prev = head;
        for (int i = 1; i < position - 1; i++) 
        {
            prev = prev.getNext();
            if (prev == null) 
            {
                return false;
            }
        }
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return true;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Delete from the beginning
    public boolean deleteFromBeginning() {
        if (head == null) {
            return false;
        }
        head = head.getNext();
        return true;
    }

    // Delete from the end
    public boolean deleteFromEnd() {
        if (head == null) {
            return false;
        }
        if (head.getNext() == null) {
            head = null;
            return true;
        }
        Node prev = head;
        Node del = head;
        while (del.getNext() != null) {
            prev = del;
            del = del.getNext();
        }
        prev.setNext(null);
        return true;
    }

    // Delete from a specific position
    public boolean deleteByPosition(int position) {
        if (head == null || position <= 0) {
            return false;
        }
        if (position == 1) {
            head = head.getNext();
            return true;
        }
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev.getNext() == null) {
                return false;
            }
        }
        Node del = prev.getNext();
        prev.setNext(del.getNext());
        return true;
    }

    // Find the maximum node
    public int findMax() {
        if (head == null) {
            return -999;
        }
        Node temp = head;
        int max = temp.getData();
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    // Find the minimum node
    public int findMin() {
        if (head == null) {
            return -999;
        }
        Node temp = head;
        int min = temp.getData();
        while (temp != null) {
            if (temp.getData() < min) {
                min = temp.getData();
            }
            temp = temp.getNext();
        }
        return min;
    }

    // Sort in ascending order
    public void ascendingOrder() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node next = current.getNext();
            while (next != null) {
                if (current.getData() > next.getData()) {
                    int temp = current.getData();
                    current.setData(next.getData());
                    next.setData(temp);
                }
                next = next.getNext();
            }
            current = current.getNext();
        }
    }

    // Sort in descending order
    public void descendingOrder() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node next = current.getNext();
            while (next != null) {
                if (current.getData() < next.getData()) {
                    int temp = current.getData();
                    current.setData(next.getData());
                    next.setData(temp);
                }
                next = next.getNext();
            }
            current = current.getNext();
        }
    }

    // Remove duplicates
    public void removeDuplicates() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node prev = current;
            Node temp = current.getNext();
            while (temp != null) {
                if (current.getData() == temp.getData()) {
                    prev.setNext(temp.getNext());
                } else {
                    prev = temp;
                }
                temp = temp.getNext();
            }
            current = current.getNext();
        }
    }
	
}


