package Ch16;

import java.util.Scanner;

public class StringAPI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        System.out.println("문자열의 길이: " + A.length());
        System.out.println("2~4까지의 index 만 출력: " + A.charAt(2) + A.charAt(3) + A.charAt(4));
        System.out.println("대문자로 변경: " + A.toUpperCase());
        System.out.println("소문자로 변경: " + A.toLowerCase());
    }
}
