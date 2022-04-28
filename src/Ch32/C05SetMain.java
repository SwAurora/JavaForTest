package Ch32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C05SetMain
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();

        set.add("JAVA");
        set.add("Android");
        set.add("JSP");
        set.add("OracleDB");
        set.add("SpringFramework"); // 중복 허용X

        System.out.println("사이즈 : " + set.size());

        Iterator<String> iter = set.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        set.remove("JAVA");
        set.clear();
    }
}
