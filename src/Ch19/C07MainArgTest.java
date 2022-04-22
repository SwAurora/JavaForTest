package Ch19;

//이클립스
//파일 우클릭 -> Run as -> Run Configurations -> Arguments 탭 -> Program arguments에서 "Hello" "World" 입력

//CMD
//파일 우클릭 -> 속성 -> 경로 복사 -> CMD 활성화 -> cd 경로 붙여넣기 -> javac C07MainArgTest.java ->
//cd.. -> java Ch19.C07MainArgTest 안녕 나는 홍길동이라고 해

public class C07MainArgTest
{
    public static void main(String[] args)
    {
        System.out.println("CNT: " + args.length);
        for(String arg : args)
        {
            System.out.println(arg);
        }
    }
}
