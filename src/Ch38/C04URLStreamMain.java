package Ch38;

import java.io.*;
import java.net.URL;

public class C04URLStreamMain
{
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("https://www.naver.com");
            InputStream in = url.openStream();      //지정된 URL 로부터 inputStream 가져옴
            in = new BufferedInputStream(in);       //기본 스트림에 Buffer 스트림 연결
            Reader r = new InputStreamReader(in);   //Buffer 연결된 스트림에 Reader 스트림 연결

            int data;
            while(true)
            {
                data = r.read();
                if(data == -1)
                {
                    break;
                }
                System.out.print((char)data);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
