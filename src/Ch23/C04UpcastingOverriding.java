package Ch23;

class Super1
{
    int x;
    void Func()
    {
        System.out.println("TEST");
    }
}

class Sub1 extends Super1
{
    int y;

    @Override
    void Func()
    {
        System.out.println("Sub Class Test");
    }

    void ShowXY()
    {
        System.out.printf("x = %d, y = %d\n", x, y);
    }
}

public class C04UpcastingOverriding
{
    public static void main(String[] args)
    {
        Super1 ob1 = new Super1(); // NoCasting
        Sub1 ob2 = new Sub1(); // NoCasting
        Sub1 ob3 = new Sub1(); // NoCasting
        Super1 ob4 = new Sub1(); // UpCasting
//        ob4.y = 10;
//        ob4.ShowXY();
        ob4.Func();

    }
}
