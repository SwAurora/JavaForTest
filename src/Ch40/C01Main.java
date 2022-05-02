package Ch40;

public class C01Main
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Task1");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Task2");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
