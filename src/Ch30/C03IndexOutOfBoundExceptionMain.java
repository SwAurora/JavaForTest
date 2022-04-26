package Ch30;

public class C03IndexOutOfBoundExceptionMain
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30};
        try
        {
            for(int i = 0; i < 4; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("예외발생과 무관하게 처리되는 코드");
        }
        System.out.println("실행코드1");
        System.out.println("실행코드2");
    }
}
