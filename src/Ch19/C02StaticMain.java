package Ch19;

class Rectangle
{
    //기준좌표 설정
    static int x;
    static int y;
    int width;
    int height;
    static int count = 1;
    Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    //끝점 확인 기능
    void ShowEndPoint()
    {
        System.out.println("끝점 :\t(" + (x + width) + "," + (y + height) + ")");
    }

    //시작점, 너비, 높이, 끝점 확인
    void ShowInfo()
    {
        System.out.println("(rec" + count + ")");
        count++;
        System.out.println("시작점:\t(" + x + "," + y +")");
        System.out.println("너비:\t" + width);
        System.out.println("높이:\t" + height);
        ShowEndPoint();
        System.out.println();
    }
}

public class C02StaticMain
{
    public static void main(String[] args)
    {
        Rectangle.x = 10;
        Rectangle.y = 20;

        Rectangle rec1 = new Rectangle(10,10);
        Rectangle rec2 = new Rectangle(5,7);
        Rectangle rec3 = new Rectangle(6,5);

        rec1.ShowInfo();
        rec2.ShowInfo();
        rec3.ShowInfo();
    }
}
