public class CircularQueue 
{
	private int size;
	private int []arr;
	private int rear, front;
	
	public CircularQueue(int size) {
		super();
		this.size = size;
		arr = new int[size];
		rear = front = -1;
	}
	
	public boolean isEmpty()
	{
		return rear == front;
	}
	public boolean isFull()
	{
		return ((front == -1  &&  rear == size-1)
				||  front == (rear + 1) % size);
	}
	
	public boolean insert(int data)
	{
		if(isFull())
		{
			return false;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		return true;
	}
	
	public int delete()
	{
		if(isEmpty())
		{
			return -999;
		}
		front = (front + 1) % size;
		return arr[front];
	}
}
