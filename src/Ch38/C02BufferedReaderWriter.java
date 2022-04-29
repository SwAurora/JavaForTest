package Ch38;

import java.io.*;

public class C02BufferedReaderWriter
{
    public static void main(String[] args)
    {
        try
        {
            Reader in = new FileReader("C:\\Users\\rlatj\\Downloads\\Dialog.txt"); //기본스트림
            BufferedReader bin = new BufferedReader(in);                                    //보조스트림 연결
            Writer out = new FileWriter("C:\\Users\\rlatj\\Downloads\\CopyDL.txt");//기본스트림
            BufferedWriter bout = new BufferedWriter(out);                                  //보조스트림 연결
            int data = 0;
            while(true)
            {
                data = bin.read();
                if(data == -1)
                {
                    break;
                }
                System.out.print((char)data);
                bout.write(data);
                bout.flush();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
