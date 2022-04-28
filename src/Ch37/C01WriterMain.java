package Ch37;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriterMain
{
    public static void main(String[] args)
    {
        try
        {
            //두번째 true : 추가하기, false : 덮어쓰기
            Writer out = new FileWriter("C:\\Users\\rlatj\\Downloads\\test.txt", true);
            out.write("Hello\n");
            out.write("This is \n");
            out.write("문자 OUT 스트림 \n");
            out.write("테스트 \n");

            out.flush();
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
