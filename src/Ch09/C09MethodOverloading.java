package Ch09;

class C09Simple
{
	int sum(int x, int y)
	{
		return x + y;
	}

	int sum(int x, int y, int z)
	{
		return x + y + z;
	}

	double sum(double x, double y)
	{
		return x + y;
	}
	
	double sum(int x, double y, float z)
	{
		return x + y + z;
	}
	
	String sum(String str1, String str2)
	{
		return str1 + str2;
	}
}

public class C09MethodOverloading
{
	public static void main(String[] args)
	{
		C09Simple ob = new C09Simple();
		System.out.println("sum(int x, int y) : " + ob.sum(10, 20));
		System.out.println("sum(int x, int y, int z) : " + ob.sum(10, 20, 30));
		System.out.println("sum(double x, double y) : " + ob.sum(10.5, 20.4));
	}
}