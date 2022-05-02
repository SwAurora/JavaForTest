package Practice;

import java.util.*;

class Cal
{
    ArrayList<Integer> arr = new ArrayList<>();

    private static Cal cal = new Cal();

    private Cal()
    {

    }

    public static Cal getInstance()
    {
        if(cal == null)
        {
            cal = new Cal();
        }
        return cal;
    }

    public int insertVal(int tmp)
    {
        try
        {
            arr.add(tmp);
        }
        catch(Exception e)
        {
            return -1;
        }
        return 0;
    }

    public void ShowVal()
    {
        System.out.println("-------조회-------");
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}

public class test1
{
    public static void main(String[] args)
    {
        Cal cal = Cal.getInstance();

        for(int i = 1; i <= 100; i++)
        {
            cal.insertVal(i);
        }
        cal.ShowVal();
    }
}
