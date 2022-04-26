package Ch27;

class Point3D extends Point
{
    int z;

    public Point3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    void moveUp()
    {
        z++;
    }

    void moveDown()
    {
        z--;
    }

    @Override
    protected void move(int x, int y)
    {
        super.move(x, y);
    }

    protected void move(int x, int y, int z)
    {
        super.move(x, y);
        this.z = z;
    }

    public String toString()
    {
        return "(" + getX() + "," +  getY() + "," + z + ") 의 점";
    }
}

public class Quiz7
{
    public static void main(String[] args)
    {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");
        p.moveUp(); // z축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");
        p.moveDown(); // z축으로 아래쪽 이동
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");
        p.move(100, 200, 300);//x, y, z축으로 이동
        System.out.println(p.toString() + "입니다.");
    }
}
