package Ch23;

class A
{
    int a;
}

class B extends A
{
    int b;
}

class C extends A
{
    int c;
}

class D extends B
{
    int d;
}

class E extends C
{
    int e;
}

class F extends D
{
    int f;
}

class G extends E
{
    int g;
}

public class C03InstanceOfMain
{
    public static void UpDownFunc(A obj) // A obj =  -> Up Casting
    {
        //Down Casting
        if(obj instanceof B) // instanceof : 객체 타입 확인 예약어(형변환 가능여부 확인 true / false)
        {
            B down = (B) obj; // DownCasting B
            down.a = 10;
            down.b = 20;
            System.out.println("a = " + down.a + ", b = " + down.b);
        }
        else if(obj instanceof C)
        {
            C down = (C) obj;
            down.a = 11;
            down.c = 20;
            System.out.println("a = " + down.a + ", c = " + down.c);
        }
    }

    public static void main(String[] args)
    {
        UpDownFunc(new B());
        UpDownFunc(new C());
    }
}
