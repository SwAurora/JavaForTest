package Ch19;

class Calculator
{
    int x;
    int y;

    private static Calculator calc = new Calculator();

    private Calculator()
    {

    }

    public static Calculator getInstance()
    {
        if(calc == null)
        {
            calc = new Calculator();
        }
        return calc;
    }
    void Sum()
    {
        System.out.println("합: " + (x+y));
    }
    void Sub()
    {
        System.out.println("빼기: " + (x-y));
    }
    void Mul()
    {
        System.out.println("곱하기: " + (x*y));

    }
    void Div()
    {
        System.out.println("나누기: " + (double)x/y);
    }

}

public class C06SingleTonPattern
{
    public static void main(String[] args)
    {
        Calculator cal1 = Calculator.getInstance();
        Calculator cal2 = Calculator.getInstance();

        cal1.x = 10;
        cal2.y = 20;
        cal1.Sum();
        cal2.Div();
    }
}