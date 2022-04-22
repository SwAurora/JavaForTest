package Ch19;

//자바 메모리 구조
//1) Stack
// - {} 내에서 선언되어지는 변수, {} 벗어나면 소멸 // 지역 변수
//2) Heap
// - 객체 저장용 공간 // new 예약어 생성 + 참조변수, 참조변수 연결 해제시 GC에 의해 소멸
//3) Class(==Method)
// - 공유 메모리 영역 // 생성자함수, 일반함수, static 함수, static 변수

class Simple
{
    static int x; // 공유 메모리 영역에 적재
    int y;

    void ShowXY()
    {
        System.out.println("X= " + x + ", Y= " + y);
    }
}

public class C01StaticMain
{
    public static void main(String[] args)
    {
        Simple.x = 123;
        Simple ob1 = new Simple();
        Simple ob2 = new Simple();

        ob1.ShowXY();
        ob2.ShowXY();
    }
}
