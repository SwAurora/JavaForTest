package Ch10;

import java.util.Scanner;

class Grade
{
    int math;
    int science;
    int english;

    public Grade(int math, int science, int english)
    {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    double average()
    {
        return (math+science+english)/3.0;
    }
}

public class Quiz2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = input.nextInt();
        int science = input.nextInt();
        int english = input.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.printf("평균은 %.1f", me.average());
        input.close();
    }
}