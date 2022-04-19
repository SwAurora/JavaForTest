package Ch12;

public class Seller
{
    int Mymoney;
    int AppleCnt;
    int price;

    Seller(int mymoney, int appleCnt, int price)
    {
        Mymoney = mymoney;
        AppleCnt = appleCnt;
        this.price = price;
    }

    int Recieve(int money)
    {
        Mymoney += money;
        int cnt = money / price;
        AppleCnt -= cnt;
        return cnt;
    }

    void ShowInfo()
    {
        System.out.println("보유금액: " + Mymoney);
        System.out.println("사과개수: " + AppleCnt);
    }
}
