package Ch32;

import java.util.*;

public class C01ArrayList
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("JAVA");
        list.add("JDBC");
        list.add("OracleDB");
        list.add("JSP");
        list.add("Servlet");
        list.add("SpringFrameWork");
        list.add("JAVA"); // 중복허용

        //개수 확인
        System.out.println("총 개체수: " + list.size());
        //요소 조회
        System.out.println("Idx 2번째 문자열: " + list.get(2));

        //전체 조회
        System.out.println("---------------for문 1번째----------------");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("---------------for문 2번째----------------");
        for(String tmp : list)
        {
            System.out.println(tmp);
        }

        list.remove(0);
        System.out.println("---------------삭제 후 확인--------------");
        for(String tmp : list)
        {
            System.out.println(tmp);
        }
        System.out.println();
        System.out.println(list.toString());

        list.clear();//전체 삭제
    }
}
