public class CircularList {
	private Node head;

	public CircularList() {
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
			head.setNext(head);
			return true;
		}

		// Initializes a temporary node last to traverse the list.
		Node last = head;
		// if list is not empty then traverse the list to find the last node
		while (last.getNext() != head) {
			last = last.getNext();
			// Checks if the head node contains the data to be inserted. If it does, returns
			// false (to prevent duplicate values).
			if (last.getData() == data) {
				return false;
			}
		}
		// set new node as the next node of last node
		last.setNext(newNode);
		// set head as the new node of next node
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
	
	
	// insert method at specific position
	public boolean insertAtPosition(int data, int position) 
	{
		//If the position is invalid (less than or equal to 0) or 
		//if the position is beyond the first position in an empty list, returns false.
		if(head == null  && position > 1 || position <= 0)
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
			if(head == null)
			{
				head = newNode;
				head.setNext(head);
				return true;
			}
			Node last = head;
			while(last.getNext() != head)
			{
				last = last.getNext();
			}
			newNode.setNext(head);
			head = newNode;
			last.setNext(newNode);
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
	public void display() 
	{
		if(head == null)
		{
			return ;
		}
		Node temp = head;
		do {
			System.out.print(temp.getData() + "  ");
			temp = temp.getNext();
		}while (temp != head);
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
        	//list has only one node
            if(head.getNext() == head)
            {
            	head = null;
                return true;
            }
            //list has more than one node
            Node last = head;
            while(last.getNext() != head)
            {
            	last = last.getNext();
            }
            head = head.getNext();
            last.setNext(head);
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
			if(head.getNext() == head)
			{
				head = null;
				return true;
			}
			Node last = head;
			while(last.getNext() != head)
			{
				last = last.getNext();
			}
			head = head.getNext();
			last.setNext(head);
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
	
}

