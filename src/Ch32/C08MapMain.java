package Ch32;

import java.util.*;

public class C08MapMain
{
    public static void main(String[] args)
    {
        int num = 0;

        HashMap<String, Integer> user = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("=======M E N U =======");
            System.out.println("1 ID/PW 등록");
            System.out.println("2 ID/PW 조회");
            System.out.println("3 Password 변경");
            System.out.println("4 ID/PW 삭제");
            System.out.println("5 전체조회");
            System.out.println("6 종료");
            System.out.println("=======M E N U =======");
            System.out.print("번호 : ");
            num = sc.nextInt();
            switch(num)
            {
                case 1:
                    System.out.println("등록할 ID와 PW를 입력하세요");
                    String id = sc.next();
                    int pw = sc.nextInt();
                    if(!user.containsKey(id))
                    {
                        user.put(id, pw);
                    }
                    else
                    {
                        System.out.println("이미 등록된 ID 입니다");
                    }
                    break;
                case 2:
                    System.out.println("조회할 ID를 입력하세요");
                    String id2 = sc.next();
                    if(user.containsKey(id2))
                    {
                        System.out.println("ID: " + id2 + "  PW : " + user.get(id2));
                    }
                    else
                    {
                        System.out.println("등록되지 않은 ID 입니다");
                    }
                    break;
                case 3:
                    System.out.println("패스워드를 변경할 ID를 입력하세요");
                    String id3 = sc.next();
                    System.out.println("변경할 PW를 입력하세요");
                    int pw1 = sc.nextInt();
                    if(user.containsKey(id3))
                    {
                        user.replace(id3, pw1);
                    }
                    else
                    {
                        System.out.println("등록되지 않은 ID 입니다");
                    }
                    break;
                case 4:
                    System.out.println("삭제할 ID를 입력하세요");
                    String id4 = sc.next();
                    if(user.containsKey(id4))
                    {
                        user.remove(id4);
                    }
                    else
                    {
                        System.out.println("등록되지 않은 ID 입니다");
                    }
                    break;
                case 5:
                    //전체조회
                    Set<String> set = user.keySet();

                    for(String s : set)
                    {
                        System.out.println("ID: " + s + "  PW : " + user.get(s));
                    }
                    break;
                case 6:
                    System.exit(-1);
                default:
                    System.out.println("다시 입력...");
            }

        }

    }

}