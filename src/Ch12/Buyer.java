package Ch12;

public class Buyer
{
    int Mymoney;
    int AppleCnt;

    Buyer(int money, int cnt)
    {
        this.Mymoney = money;
        this.AppleCnt = cnt;
    }

    void pay(Seller seller, int money)
    {
        Mymoney -= money;
        int cnt = seller.Recieve(money);
        AppleCnt += cnt;
    }

    void ShowInfo()
    {
        System.out.println("보유금액: " + Mymoney);
        System.out.println("사과개수: " + AppleCnt);
    }
}
