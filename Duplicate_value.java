package Task1;
import java.util.Scanner;
class duplicate
{
	int size;
	int arr[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:-");
		 size=sc.nextInt();
		 arr=new int[size];
		System.out.println("enter the elements:-");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public void process()
	{
		System.out.println("\nArray after deleting Duplicate number : ");
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{	
				if(arr[i]==arr[j])
				{
					while (j<size-1)
					{
						arr[j]=arr[j+1];	
						j++;
					}
					size--;		
				}
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
public class Duplicate_value {

	public static void main(String[] args) {
		duplicate d=new duplicate();
		d.input();
		d.process();
		d.display();
	}

}
