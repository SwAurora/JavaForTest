package Ch19;

//싱글톤 패턴 (객체자체를 공유, 공간 절약)
class C05Company
{
    int x;
    int y;
    int z;
    private static C05Company instance = new C05Company();

    private C05Company()
    {

    }

    public static C05Company getInstance()
    {
        if(instance == null)
        {
            instance = new C05Company();
        }
        return instance;
    }
}

public class C05SingleTonPattern
{
    public static void main(String[] args)
    {
        C05Company com1 = C05Company.getInstance();
        C05Company com2 = C05Company.getInstance();
        System.out.println(com1 == com2);
        com1.x = 10;
        com1.y = 20;
        com1.z = 30;
        System.out.println(com2.x + " , " + com2.y + " , " + com2.z);
    }
}
