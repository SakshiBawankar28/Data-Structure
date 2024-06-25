public class Stack<T>
{
	private int size;
	private int top;
	private T[] arr;
	
	public Stack(int size)
	{
		this.size = size;
		top = -1;
		arr = (T[]) new Object[size];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	
	//insert element into the stack
	public boolean push(T data)
	{
		if(isFull())
		{
			return false;
		}
		arr[++top] = data;
		return true;
	}
	
	//delete element from the stack
	public T pop()
	{
		if(isEmpty())
		{
			return null;
		}
		return arr[top--];
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			return null;
		}
		return arr[top];
	}
	
	//display method
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else 
		{
			System.out.print("Stack elements are : ");
			for(int i=0; i<=top; i++)
			{
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
	}
}
