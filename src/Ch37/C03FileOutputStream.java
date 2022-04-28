package Ch37;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C03FileOutputStream
{
    public static void main(String[] args)
    {
        try
        {
            OutputStream out = new FileOutputStream("C:\\Users\\rlatj\\Downloads\\C03Test.exe");

            out.write('a');
            out.write('b');
            out.write('c');
            out.write('d');

            out.flush();
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
