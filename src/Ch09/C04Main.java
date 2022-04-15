package Ch09;

class C04Main
{
	public static void main(String[] args)
	{
		C04Car hong = new C04Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;
		
		hong.Accel();
		hong.Break();
	}
}