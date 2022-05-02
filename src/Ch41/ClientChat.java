package Ch41;

import java.io.*;
import java.net.*;

public class ClientChat
{
    public static void main(String[] args)
    {
        try
        {
            Socket client = new Socket("localhost", 8600);

            //3 스레드 객체 생성
            ClientRecvThread recv = new ClientRecvThread(client);
            ClientSendThread send = new ClientSendThread(client);
            Thread th1 = new Thread(recv);
            Thread th2 = new Thread(send);
            //4 스레드 동작
            th1.start();
            th2.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
