package Ch38;

import java.io.*;
import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C05JSoupMain
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn = Jsoup.connect("https://www.naver.com");
            Document document = conn.get();
           // System.out.println(document);

            URL url = null;

            Elements elements = document.getElementsByTag("img");

            for(int i = 0; i < elements.size(); i++)
            {
                if(elements.get(i).toString().contains("http"))
                {
                    String[] str = elements.get(i).toString().split(" ");
                    int BeginIdx = str[1].indexOf("\"") + 1;
                    String tmp = str[1].substring(BeginIdx, str[1].length()-1);
                    System.out.println(tmp);

                    url = new URL(tmp);
                    InputStream in = url.openStream();
                    BufferedInputStream bin = new BufferedInputStream(in);
                    String filename = "Image";
                    OutputStream out = new FileOutputStream("C:\\Users\\rlatj\\Downloads\\" + filename + i + ".png");
                    int data = 0;
                    while(true)
                    {
                        data = bin.read();
                        if(data == -1)
                        {
                            break;
                        }
                        out.write(data);
                        out.flush();
                    }
                }

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
