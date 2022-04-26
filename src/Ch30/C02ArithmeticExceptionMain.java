package Ch30;

import java.util.Scanner;

public class C02ArithmeticExceptionMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.print("입력: ");
                int num = input.nextInt();
                System.out.print("나눌 수 입력: ");
                int div = input.nextInt();
                System.out.println("결과: " + (num / div));
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
            }
        }
    }
}
