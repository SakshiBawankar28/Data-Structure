import java.util.Stack;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}
	
	//getter & setter
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// insert method
	public boolean insert(int data) 
	{
		// Creates a new node with the given data.s
		Node newNode = new Node(data);

		// Checks if the node creation failed and returns false
		if (newNode == null) {
			return false;
		}

		// If the list is empty (head is null), sets the new node as the head and
		// returns true.
		if (head == null) {
			head = newNode;
			return true;
		}

		// Initializes a temporary node temp to traverse the list.
		Node temp = head;
		// if list is not empty then traverse the list to find the last node
		while (temp.getNext() != null) {
			temp = temp.getNext();
			// Checks if the head node contains the data to be inserted. If it does, returns
			// false (to prevent duplicate values).
			if (temp.getData() == data) {
				return false;
			}
		}
		// set new node as the next node of last node
		temp.setNext(newNode);
		return true;
	}

	
	// insert method at specific position
	public boolean insertAtPosition(int data, int position) 
	{
		//If the position is invalid (less than or equal to 0) or 
		//if the position is beyond the first position in an empty list, returns false.
		if(position <= 0  || head == null  && position > 1)
		{
			return false;
		}
		
		// Creates a new node with the given data.s
		Node newNode = new Node(data);

		// Checks if the node creation failed and returns false
		if (newNode == null) {
			return false;
		}
		
		//insert newNode at position one
		if(position == 1)
		{
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		
		//Initializes a prev node to find the node after which the new node is to be inserted.
		Node prev = head;
		for(int i=1; i<position-1; i++)
		{
			prev = prev.getNext();
			if(prev == null)
			{
				return false;
			}
		}
		//Sets the next of the new node to the node currently at the target position.
		newNode.setNext(prev.getNext());
		//Sets the next of the prev node to the new node, effectively inserting it into the list.
		prev.setNext(newNode);
		return true;

	}

	// display method
	/*
	 * The display method:
		Starts from the head of the linked list.
		Iterates through each node until it reaches the end (null).
		Prints the data of each node followed by a space.
		Moves to the next line after printing all the node data.
	 */
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "  ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	
	//delete method by value
	public boolean deleteByVal(int data) 
	{
		//Checks if the list is empty. If so, it returns false.
        if(head == null) {
            return false;
        }

        //Checks if the head node contains the value to be deleted.
        //If so, it updates the head and returns true.
        if(head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Node prev = head, del = head;
        /*
         * Otherwise, it traverses the list to find the node with the specified value.
			If it finds the node, it removes it by updating the previous node's next pointer to skip the node to be deleted and returns true.
			If it doesn't find the node, it returns false
         */
        while(del.getData() != data) {
            prev = del;
            del = del.getNext();
            if(del == null) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        return true;
    }
	
	//delete method by position
	public boolean deleteByPosition(int position)
	{
		if(head == null  ||  position < 0)
		{
			return false;
		}
		if(position == 1)
		{
			head = head.getNext();
			return true;
		}
		Node prev = head;
		for(int i=1; i<position-1; i++)
		{
			prev = prev.getNext();
			if(prev.getNext() == null)
			{
				return false;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return false;
	}
	
	//reverse methods
	//1. using stack
	public void displayReverseUsingStack()
	{
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		
		while(temp != null)
		{
			stack.push(temp);
			temp = temp.getNext();
		}
		while(!stack.empty())
		{
			System.out.print(stack.pop().getData()+"  ");
		}
	}
	
	//2. using recursive
	public void displayReverseUsingRecursion(Node temp)
	{
		if(temp == null)
		{
			return;
		}
		displayReverseUsingRecursion(temp.getNext());
		System.out.print(temp.getData() + "  ");
	}
	
	//3. Using swap
	public void displayReverseUsingSwapping()
	{
		if(head == null  ||  head.getNext() == null)
		{
			return ;
		}
		Node n1 = head;
		Node n2 = head.getNext();
		while(n2 != null)
		{
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}
}

