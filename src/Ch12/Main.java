package Ch12;

public class Main
{
    public static void main(String[] args)
    {
        Seller 사과장수1 = new Seller(100000, 100, 1000);

        Buyer 홍길동 = new Buyer(10000, 0);
        Buyer 정우균 = new Buyer(10000, 0);
        Buyer 이준영A = new Buyer(10000, 0);

        홍길동.pay(사과장수1, 2000);
        정우균.pay(사과장수1, 5000);
        이준영A.pay(사과장수1, 1000);

        System.out.println("---------판매자----------");
        사과장수1.ShowInfo();
        System.out.println("---------구매자----------");
        홍길동.ShowInfo();
        System.out.println();
        정우균.ShowInfo();
        System.out.println();
        이준영A.ShowInfo();
    }
}
