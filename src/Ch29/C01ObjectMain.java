package Ch29;

// Object 클래스
// 모든 클래스 중에 제일 상위에 있는 클래스
// 클래스 생성시 Object 클래스의 하위클래스로 지정되면서
// Object 에서 정의한 기능을 사용할 수 있다

class C01Simple
{

}

public class C01ObjectMain
{
    public static void main(String[] args)
    {
        Object ob1 = new Object();
        C01Simple ob2 = new C01Simple();
    }
}
