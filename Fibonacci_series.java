package task;
import java.util.Scanner;
class Fibonacci
{
	long a=0,b=1,f=0,l;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit less then 200:-");
		l=sc.nextLong();
		sc.close();
	}
	public void compute()
	{
		for(int i=0;i<=l;i++)
		{
			a=b;
			b=f;
			f=a+b;
			System.out.println(f);
		}
	}
}
public class Fibonacci_series {

	public static void main(String[] args) {
		Fibonacci fb=new Fibonacci();
		fb.input();
		fb.compute();

	}

}
