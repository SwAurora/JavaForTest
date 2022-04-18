package Ch09;

class C08Car
{
	public String owner;
	public int speed;
	public int fuel;

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

public class C08CarMain
{
	public static void main(String[] args)
	{
		C08Car hong = new C08Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;

		while(true)
		{
			try
			{
				Thread.sleep(500);// 0.5초 일시정지
				hong.Accel();
			}
			catch(Exception e)
			{
				
			}
		}
		
//		while(true)
//		{
//			try
//			{
//				Thread.sleep(500);// 0.5초 일시정지
//				hong.Break();
//			}
//			catch(Exception e)
//			{
//				
//			}
//		}
	}
}