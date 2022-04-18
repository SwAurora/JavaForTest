package Ch09;

import java.util.Scanner;

class C05Simple
{
	Scanner sc = new Scanner(System.in);
	//기능
	//반환o, 매개변수o
	int sum1(int x, int y)
	{
		return x+y;
	}
	
	//반환o, 매개변수x
	int sum2()
	{
		System.out.print("정수 2개 입력: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	//반환x, 매개변수o
	void sum3(int x, int y)
	{
		System.out.printf("sum3(%d, %d)= %d\n", x, y, x+y);
	}
	
	//반환x, 매개변수x
	void sum4()
	{
		System.out.print("1값 입력: ");
		int x = sc.nextInt();
		System.out.print("2값 입력: ");
		int y = sc.nextInt();
		System.out.println(x + " + " +  y + " = " + (x+y));
	}
}

class subclass
{
	Scanner input = new Scanner(System.in);

	int sub1(int x, int y)
	{
		if(x>y)
		{
			return x-y;
		}
		else
		{
			return y-x;
		}
	}
	
	void sub2()
	{
		System.out.print("두 수 입력: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>y)
		{
			System.out.println(x-y);
		}
		else
		{
			System.out.println(y-x);
		}
	}
	
	void sub3(int x, int y)
	{
		if(x>y)
		{
			System.out.println(x-y);
		}
		else
		{
			System.out.println(y-x);
		}
	}
	
	int sub4()
	{
		System.out.print("두 수 입력: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>y)
		{
			return x-y;
		}
		else
		{
			return y-x;
		}
	}
}

public class C05SimpleMethod
{
	public static void main(String[] args)
	{
		C05Simple obj = new C05Simple();
		
		int result1 = obj.sum1(10, 20); //10,20 인자
		System.out.println("result1 = " + result1);
		
		int result2 = obj.sum2(); //10,20 인자
		System.out.println("result2 = " + result2);
		
		obj.sum3(5, 6);
		
		obj.sum4();
	}
}