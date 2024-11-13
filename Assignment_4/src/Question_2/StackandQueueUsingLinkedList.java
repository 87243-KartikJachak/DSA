package Question_2;

import java.util.Scanner;

public class StackandQueueUsingLinkedList 
{
	static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		int choice=0;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
					System.out.println("Enter the data to add : ");
					l.Push(sc.nextInt());
					
			break;
			case 2:
					System.out.println("Elements poped using stack : "+l.Pop());					
			break;
			
			case 3:
				System.out.println("Elements peeked using stack : "+l.Peek());					
			break;

			case 4:
					System.out.println("Enter the data to add : ");
					l.Enqueue(sc.nextInt());
			break;

			case 5:
					System.out.println("Elements Dequeue : "+l.Dequeue());					
			break;
			
			case 6:
					System.out.println("Elements in front of Queue : "+l.getfront());					
			break;

			default: System.out.print("Invalid choice!");
			}
		}
		sc.close();
	}
	static int menu()
	{
		System.out.println("-------------------------");
		System.out.println("Stack and Queue using LinkedList Menu");
		System.out.println("1.Add elements using stack");
		System.out.println("2.Pop elements using stack");
		System.out.println("3.Peek using statck");
		System.out.println("4.Enqueue in a Queue");	
		System.out.println("5.Dequeue in a Queue");
		System.out.println("6.Get front of Queue");
		System.out.println("7.Get rear of Queue");
		System.out.print("\nEnter choice : ");
		return sc.nextInt();
	}
}
	}

}
