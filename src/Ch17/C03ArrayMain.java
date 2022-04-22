package Ch17;

import java.util.Scanner;

public class C03ArrayMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];
        int sum = 0;
        System.out.print("숫자 5개 입력 >>> ");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = input.nextInt();
            sum += a[i];
        }

        System.out.println("모든 수의 합: " + sum);
        System.out.println("모든 수의 평균: " + (double)sum / a.length);
    }
}
