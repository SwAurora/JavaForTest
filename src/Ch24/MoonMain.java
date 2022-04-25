package Ch24;

abstract class Moonbanggu // 추상메소드1이상포함, 자체적 객체생성X, 하위객체 연결시 재정의한 함수접근가능
{
    protected static int SharpCnt = 100; // 상속관계에서 접근가능(protected)
    protected static int PencilCnt = 100;
    abstract public void write();

    void ShowInfo()
    {
        System.out.println("샤프갯수: " + SharpCnt);
        System.out.println("연필갯수: " + PencilCnt);
    }
}

class Pencil extends Moonbanggu
{
    Pencil()
    {
        PencilCnt--;
    }
    @Override
    public void write()
    {
        System.out.println("연필을 씁니다");
    }
}
class Sharp extends Moonbanggu
{
    Sharp()
    {
        SharpCnt--;
    }
    @Override
    public void write()
    {
        System.out.println("샤프를 씁니다");
    }
}

public class MoonMain
{
    public static void MoonWrite(Moonbanggu gu)
    {
        gu.write();
        gu.ShowInfo();
        System.out.println();
    }

    public static void main(String[] args)
    {
//        Moonbanggu gu = new Moonbanggu(); -> 객체 생성 불가
//        Moonbanggu gu;
//        gu = new Pencil(); // 하위 객체 연결
//        gu.write();        // Pencil에서 재정의한 write() 사용가능
//        gu = new Sharp();  // 하위 객체 연결
//        gu.write();        // Sharp에서 재정의한 write() 사용가능

        MoonWrite(new Pencil());
        MoonWrite(new Sharp());
        MoonWrite(new Pencil());
        MoonWrite(new Sharp());
    }
}
