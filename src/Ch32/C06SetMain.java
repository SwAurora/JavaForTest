package Ch32;

import java.util.*;

public class C06SetMain
{
    public static void main(String[] args)
    {
        Random rand = new Random();
//        while(true)
//        {
//            System.out.println(rand.nextInt(45));
//            try
//            {
//                Thread.sleep(500);
//            }
//            catch(InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
        HashSet<Integer> lotto = new HashSet<>();

        while(lotto.size() < 6)
        {
            lotto.add(rand.nextInt(45) + 1);
        }
//        Iterator<Integer> iter = lotto.iterator();
//        while(iter.hasNext())
//        {
//            System.out.print(iter.next() + " ");
//        }

        ArrayList<Integer> list = new ArrayList<>(lotto);
        Collections.sort(list);
        for(int i : list)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        Collections.sort(list,Collections.reverseOrder());
        for(Integer i : list)
        {
            System.out.print(i + " ");
        }
    }
}
