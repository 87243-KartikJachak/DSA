package Question_2;

public class LinkedList 
{
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head, front, rear;;
	
	public LinkedList()
	{
		this.head = null;
		this.front = null;
		this.rear = null;
	}
	
	public void Push(int value)
	{
		Node newnode = new Node(value);
		
		if(head==null)
		{
			newnode.next = null;
		}
		else
		{
			newnode.next = head;
		}
		head = newnode;
	}
	
	public void Enqueue(int value)
	{
		Node newnode = new Node(value);
		
		if(rear==null)
		{
			front = rear = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}

	public void Pop()
	{
		if(isEmpty())
		{
			System.out.println("No elements present!");
		}
		else
		{
			Node temp = head;
			head = head.next;
			temp = null;
		}
	}

	public void Dequeue()
	{
		if(QueueisEmpty())
		{
			System.out.println("No elements present!");
		}
		else
		{
			Node temp = front;
			front = front.next;
			if(front == null)
				temp = null;
		}
	}
	
	public int Peek()
	{
		if(!isEmpty())
		{
			return head.data;
		}
		else
		{
			System.out.println("Stack is empty!!");
		}
		return 0;
	}

	public int getfront()
	{
		if(!isEmpty())
		{
			return front.data;
		}
		else
		{
			System.out.println("Queue is empty!!");
		}
		return 0;
	}

	public int getrear()
	{
		if(!isEmpty())
		{
			return rear.data;
		}
		else
		{
			System.out.println("Queue is empty!!");
		}
		return 0;
	}

	public boolean isEmpty()
	{
		return head == null;
	}

	public boolean QueueisEmpty()
	{
		return front == null && rear == null;
	}

}

