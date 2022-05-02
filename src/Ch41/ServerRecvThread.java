package Ch41;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable
{
    Socket client;
    DataInputStream Din;
    ServerRecvThread(Socket client)
    {
        this.client = client;
    }

    @Override
    public void run()
    {
        try
        {
            Din = new DataInputStream(client.getInputStream());
            String recv;
            while(true)
            {
                recv = Din.readUTF();
                if(recv.equals("q"))
                {
                    System.out.println("프로그램을 종료합니다");
                    System.exit(-1);
                }
                System.out.print("[Client] : " + recv);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
