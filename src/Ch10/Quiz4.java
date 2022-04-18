package Ch10;

class Rectangle
{
    int x;
    int y;
    int width;
    int height;

    Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square()//사각형 넓이 리턴
    {
        return width * height;
    }

    void show()
    {
        System.out.printf("좌표=(%d,%d), 넓이=(%d)\n", x, y, width * height);
    }

    boolean contains(Rectangle r)
    {
        if (this.x < r.x && this.y < r.y)//이객체의 x가 비교객체 x보다 작고, 이 객체의 y가 비교객체 y보다 작아야함
        {
            //이 객체의 끝 x값이 비교객체의 끝 x값 보다 크고 이 객체의 끝 y값이 비교객체의 끝 y값 보다 큰가?
            return (this.x + this.width) > (r.x + r.width) && (this.y + this.height) > (r.y + r.height);
        }
        return false;
    }
}

public class Quiz4
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());

        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s를 포함합니다.");

    }
}
