package Ch17;

public class C04ArrayMain
{
    public static void main(String[] args)
    {
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//
//        System.out.println("행의 길이: " + arr1.length);
//        System.out.println("1행의 열의 길이: " + arr1[0].length);
//        System.out.println("2행의 열의 길이: " + arr1[1].length);
//
//        for(int i = 0; i < arr1.length; i++)
//        {
//            for(int j = 0; j < arr1[i].length; j++)
//            {
//                System.out.print(arr1[i][j] + "\t");
//            }
//            System.out.println();
//        }

        int[][] arr2 =
                {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90},
                        {100,110,120}
                };

        System.out.println("전체 행길이: " + arr2.length);
        System.out.println("0번째 행길이: " + arr2[0].length);
        System.out.println("1번째 행길이: " + arr2[1].length);
        System.out.println("2번째 행길이: " + arr2[2].length);
        System.out.println("3번째 행길이: " + arr2[3].length);
    }
}
