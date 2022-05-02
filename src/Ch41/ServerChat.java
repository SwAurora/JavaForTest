package Ch41;

import java.io.*;
import java.net.*;

public class ServerChat
{
    public static void main(String[] args)
    {
        try
        {
            //1
            ServerSocket server = new ServerSocket(8600);
            //2
            Socket client = server.accept();
            System.out.println(client.getInetAddress() + "에서 접속!");
            //3 스레드 객체 생성
            ServerRecvThread recv = new ServerRecvThread(client);
            ServerSendThread send = new ServerSendThread(client);
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
