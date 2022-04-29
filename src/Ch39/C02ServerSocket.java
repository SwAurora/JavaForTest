package Ch39;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02ServerSocket
{
    public static void main(String[] args)
    {
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(5050);
            System.out.println("서버 통신 서비스 시작!");

            Scanner sc = new Scanner(System.in);
            while(true)
            {
                Socket client = server.accept(); // Client 접속 요청시
                                                 // Client 객체 생성(IN / OUT 스트림 연결)
                System.out.print("서버 전송 메시지: ");
                String tmp = sc.next();

                //데이터 전송용 스트림
                OutputStream out = client.getOutputStream();
                DataOutputStream Dout = new DataOutputStream(out);

                Dout.writeUTF(tmp);
                Dout.flush();

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
