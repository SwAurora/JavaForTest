package Ch39;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C03ServerSocket
{
    public static void main(String[] args)
    {
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(5060);
            System.out.println("서버 통신 서비스 시작!");

            while(true)
            {
                Socket client = server.accept(); // Client 접속 요청시
                                                 // Client 객체 생성(IN / OUT 스트림 연결)

                //데이터 전송용 스트림
                InputStream in = client.getInputStream();
                DataInputStream Din = new DataInputStream(in);
                String message = Din.readUTF();
                System.out.println(client.getInetAddress() + "로 전송 메시지 시작---");
                System.out.println(message + "\n");
                System.out.println(client.getInetAddress() + "로 부터 메시지 끝---");

                Din.close();
                in.close();
                client.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                server.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
