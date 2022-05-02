package Ch40;

public class C02Worker2 implements Runnable
{
    @Override
    public void run()
    {
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
