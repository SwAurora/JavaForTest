package Ch31;

abstract class PMaterial
{
    public abstract void doPrinting();
}

class Plastic extends PMaterial
{
    public void doPrinting()
    {
        System.out.println("Powder 재료로 출력");
    }
}

class Powder extends PMaterial
{
    public void doPrinting()
    {
        System.out.println("Plastic 재료로 출력");
    }
}

class Water extends PMaterial
{
    public void doPrinting()
    {
        System.out.println("Water 재료로 출력");
    }
}

class ThreeDPrinter<T extends PMaterial>
{
    //- meterial : Generic <T> //제너릭 설정할것, Getter and Setter 함수도 같이 만들어보세요 ~
    private T meterial;

    public T getMeterial()
    {
        return meterial;
    }

    public void setMeterial(T meterial)
    {
        this.meterial = meterial;
    }
}

public class C06GenericMain
{
    public static void main(String[] args)
    {
        ThreeDPrinter<Powder> print1 = new ThreeDPrinter<Powder>(); //3d프린트의 제너릭 타입을 Powder로 지정
        //3d프린트<Powder> 객체 생성
        print1.setMeterial(new Powder()); //Powder객체 생성 후 주소를 3d프린트객체로 전달
        print1.getMeterial().doPrinting(); //3d프린트의 get함수로 meterial을 꺼내 doPrinting()

        ThreeDPrinter<Plastic> print2 = new ThreeDPrinter<Plastic>();
        print2.setMeterial(new Plastic());
        print2.getMeterial().doPrinting();

        ThreeDPrinter<Water> print3 = new ThreeDPrinter<Water>();
        print3.setMeterial(new Water());
        print3.getMeterial().doPrinting();
    }

}
