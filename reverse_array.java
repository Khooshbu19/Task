package task;
import java.util.Scanner;
class reverse
{
	int size;
	int arr[];
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		arr=new int [size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public void reverse1()
	{
		System.out.println("The reverse of the elements are:-");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class reverse_array {

	public static void main(String[] args) {
		reverse r=new reverse();
		r.input();
		r.reverse1();
	}

}
