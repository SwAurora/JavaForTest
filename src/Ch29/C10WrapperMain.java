package Ch29;

public class C10WrapperMain
{
    public static void main(String[] args)
    {
        //자동Boxing
        Integer obj = 100;
        System.out.println("obj: " + obj.intValue());
        //자동UnBoxing
        int val = obj;
        System.out.println("val: " + val);

        //자동UnBoxing(산술연산시)
        int result1 = obj+val;
        System.out.println("result1: " + result1);
    }
}
