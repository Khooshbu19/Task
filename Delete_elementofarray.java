package Task1;
	import java.util.Scanner;
	class delete_array
	{
		int size,e;
		int arr[];
		Scanner sc=new Scanner(System.in);
		public void input()
		{
			System.out.println("Enter the size");
			size=sc.nextInt();
			arr=new int[size];
			System.out.println("Enter the elements in array:-");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		public void element()
		{
			System.out.println("Enter the element wich u want to delete");
			e=sc.nextInt();
			for(int i=0;i<size;i++)
			{
				if(arr[i]==e)
				{
					while(i<size-1)
					{
						arr[i]=arr[i+1];
						i++;
					}
					size--;
				}
			}
		}
		public void display()
		{
			for(int i=0;i<size;i++)
			{
			System.out.println(arr[i]);
		}	
	}
	}

public class Delete_elementofarray
{
	public static void main(String []args)
	{
		delete_array d=new delete_array();
		d.input();
		d.element();
		d.display();
	}
}
