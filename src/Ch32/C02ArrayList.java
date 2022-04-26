package Ch32;

import java.util.*;

public class C02ArrayList
{

    public static void main(String[] args)
    {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true)
        {
            System.out.println("=======M E N U=======");
            System.out.println("1 이름 등록");
            System.out.println("2 이름 조회");
            System.out.println("3 이름 삭제");
            System.out.println("4 종료");
            System.out.println("=======M E N U=======");
            System.out.print("번호 : ");
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                    System.out.print("등록할 이름을 입력하세요 >> ");
                    String str1 = sc.next();
                    list.add(str1);
                    break;
                case 2:
                    System.out.print("조회할 이름을 입력하세요 >> ");
                    String str2 = sc.next();
                    if(list.contains(str2))
                    {
                        System.out.println("있습니다");
                    }
                    else
                    {
                        System.out.println("없습니다");
                    }
                    break;
                case 3:
                    System.out.print("삭제할 이름을 입력하세요 >> ");
                    String str3 = sc.next();
                    if(list.contains(str3))
                    {
                        list.remove(str3);
                        System.out.println("삭제완료");
                    }
                    else
                    {
                        System.out.println("삭제실패");
                    }
                    //이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패"
                    break;
                case 4:
                    System.exit(-1);
                default:
                    System.out.println("다시 입력...");
            }
        }

    }

}