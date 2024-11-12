package Question_2;

import java.util.Scanner;

public class Assignment_01_Q2 
{

	public static int LinearSearch(int arr[], int key)
	{
		int comparisons = 0;
		for(int i = 0; i<arr.length-1; i++)
		{
			comparisons++;
			if(key == arr[i])
			{
				System.out.println("No of comparsions for Linear Search: "+comparisons);
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int arr[], int key)
	{
		int comparsions = 0;
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		
		while(left <= right)
		{
			comparsions++;
			mid = (left + right) / 2;
			if(key == arr[mid])
			{
				System.out.println("No of comparsions for Binary Search: "+comparsions);
				return mid;
			}
			else if(key < arr[mid])
			{
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
		}
		System.out.println("No of comparsions for Binary Search: "+comparsions);				
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		System.out.println("Enter the element to search: ");
		int key = sc.nextInt();
		
		int linearIndex = LinearSearch(arr, key);
		int binaryIndex = BinarySearch(arr, key);
		
		if(linearIndex == -1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Element found using Linear Search at index: "+linearIndex);
		}

		if(binaryIndex == -1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Element found using Binary Search at index: "+binaryIndex);
		}

	}
	
}
