// A program to check if a number is Armstrong  or not
package task;
import java.util.*;
class armstrong_1
{
		int num,s=0,count=0, num1;
		public void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:-");
			num=sc.nextInt();
			num1=num;
			sc.close();
		}
		public void calculate()
		{
			while(num>0)
			{
				num= num/10;
				count++;
			}
			num=num1;
			do
			{
				int r=num%10;
				s+=Math.pow(r,count);
				num=num/10;
			}while(num>0);
		}
		public void display()
		{
			if(num1==s)
			{
				System.out.println(num1+" is amstrong number");
			}
			else
			{
				System.out.println(num1+" is not amstrong number");
			}
		}
}
	public class armstrong
	{
			public static void main(String []ar)
			{
				armstrong_1 am=new armstrong_1();
				am.input();
				am.calculate();
				am.display();
			}
	}	
