package Ch09;

class C06Simple
{
	int x;
	int y;
	
	void ShowXY()
	{
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class C06SimpleMethod
{
	public static void AddmemberXY(C06Simple obj, int x, int y)
	{
		obj.x = x;
		obj.y = y;
	}
	
	public static int subMemberXY(C06Simple obj)
	{
		if(obj.x > obj.y)
		{
			return obj.x-obj.y;
		}
		else
		{
			return obj.y-obj.x;
		}
		
	}
	
	public static void main(String[] args)
	{
		C06Simple testobj = new C06Simple();
		AddmemberXY(testobj, 10, 20);
		testobj.ShowXY();
		
		int result = subMemberXY(testobj);
		System.out.println("두 수의 차: " + result);
	}
}