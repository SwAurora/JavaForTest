package Ch39;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class C04ServerSocket
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket server = new ServerSocket(7777);
            System.out.println("서비스가 시작되었습니다.");

            Socket client = server.accept();
            System.out.println(client.getInetAddress() + "에서 접속합니다.");

            DataInputStream Din = new DataInputStream(client.getInputStream());
            DataOutputStream Dout = new DataOutputStream(client.getOutputStream());

            Scanner sc = new Scanner(System.in);
            String recv = null;
            String send = null;
            while(true)
            {
                recv = Din.readUTF();
                if(recv.equals("q"))
                {
                    break;
                }
                System.out.print("[Client] : " + recv);
                System.out.print("[Server(q:종료] : ");
                send = sc.nextLine();
                Dout.writeUTF(send);
                Dout.flush();
                if(send.equals("q"))
                {
                    break;
                }
            }
            Dout.close();
            Din.close();
            client.close();
            server.close();
            System.out.println("클라이언트와 연결을 종료합니다.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
