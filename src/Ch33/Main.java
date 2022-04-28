package Ch33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, Service> map = new HashMap<>();

        map.put("도서관리", new BookService());
        map.put("회원관리", new MemberService());

        Scanner input = new Scanner(System.in);
        int num = 0;
        while(true)
        {
            System.out.println("=======M E N U =======");
            System.out.println("1 도서관리");
            System.out.println("2 회원관리");
            System.out.println("=======M E N U =======");
            System.out.print("번호 : ");
            num = input.nextInt();
            switch(num)
            {
                case 1:
                    System.out.print("번호(1:등록,2:수정,3:삭제): ");
                    num = input.nextInt();
                    Service bs = map.get("도서관리");
                    if(num == 1)
                    {
                        bs.Insert();
                    }
                    else if(num == 2)
                    {
                        bs.Update();
                    }
                    else
                    {
                        bs.Delete();
                    }
                    break;
                case 2:
                    break;
            }
        }
    }
}
