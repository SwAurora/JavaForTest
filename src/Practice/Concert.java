package Practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Concert
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> S = new HashMap<>();
        HashMap<Integer, String> A = new HashMap<>();
        HashMap<Integer, String> B = new HashMap<>();

        for(int i = 1; i <= 10; i++)
        {
            S.put(i, "ㅡ");
            A.put(i, "ㅡ");
            B.put(i, "ㅡ");
        }

        Set<Integer> Sset = S.keySet();
        Set<Integer> Aset = A.keySet();
        Set<Integer> Bset = B.keySet();
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while(true)
        {
            System.out.print("예약:1 , 조회:2 , 취소:3 , 끝내기:4 >> ");
            int num = input.nextInt();
            switch(num)
            {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                    int num1 = input.nextInt();
                    switch(num1)
                    {
                        case 1:
                            System.out.print("S >> ");
                            for(int i : Sset)
                            {
                                System.out.print(S.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name = input.next();
                            System.out.print("번호 >> ");
                            int n = input.nextInt();
                            if(S.get(n).equals("ㅡ") && !S.containsValue(name))
                            {
                                S.replace(n, name);
                            }
                            else
                            {
                                System.out.println("예약에 실패했습니다.");
                            }
                            break;
                        case 2:
                            System.out.print("A >> ");
                            for(int i : Aset)
                            {
                                System.out.print(A.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name2 = input.next();
                            System.out.print("번호 >> ");
                            int n2 = input.nextInt();
                            if(A.get(n2).equals("ㅡ") && !A.containsValue(name2))
                            {
                                A.replace(n2, name2);
                            }
                            else
                            {
                                System.out.println("예약에 실패했습니다.");
                            }
                            break;
                        case 3:
                            System.out.print("B >> ");
                            for(int i : Bset)
                            {
                                System.out.print(B.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name3 = input.next();
                            System.out.print("번호 >> ");
                            int n3 = input.nextInt();
                            if(B.get(n3).equals("ㅡ") && !B.containsValue(name3))
                            {
                                B.replace(n3, name3);
                            }
                            else
                            {
                                System.out.println("예약에 실패했습니다.");
                            }
                            break;
                        default:
                            System.out.println("1~3 중의 정수를 입력해주세요.");
                    }
                    break;
                case 2:
                    System.out.print("S >> ");
                    for(int i : Sset)
                    {
                        System.out.print(S.get(i) + " ");
                    }
                    System.out.println();
                    System.out.print("A >> ");
                    for(int i : Aset)
                    {
                        System.out.print(A.get(i) + " ");
                    }
                    System.out.println();
                    System.out.print("B >> ");
                    for(int i : Bset)
                    {
                        System.out.print(B.get(i) + " ");
                    }
                    System.out.println();
                    System.out.println("<<조회를 완료하였습니다.>>");
                    break;
                case 3:
                    System.out.print("좌석 S(1), A(2), B(3) >> ");
                    int num2 = input.nextInt();
                    switch(num2)
                    {
                        case 1:
                            System.out.print("S >> ");
                            for(int i : Sset)
                            {
                                System.out.print(S.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name = input.next();
                            if(S.containsValue(name))
                            {
                                for(int key : S.keySet())
                                {
                                    String value = S.get(key);
                                    if(value.equals(name))
                                    {
                                        S.replace(key, "ㅡ");
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("취소에 실패했습니다.");
                            }
                            break;
                        case 2:
                            System.out.print("A >> ");
                            for(int i : Aset)
                            {
                                System.out.print(A.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name2 = input.next();
                            if(A.containsValue(name2))
                            {
                                for(int key : A.keySet())
                                {
                                    String value = A.get(key);
                                    if(value.equals(name2))
                                    {
                                        A.replace(key, "ㅡ");
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("취소에 실패했습니다.");
                            }
                            break;
                        case 3:
                            System.out.print("B >> ");
                            for(int i : Bset)
                            {
                                System.out.print(B.get(i) + " ");
                            }
                            System.out.println();
                            System.out.print("이름 >> ");
                            String name3 = input.next();
                            if(B.containsValue(name3))
                            {
                                for(int key : B.keySet())
                                {
                                    String value = B.get(key);
                                    if(value.equals(name3))
                                    {
                                        B.replace(key, "ㅡ");
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("취소에 실패했습니다.");
                            }
                            break;
                        default:
                            System.out.println("1~3 중의 정수를 입력해주세요.");
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(-1);
                default:
                    System.out.println("1 ~ 4 중의 정수를 입력해주세요.");
            }
        }
    }
}
