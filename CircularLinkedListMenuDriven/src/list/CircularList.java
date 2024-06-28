package list;

public class CircularList {
    private Node head;

    public CircularList() {
        head = null;
    }

    // Getter & Setter
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Insert method
    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (newNode == null) {
            return false;
        }

        if (head == null) {
            head = newNode;
            head.setNext(head);
            return true;
        }

        Node last = head;
        while (last.getNext() != head) {
            last = last.getNext();
        }
        last.setNext(newNode);
        newNode.setNext(head);
        return true;
    }

    public boolean insert(int data, int position) {
        if ((head == null && position > 1) || position <= 0) {
            return false;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            if (head == null) {
                head = newNode;
                head.setNext(head);
                return true;
            }

            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            newNode.setNext(head);
            head = newNode;
            last.setNext(newNode);
            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == head) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return true;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println();
    }

    public boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            if (head.getNext() == head) {
                head = null;
                return true;
            }
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            head = head.getNext();
            last.setNext(head);
            return true;
        }

        Node prev = head, del = head;
        while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            if (del == head) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        return true;
    }

    public boolean deleteByPosition(int position) {
        if (head == null || position <= 0) {
            return false;
        }

        if (position == 1) {
            if (head.getNext() == head) {
                head = null;
                return true;
            }
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            head = head.getNext();
            last.setNext(head);
            return true;
        }

        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev.getNext() == head) {
                return false;
            }
        }
        Node del = prev.getNext();
        prev.setNext(del.getNext());
        return true;
    }

    // Additional methods for the extra functionality
    public int findMax() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }

        Node temp = head;
        int max = head.getData();
        do {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        } while (temp != head);
        return max;
    }

    public int findMin() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }

        Node temp = head;
        int min = head.getData();
        do {
            if (temp.getData() < min) {
                min = temp.getData();
            }
            temp = temp.getNext();
        } while (temp != head);
        return min;
    }

    // Helper methods for sorting
    public void sortAscending() {
        if (head == null) {
            return;
        }

        Node current = head, index = null;
        int temp;
        do {
            index = current.getNext();
            while (index != head) {
                if (current.getData() > index.getData()) {
                    temp = current.getData();
                    current.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        } while (current.getNext() != head);
    }

    public void sortDescending() {
        if (head == null) {
            return;
        }

        Node current = head, index = null;
        int temp;
        do {
            index = current.getNext();
            while (index != head) {
                if (current.getData() < index.getData()) {
                    temp = current.getData();
                    current.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        } while (current.getNext() != head);
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head, index = null, temp = null;
        do {
            temp = current;
            index = current.getNext();
            while (index != head) {
                if (current.getData() == index.getData()) {
                    temp.setNext(index.getNext());
                } else {
                    temp = index;
                }
                index = index.getNext();
            }
            current = current.getNext();
        } while (current.getNext() != head);
    }

    public int findMiddle() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }

        Node slow = head, fast = head;
        while (fast.getNext() != head && fast.getNext().getNext() != head) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow.getData();
    }
    
    public void deleteAlternate() 
    {
        if (head == null) {
            return;
        }
        Node current = head;
        Node prev = null;
        int count = 1;
        do {
            if (count % 2 == 0) {
                prev.setNext(current.getNext());
                if (current == head) {
                    head = current.getNext();
                }
            } else {
                prev = current;
            }
            current = current.getNext();
            count++;
        } while (current != head);
    }
    
    
 // Display the last three nodes method
    public void displayLastThree() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        // Calculate the total number of nodes
        Node temp = head;
        int count = 1;
        while (temp.getNext() != head) {
            temp = temp.getNext();
            count++;
        }
        // Calculate the starting position for the last three nodes
        int startPos = count - 2;
        if (startPos <= 0) {
            startPos = 1;
        }
        // Traverse the list to the starting position
        temp = head;
        for (int i = 1; i < startPos; i++) {
            temp = temp.getNext();
        }
        // Print the last three nodes
        for (int i = 0; i < 3 && temp != head; i++) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

