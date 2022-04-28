package Ch37;

import java.io.FileReader;
import java.io.Reader;

public class C01ReaderMain
{
    public static void main(String[] args)
    {
        try
        {
            Reader in = new FileReader("C:\\Users\\rlatj\\Downloads\\test.txt");
            while(true)
            {
                int data = in.read();
                if(data == -1)
                {
                    break;
                }
                System.out.println((char)data);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
