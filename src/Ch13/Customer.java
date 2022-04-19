package Ch13;

public class Customer
{
    int money;
    int cokeCnt;

    Customer(int money, int cokeCnt)
    {
        this.money = money;
        this.cokeCnt = cokeCnt;
    }

    void Buy(Store store, int money)
    {
        this.money -= money;
        int count = store.Sell(money);
        cokeCnt += count;
    }

    void showInfo()
    {
        System.out.println("잔금" + money);
        System.out.println("구매한 콜라 갯수" + cokeCnt);
    }
}
