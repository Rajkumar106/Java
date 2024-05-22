package Hello;

import java.util.Scanner;

public class Queues {
	
	static int[] array = new int[10];
	static int index = 0;
	
	private static void EnqueueToArray(int enqueue) {
		
		array[index] = enqueue; 
		System.out.println("Enqueue Successful for "+ enqueue);
		index+=1;
		
	}
	
	private static void PrintArray() {
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
			System.out.print(array[i]+" ");
			}
		}
		
	}
	
	private static void DequeueArray() {
		   
		int[] temp = new int[10];
		temp = array;
		
		System.out.println("Dequeued at "+temp[0]);
		
		for(int i=0;i<temp.length-1;i++)
		{
		    array[i]= temp[i+1];
		}
		
		
		
	}

	
	public static void main(String args[])
	{
		System.out.println("Hello world ");
		
		boolean reload = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(reload)
		{
		System.out.println("\nEnter a option: \n 1.Enqueue \n 2.Dequeue \n 3.Print \n 4.Exit");
		int option = sc.nextInt();
		
		switch(option)
		{
		
		case 1:
			System.out.println("Enter a value to enqueue: ");
			int enqueue = sc.nextInt();
			EnqueueToArray(enqueue);
			break;
			
		case 2:
			DequeueArray();
			break;
			
		case 3: 
			System.out.println("Queue Values are : \n");
			PrintArray();
			
			break;
			
		case 4:
			reload = false;
		
		
		}
		
		}
		
		
	

}


	
}



	