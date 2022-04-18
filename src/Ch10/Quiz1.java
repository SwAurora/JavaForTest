package Ch10;

class TV
{
    String a;
    int b;
    int c;

    TV(String a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class Quiz1
{
    public static void main(String[] args)
    {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}