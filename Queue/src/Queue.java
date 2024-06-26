public class Queue 
{
	private int[] arr;
	private int rear, front;
	private int size;
	
	public Queue(int size) 
	{
		this.size = size;
		rear = front = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty()
	{
		return (rear == -1  &&  front == -1)  ||  front > rear;
	}
	public boolean isFull()
	{
		return rear == size-1;
	}
	
	public boolean insert(int data)
	{
		if(isFull())
		{
			return false;
		}
		arr[++rear] = data;
		if(front == -1)
		{
			front = 0;
		}
		return true;
	}
	
	public int delete()
	{
		if(isEmpty())
		{
			return -999;
		}
		return arr[front++];
	}
}
