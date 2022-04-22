package Ch19;

class Client
{
    String name;
    String phone;

    Client(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }
}

class Restaurant
{
    String Storename;
    int roomcnt; // 지점 room 개수
    static int totalroomcnt; // 전체 room 개수
    Client[] list; // 예약 손님 정보 저장용 배열참조변수
    int idx;

    Restaurant(String name, int roomcnt)
    {
        Storename = name;
        this.roomcnt = roomcnt;
        totalroomcnt += roomcnt;
        list = new Client[roomcnt]; // 예약손님정보 저장용 배열
        idx = 0;
    }

    void setReserve(Client client)
    {
        if(roomcnt != 0)
        {
            roomcnt--;
            totalroomcnt--;

            list[idx] = client;
            idx++;
        }
        else // 잔여room 수 부족
        {
            System.out.println("예약이 꽉차서 예약이 불가능합니다");
        }
    }

    void ShowClientInfo()
    {
        System.out.println("===============================");
        System.out.println("지점명: " + Storename);
        for(int i = 0; i < idx; i++)
        {
            System.out.printf("%d . %s : %s\n", (i + 1), list[i].name, list[i].phone);
        }
        System.out.println("===============================");
    }

    void ShowInfo()
    {
        System.out.println("===============================");
        System.out.println("지점명: " + Storename);
        System.out.println("===============================");
        System.out.println("지점 잔여 Room: " + roomcnt);
        System.out.println("전체 잔여 Room: " + totalroomcnt);
    }
}

public class C04StaticMain
{
    public static void main(String[] args)
    {
        Restaurant 서가앤쿡반월당 = new Restaurant("반월당점", 10);
        서가앤쿡반월당.setReserve(new Client("홍길동1", "010-222-3333"));
        서가앤쿡반월당.setReserve(new Client("홍길동2", "010-222-3333"));
        서가앤쿡반월당.setReserve(new Client("홍길동3", "010-222-3333"));

        Restaurant 서가앤쿡감삼점 = new Restaurant("감삼점", 5);
        서가앤쿡감삼점.setReserve(new Client("남길동1", "010-222-3333"));
        서가앤쿡감삼점.setReserve(new Client("남길동2", "010-222-3333"));
        서가앤쿡감삼점.setReserve(new Client("남길동3", "010-222-3333"));
        서가앤쿡감삼점.setReserve(new Client("남길동4", "010-222-3333"));

        서가앤쿡반월당.ShowInfo();
        서가앤쿡반월당.ShowClientInfo();
        서가앤쿡감삼점.ShowInfo();
        서가앤쿡감삼점.ShowClientInfo();


    }
}
