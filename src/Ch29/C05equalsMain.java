package Ch29;

import java.util.Objects;

class C05Simple
{
    int x;
    int y;

    C05Simple(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) // Object obj = ob2;
    {
        if(obj instanceof C05Simple)
        {
            C05Simple down = (C05Simple) obj;
            return this.x == down.x && this.y == down.y;
        }
        return false;
    }
}

public class C05equalsMain
{
    public static void main(String[] args)
    {
        C05Simple ob1 = new C05Simple(10, 20);
        C05Simple ob2 = new C05Simple(10, 20);
        C05Simple ob3 = new C05Simple(10, 30);

        System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
        System.out.println("ob1.equals(ob3) ? " + ob1.equals(ob3));
        System.out.println("ob2.equals(ob3) ? " + ob2.equals(ob3));
    }
}
