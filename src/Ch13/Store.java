package Ch13;

public class Store
{
    int money;
    int cokeCnt;
    int price;

    Store(int money, int cokeCnt, int price)
    {
        this.money = money;
        this.cokeCnt = cokeCnt;
        this.price = price;
    }

    int Sell(int money)
    {
        this.money += money;
        int count = money / price;
        cokeCnt -= count;
        return count;
    }

    void showInfo()
    {
        System.out.println("잔고: " + money);
        System.out.println("재고: " + cokeCnt);
    }
}
