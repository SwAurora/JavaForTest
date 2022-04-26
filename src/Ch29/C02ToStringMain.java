package Ch29;

class C02Simple
{
    int x;
    int y;

    C02Simple(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "x=" + x + ",y=" + y;
    }
}

public class C02ToStringMain
{
    public static void main(String[] args)
    {
        C02Simple tmp = new C02Simple(10, 20);
        System.out.println(tmp.toString()); //getClass()+'@'+hashCode();
        //toString 재정의시 -> 재정의한 x=10,y=20 결과가 출력
        System.out.println(tmp);            //==tmp.toString();
        System.out.println(tmp.getClass());
        System.out.printf("%x", tmp.hashCode());
    }
}
