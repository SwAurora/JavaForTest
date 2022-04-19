package Ch15;

class Simple
{
    private int x;
    private int y;

    int Getx()
    {
        return x;
    }
    void Setx(int x)
    {
        this.x = x;
    }

    int Gety()
    {
        return y;
    }
    void Sety(int y)
    {
        this.y = y;
    }
}

public class GetterSetter
{
    public static void main(String[] args)
    {
        Simple obj1 = new Simple();
        Simple obj2 = new Simple();

        obj1.Setx(10);
        obj1.Sety(20);
        obj2.Setx(30);
        obj2.Sety(40);

        System.out.println("obj1의 x,y " + obj1.Getx() + "," + obj1.Gety());
        System.out.println("obj2의 x,y " + obj2.Getx() + "," + obj2.Gety());
    }
}
