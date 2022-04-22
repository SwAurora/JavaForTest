package Ch17;

import java.util.Arrays;
import java.util.Scanner;

public class C03ArrayMain2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];
        System.out.print("숫자 5개 입력 >>> ");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        System.out.println("최소값 : " + a[0]);
        System.out.println("최대값 : " + a[a.length-1]);
    }
}
