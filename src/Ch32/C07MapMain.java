package Ch32;

import java.util.*;

public class C07MapMain
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();

        map.put("aaa", 1234);
        map.put("bbb", 1111);
        map.put("ccc", 2222);

        System.out.println("개수: " + map.size());

        Set<String> set = map.keySet();

        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
        {
            String key = iter.next();
            int value = map.get(key);
            System.out.println("Key : " + key + ", Value: " + value);
        }
    }
}
