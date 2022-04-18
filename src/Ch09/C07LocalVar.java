package Ch09;

//지역변수: {}내에서 선언되는 변수
//			{}내에서 공간형성, {}를 벗어나면 공간 소멸
//			stack영역에 저장
class C07Simple
{
	int num = 10;

	void Func1()
	{
		System.out.println("num: " + num);// 멤버변수 num
		int num = 20;
		System.out.println("num: " + num);// 멤버변수 num
	}

	void Func2()
	{
		System.out.println("num: " + num);// 멤버변수 num
		if(num > 0)
		{
			int num = 300;
			System.out.println("if문 안 num: " + num);// if문 안 num
		}
		else
		{
			System.out.println("num: " + num); // 멤버변수 num
		}
	}

	void Func3()
	{
		System.out.println("num: " + num);
		
		int i = 1;
		while(i<num)
		{
			int num = i;
			System.out.println("while 안의 num = " + num);
			i++;
		}
		System.out.println("num: " + num);
	}
}

public class C07LocalVar
{
	public static void main(String[] args)
	{
		C07Simple obj = new C07Simple();
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();
	}
}