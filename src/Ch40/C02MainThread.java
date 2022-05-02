package Ch40;

public class C02MainThread
{
    public static void main(String[] args)
    {
        //작업스레드 객체 생성
        C02Worker1 worker1 = new C02Worker1();
        C02Worker2 worker2 = new C02Worker2();

        //독립된 스레드 공간에 작업스레드 전달
        Thread th1 = new Thread(worker1);
        Thread th2 = new Thread(worker2);

        th1.start();
        th2.start();

        for(int i = 0; i < 10; i++)
        {
            System.out.println("MAIN Thread");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
