public class DoubleStack<T> 
{
	private int size;
	private int top1, top2;
	private T[] arr;
	
	public DoubleStack(int size)
	{
		this.size = size;
		top1 = -1;
		top2 = size;
		arr = (T[]) new Object[size];
	}
	
	public boolean isFull()
	{
		return top1+1 == top2;
	}
	
	public boolean isEmpty1()
	{
		return top1 == -1;
	}
	public boolean isEmpty2()
	{
		return top2 == size;
	}
	
	//push methods
	public boolean push1(T data)
	{
		if(isFull())
		{
			return false;
		}
		arr[++top1] = data;
		return true;
	}
	public boolean push2(T data)
	{
		if(isFull())
		{
			return false;
		}
		arr[--top2] = data;
		return true;
	}
	
	//pop methods
	public T pop1()
	{
		if(isEmpty1())
		{
			return null;
		}
		return arr[top1--];
	}
	public T pop2()
	{
		if(isEmpty1())
		{
			return null;
		}
		return arr[top2++];
	}
	
	//display method
	public void display()
	{
		if(isEmpty1() || isEmpty2())
		{
			System.out.println("Stack is empty");
		}
		System.out.print("Stack elements are : ");
		for(int i=0; i<=top1 || i<=top2; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
