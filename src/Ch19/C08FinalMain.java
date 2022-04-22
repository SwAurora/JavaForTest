package Ch19;

//상수
//리터럴 상수: 이름부여 X
//심볼릭 상수: 이름부여 O

public class C08FinalMain
{
    public static void main(String[] args)
    {
        int num1 = 10;
        final int NUM2 = 20; // 심볼릭 상수
        num1 = 200;
        // NUM2 = 100; -> 상수값 변경 불가
    }
}
