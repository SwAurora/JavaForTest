package Ch39;

import java.io.*;
import java.net.*;

public class C01ClientSocket
{
    public static void main(String[] args)
    {
        try
        {
            Socket client = new Socket("127.0.0.1", 5050);
            InputStream in = client.getInputStream();
            DataInputStream Din = new DataInputStream(in);

            System.out.println("------서버 메시지 START------");
            System.out.println(Din.readUTF() + "\n");
            System.out.println("------서버 메시지 END------");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
