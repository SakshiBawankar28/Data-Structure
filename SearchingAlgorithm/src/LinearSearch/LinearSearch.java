package LinearSearch;

import java.util.Scanner;

public class LinearSearch 
{
	public static boolean linearSearch(int []arr, int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		int []arr= new int[size];
		System.out.println("Enter the array element : ");
		for(int i=0; i<size; i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Element of array are : ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\nEnter the element to be found : ");
		int key = sc.nextInt();
		boolean result = linearSearch(arr, key);
		if(result)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
}
