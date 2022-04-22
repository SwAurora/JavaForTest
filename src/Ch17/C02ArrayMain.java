package Ch17;

public class C02ArrayMain
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[3];
        double[] arr2 = new double[3];
        char[] arr3 = new char[3];
        boolean[] arr4 = new boolean[3];
        String[] arr5 = new String[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.println("------idx " + i + "------");
            System.out.println("arr1[" + i + "]" + arr1[i]);
            System.out.println("arr2[" + i + "]" + arr2[i]);
            System.out.println("arr3[" + i + "]" + arr3[i]);
            System.out.println("arr4[" + i + "]" + arr4[i]);
            System.out.println("arr5[" + i + "]" + arr5[i]);
        }
    }
}
