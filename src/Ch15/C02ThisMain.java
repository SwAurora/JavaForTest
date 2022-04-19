package Ch15;

class C02Simple
{
    int x;
    int y;
    int z;

    C02Simple(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class C02ThisMain
{
    public static void main(String[] args)
    {
        C03Simple ob = new C03Simple(10,20,30);
    }
}