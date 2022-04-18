package Ch10;

import java.util.Scanner;

class Day
{
    private String work;

    public void set(String work)
    {
        this.work = work;
    }

    public String get()
    {
        return work;
    }

    public void show()
    {
        if (work == null)
        {
            System.out.println("없습니다.");
        }
        else
        {
            System.out.println(work + "입니다.");
        }
    }

}

class MonthSchedule
{
    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    String str1;
    Day[] day;

    MonthSchedule(int date)
    {
        day = new Day[date];
        for (int i = 0; i < day.length; i++)
        {
            day[i] = new Day();
        }

    }

    void input()
    {
        System.out.print("날짜(1~30)? ");
        int num2 = input.nextInt();
        System.out.println("할일(빈칸없이입력)? ");
        String str1 = input.next();
        day[num2 - 1].set(str1);

        run();
    }

    void view()
    {
        System.out.print("날짜(1~30)? ");
        int num3 = input.nextInt();
        System.out.print(num3 + "의 할일은 ");
        day[num3 - 1].show();
        run();
    }

    void finish()
    {
        System.out.println("프로그램을 종료합니다.");
        System.exit(-1);
    }

    void run()
    {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true)
        {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3 >> ");
            int num1 = input.nextInt();
            switch (num1)
            {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    this.finish();
                    break;
                default:
                    System.out.println("1~3까지의 숫자만 입력");
                    break;

            }
        }
    }
}

public class Quiz7
{
    public static void main(String[] args)
    {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
