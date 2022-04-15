package Ch09;

class C04Car
{
	public String owner;
	public int speed;
	public int fuel;
	
	public int Accel()
	{
		System.out.println(owner + "님의 차가 가속합니다");
		return 8;
	}
	
	public void Break()
	{
		System.out.println(owner + "님의 차가 감속합니다");
	}
}