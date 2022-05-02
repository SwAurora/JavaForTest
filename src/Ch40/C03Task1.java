package Ch40;

public class C03Task1 implements Runnable
{
    C01GUI gui;
    C03Task1(C01GUI gui)
    {
        this.gui=gui;
    }

    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                gui.area1.append("TASK1......\n");
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println("인터럽트");
                break;
            }

        }
    }
}
