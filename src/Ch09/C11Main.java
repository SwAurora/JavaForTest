package Ch09;

class C11Computer
{
	String SN;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	int StartApp(String app1)
	{
		System.out.println(app1 + "을 실행합니다.");
		return 1;
	}
	
	int StartApp(String app1, String app2)
	{
		System.out.println(app1 + ", " + app2 + "을 실행합니다.");
		return 2;
	}
	
	void ShowInfo()
	{
		System.out.println(SN);
		System.out.println(CPUSpec);
		System.out.println(RAMSpec);
		System.out.println(DISKSpec);
	}
}

public class C11Main
{
	public static void main(String[] args)
	{
		C11Computer Lggram123 = new C11Computer();
		Lggram123.SN = "1-2-3-4";
		Lggram123.CPUSpec="I7";
		Lggram123.RAMSpec="16G";
		Lggram123.DISKSpec="1Tb";
		
		Lggram123.StartApp("Chrome URL: www.naver.com");
		Lggram123.StartApp("Excel 1.xls", "NotePad");
		Lggram123.ShowInfo();
	}
}