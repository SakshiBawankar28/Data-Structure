package BinarySearch;

import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearch(int []arr, int key)
	{
		int left =0;
		int right = arr.length-1;
		while(left <= right)
		{
			int mid = (left+right)/2;
			
			if(arr[mid] == key)
				return mid;//elem found
			
			if(arr[mid] < key)
				left = mid+1;
			
			if(arr[mid] > key)
				right = mid-1;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.print("Enter the array element : ");
		for(int i=0;  i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("The array element : ");
		for(int i=0;  i< size; i++)
		{
			System.out.print(arr[i] + "  ");
		}
		
		System.out.print("\nEnter the element to found it is present or not : ");
		int elem = sc.nextInt();
		
		int result = binarySearch(arr, elem);
		if(result == -1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found");
		}

	}
}
