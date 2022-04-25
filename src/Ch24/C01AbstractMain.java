package Ch24;

//-----------완성된 클래스---------------
class Super1
{
    void Func()//일반메소드(함수선언+함수정의)
    {

    }
}

class Sub1 extends Super1
{
    @Override
    void Func()
    {
        System.out.println("Sub1에서 재정의한 Func1");
    }
}

//-------------추상 클래스------------------
abstract class Super2
{
    abstract void Func1(); // 추상메서드(함수선언)
}

class Sub2 extends Super2
{
    @Override
    void Func1()
    {
        System.out.println("Sub2에서 재정의한 Func1");
    }
}
public class C01AbstractMain
{
    public static void main(String[] args)
    {
        //일반클래스 상속관계
        Super1 ob1 = new Super1();
        Sub1 ob2 = new Sub1();

        //추상클래스 상속관계
//        Super2 ob3 = new Super2(); -> X (미지정된 함수를 포함하고 있기 때문)
        Sub2 ob4 = new Sub2(); // -> O (물려받은 추상 메소드를 정의했을때만 가능)

        Super2 up = new Sub2(); //Upcasting
        up.Func1();
    }
}
