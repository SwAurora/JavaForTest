package Ch42;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable
{
    Socket client;
    DataInputStream Din;
    ClientUI gui;
    ClientRecvThread(Socket client, ClientUI ui)
    {
        this.client = client;
        this.gui = ui;
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
                    gui.area.append("프로그램을 종료합니다");
                    System.exit(-1);
                }
                gui.area.append("[Server] : " + recv + "\n");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
