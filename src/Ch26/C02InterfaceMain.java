package Ch26;

interface Tire
{
    void run();
}

class HankookTire implements Tire
{
    @Override
    public void run()
    {
        System.out.println("한국타이어가 굴러갑니다");
    }
}

class KumhoTire implements Tire
{
    @Override
    public void run()
    {
        System.out.println("금호타이어가 굴러갑니다");
    }
}

class Car
{
    Tire FL = new HankookTire();
    Tire FR = new HankookTire();
    Tire BL = new HankookTire();
    Tire BR = new HankookTire();

    void StartCar()
    {
        FL.run();
        FR.run();
        BL.run();
        BR.run();
    }
}

public class C02InterfaceMain
{
    public static void main(String[] args)
    {
        Car mycar = new Car();
        mycar.StartCar();
        System.out.println();
        mycar.FL = new KumhoTire();
        mycar.BR = new KumhoTire();
        mycar.StartCar();
    }
}
