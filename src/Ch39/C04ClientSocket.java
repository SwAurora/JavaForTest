package Ch39;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class C04ClientSocket
{
    public static void main(String[] args)
    {
        try
        {
            Socket client = new Socket("127.0.0.1", 7777);
            System.out.println("서버와 연결이 완료되었습니다");
            DataInputStream Din = new DataInputStream(client.getInputStream());
            DataOutputStream Dout = new DataOutputStream(client.getOutputStream());

            Scanner sc = new Scanner(System.in);
            String recv = null;
            String send = null;

            while(true)
            {
                System.out.print("[Client (q:종료) : ");
                send = sc.nextLine();
                Dout.writeUTF(send);
                Dout.flush();
                recv = Din.readUTF();
                if(recv.equals("q"))
                {
                    break;
                }
                System.out.print("[Server] : " + recv);
            }
            Dout.close();
            Din.close();
            client.close();
            System.out.println("서버와 연결을 종료합니다");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
