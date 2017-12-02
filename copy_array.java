package task;
import java.util.Scanner;
class copy
{
	int size;
	int  arr[];
	int arr1[];
	public void input(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		arr=new int[size];
		arr1=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public void copying()
	{
		for(int i=0;i<size;i++)
		{
			arr1[i]=arr[i];
		}
	}
	public void display()
	{
		System.out.println("The elements of first array\n===========");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("The elements of second array\n============");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}

public class copy_array {

	public static void main(String[] args) {
		copy c=new copy();
		c.input();
		c.copying();
		c.display();
	}

}
