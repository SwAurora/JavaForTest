package Ch10;

import java.util.Arrays;
import java.util.Scanner;

class Circle
{
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show()
    {
        System.out.print("(" + x + "," + y + ")" + radius);
    }
    public double area()
    {
        return x*y*radius;
    }

}

public class Quiz56
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle[] c = new Circle[3];
        double[] d = new double[3];
        for (int i = 0; i < c.length; i++)
        {
            System.out.print("x , y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for (int i = 0; i < c.length; i++)
        {
           d[i] = c[i].area();
        }
        if(d[0] > d[1])
        {
            if (d[0] > d[2])
            {
                c[0].show();
            }
            else
            {
                c[2].show();
            }
        }
        else
        {
            if (d[1] < d[2])
            {
                c[2].show();
            }
            else
            {
                c[1].show();
            }
        }
        sc.close();
    }
}
