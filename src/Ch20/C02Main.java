package Ch20;

class Super
{
    int x;
    int y;

    Super()
    {
        System.out.println("Super()생성자 호출");
        x = 0;
        y = 0;
    }

    Super(int x)
    {
        System.out.println("Super(x)생성자 호출");
        this.x = x;
        y = 0;
    }

    Super(int x, int y)
    {
        System.out.println("Super(x,y)생성자 호출");
        this.x = x;
        this.y = y;
    }

}

class Sub extends Super
{
    int z;

    Sub()
    {
        super();
        System.out.println("Sub()생성자 호출");
    }

    Sub(int x)
    {
        super(x);
        System.out.println("Sub(x)생성자 호출");
    }

    Sub(int x, int y)
    {
        super(x, y);
        System.out.println("Sub(x,y)생성자 호출");
    }

    Sub(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
        System.out.println("Sub(x,y,z)생성자 호출");
    }

    void ShowXYZ()
    {
        System.out.println(x + " " + y + " " + z);
    }
}

public class C02Main
{
    public static void main(String[] args)
    {
        Sub ob1 = new Sub();
        ob1.ShowXYZ();
        Sub ob2 = new Sub(10);
        ob2.ShowXYZ();
        Sub ob3 = new Sub(10, 20);
        ob3.ShowXYZ();
        Sub ob4 = new Sub(10, 20, 30);
        ob4.ShowXYZ();
    }
}
