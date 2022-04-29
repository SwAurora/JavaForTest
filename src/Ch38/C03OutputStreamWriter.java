package Ch38;

import java.io.*;

public class C03OutputStreamWriter
{
    public static void main(String[] args)
    {
        try
        {
            OutputStream out = new FileOutputStream("C:\\Users\\rlatj\\Downloads\\tmp.exe");
            OutputStreamWriter wout = new OutputStreamWriter(out);
            wout.write('가');
            wout.write('나');
            wout.write('다');
            wout.flush();
            InputStream in = new FileInputStream("C:\\Users\\rlatj\\Downloads\\tmp.exe");
            InputStreamReader rout = new InputStreamReader(in);
            while(true)
            {
                int data = rout.read();
                if(data == -1)
                    break;
                System.out.println((char)data);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
