package Ch27;

class IPTV extends ColorTV
{
    String ip;
    public IPTV(String ip, int size, int color)
    {
        super(size, color);
        this.ip = ip;
    }

    void printProperty()
    {
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + color + "컬러");
    }
}

public class Quiz2
{
    public static void main(String[] args)
    {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
