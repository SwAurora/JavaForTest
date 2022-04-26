package Ch30;

public class C05ThrowsMain
{
    public static void ExceptionTest(int div) throws ArithmeticException
    {
        int num = 10;
        System.out.println("결과: " + (num / div));
        System.out.println("함수내부실행코드1");
        System.out.println("함수내부실행코드2");
        System.out.println();
    }

    public static void main(String[] args)
    {
        try
        {
            ExceptionTest(5);
            ExceptionTest(3);
            ExceptionTest(0); // 예외발생
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("실행코드1");
        System.out.println("실행코드2");

    }
}
