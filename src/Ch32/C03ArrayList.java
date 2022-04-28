package Ch32;

import java.util.ArrayList;

class Profile
{
    String name;
    String addr;
    String phone;

    public Profile(String name, String addr, String phone)
    {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "Profile{" + "name='" + name + '\'' + ", addr='" + addr + '\'' + ", phone='" + phone + '\'' + '}';
    }
}

public class C03ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Profile> list = new ArrayList<>();

        list.add(new Profile("홍길동", "대구", "010-222-3333"));
        list.add(new Profile("정우균", "서울", "010-333-4444"));
        list.add(new Profile("이태수", "울산", "010-555-3333"));

        for(Profile tmp : list)
        {
            System.out.println(tmp.toString());
        }
    }
}
