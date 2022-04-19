package Ch13;

public class Main
{
    public static void main(String[] args)
    {
        Store ConvenienceStore = new Store(300000, 100, 1500);
        Customer A = new Customer(10000, 0);
        Customer B = new Customer(30000, 0);
        Customer C = new Customer(50000, 0);

        A.Buy(ConvenienceStore, 6000);
        B.Buy(ConvenienceStore, 9000);
        C.Buy(ConvenienceStore, 15000);

        ConvenienceStore.showInfo();
        System.out.println();
        A.showInfo();
        B.showInfo();
        C.showInfo();
    }
}
