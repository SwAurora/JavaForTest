package Ch37;

import java.io.*;

public class C02FileCopyMain
{
    public static void main(String[] args)
    {
        try
        {
            Reader in = new FileReader("C:\\Users\\rlatj\\Downloads\\Original.txt");
            Writer out = new FileWriter("C:\\Users\\rlatj\\Downloads\\CopyFile.txt");

            char[] buffer = new char[100];

            while(true)
            {
                int num = in.read(buffer);
                if(num == -1)
                {
                    break;
                }
                out.write(buffer);  //지정된 위치에 쓰기
                out.flush();        //버퍼 비우기
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
