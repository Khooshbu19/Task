package Task1;
import java.util.Scanner;
class Sort
{
	int size;
	int arr[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		size=sc.nextInt();
		arr=new int [size];
		System.out.println("enter the elements:-");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public void sort()
	{
		int temp;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}	
		}
	}
	public void display()
	{
		System.out.println("the sorted elements are:-");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
public class Sort_num_array {

	public static void main(String[] args) {
		Sort s=new Sort();
		s.input();
		s.sort();
		s.display();

	}

}
