package Ch29;

public class C08StringBufferMain
{
    public static void main(String[] args)
    {
        //        String str1 = "JAVA";
        //        String str2 = "Android";
        //
        //        System.out.println(str1);
        //        System.out.println(System.identityHashCode(str1));
        //
        //        str1 = str1.concat(str2);
        //        System.out.println(str1);
        //        System.out.println(System.identityHashCode(str1));

        StringBuffer str1 = new StringBuffer("JAVA");
        System.out.println(System.identityHashCode(str1));
        System.out.println(str1);
        System.out.println();

        str1.append(" and ");
        str1.append("Android");
        System.out.println(System.identityHashCode(str1));
        System.out.println(str1);
    }
}
