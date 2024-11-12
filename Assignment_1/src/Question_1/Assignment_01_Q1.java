package Question_1;

import java.util.Scanner;

public class Assignment_01_Q1 
{
	public static int LinearSearch(int arr[], int key)
	{
		for(int i= arr.length-1; i >= 0; i--)
		{
			if(key == arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 77, 99};
		System.out.println("Enter the element to search: ");
		int key = sc.nextInt();
		
		int index = LinearSearch(arr, key);
		if(index == -1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Element found at index: "+index);
		}
	}
}