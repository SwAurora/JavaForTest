package Practice;

import java.util.Scanner;

public class test2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] text = new String[3];
        String str;

        System.out.print("1 문자열을 입력하세요 : ");
        text[0] = sc.nextLine();
        System.out.print("2 문자열을 입력하세요 : ");
        text[1] = sc.nextLine();
        System.out.print("3 문자열을 입력하세요 : ");
        text[2] = sc.nextLine();
        System.out.print("찾을 문자열 입력하세요 : ");
        str = sc.nextLine();

        System.out.println(str + " 포함 여부 : " +  Incontain(str, text));

    }

    public static boolean Incontain(String str, String[] text)
    {
        boolean check = false;
        for(String s : text)
        {
            if(s.contains(str))
            {
                check = true;
                break;
            }
        }
        return check;
    }
}
