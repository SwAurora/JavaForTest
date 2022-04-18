package Ch09;

class C10Car
{
	public String owner;
	public int speed;
	public int fuel;

	public String cupholder1;
	public String cupholder2;
	
	void AddCupholder(String b1)
	{
		cupholder1 = b1;
	}
	
	void AddCupholder(String b1, String b2)
	{
		cupholder1 = b1;
		cupholder2 = b2;
	}
	
	void ShowInfo()
	{
		System.out.println(owner);
		System.out.println(speed);
		System.out.println(fuel);
		System.out.println(cupholder1);
		System.out.println(cupholder2);
	}
	
	public void Accel()
	{
		speed = speed + 10;
		fuel = fuel - 5;
		if(speed > 200)
		{
			speed = 200;
		}
		if(fuel <= 0)
		{
			fuel = 0;
			System.out.println("연료량 0 .. 가속불가합니다.");
			System.exit(-1);
		}
		else
		{
			System.out.println(owner + "님 차량 가속합니다. 연료량 = " + fuel + " 현재속도 = " + speed);
		}

	}

	public void Break()
	{
		speed = speed - 10;
		System.out.println("감속합니다. 현재속도: " + speed);
		if(speed <= 0)
		{
			speed = 0;
			System.out.println("현재속도 : " + speed + " 차량이 정지했습니다.");
			System.exit(-1);
		}
	}
}

public class C10CarMain
{
	public static void main(String[] args)
	{
		C10Car hong = new C10Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;

		
	}
}