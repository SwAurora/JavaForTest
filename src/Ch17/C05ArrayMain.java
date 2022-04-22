package Ch17;

import java.util.Scanner;

public class C05ArrayMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[5][3];
        String[] subject = {"국어", "수학", "영어"};

        for(int i = 0; i < score.length; i++)
        {
            System.out.println((i+1) + "번째 학생의 성적을 입력하세요 (국/영/수)");
            for(int j = 0; j < score[i].length; j++)
            {
                score[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for(int i = 0; i < score.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < score[i].length; j++)
            {
                sum += score[i][j];
            }
            System.out.printf("%d번째 학생 총점: %d 평균: %.1f\n", i+1, sum, (double)sum/score[i].length);
        }
        System.out.println();
        for(int i = 0; i < subject.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < score.length; j++)
            {
                sum += score[j][i];
            }
            System.out.printf("%s 총점: %d 평균: %.1f\n", subject[i], sum, (double)sum/score.length);
        }
    }
}
