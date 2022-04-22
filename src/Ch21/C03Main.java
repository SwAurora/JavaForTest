package Ch21;

class Computer
{
    public String SN;
    public String CPUSpec;
    public String RAMSpec;
    public String DISKSpec;

    Computer(String SN, String CPUSpec, String RAMSpec, String DISKSpec)
    {
        this.SN = SN;
        this.CPUSpec = CPUSpec;
        this.RAMSpec = RAMSpec;
        this.DISKSpec = DISKSpec;
        System.out.println("Computer 생성자 호출");
    }

    public void PowerON()
    {
        System.out.println(SN + "전원을 켭니다");
    }

    public void PowerOFF()
    {
        System.out.println(SN + "전원을 끕니다");
    }

    public void ShowInfo()
    {
        System.out.println("--------사양--------");
        System.out.println(SN);
        System.out.println(CPUSpec);
        System.out.println(RAMSpec);
        System.out.println(DISKSpec);
        System.out.println("--------------------");
    }
}

class Notebook extends Computer
{
    public int battery;

    Notebook(String SN, String CPUSpec, String RAMSpec, String DISKSpec, int battery)
    {
        super(SN, CPUSpec, RAMSpec, DISKSpec);
        this.battery = battery;
        System.out.println("Notebook 생성자 호출");
    }

    public void Move()
    {
        System.out.println(SN + "노트북이 이동합니다");
    }

}

public class C03Main
{
    public static void main(String[] args)
    {
        Notebook MyLgGram = new Notebook("1-2-3-4", "I7", "16G", "1T", 100);

        MyLgGram.ShowInfo();
        MyLgGram.PowerON();
        MyLgGram.Move();
        MyLgGram.PowerOFF();
    }
}
