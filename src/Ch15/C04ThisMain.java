package Ch15;

class Person
{
    String name;
    String addr;
    int age;

    Person()
    {
        this("없음", "없음", 0);
    }

    Person(String n, String a)
    {
        this(n,a,0);
    }

    Person(String n, String a, int i)
    {
        this.name = n;
        this.addr = a;
        this.age = i;
        System.out.println(name + "," + addr+ "," + age);
        System.out.println();
    }
}

public class C04ThisMain
{
    public static void main(String[] args)
    {
        Person Kim = new Person();
        Person Lee = new Person("이지성", "서울특별시");
        Person Son = new Person("손민수", "대구광역시", 20);
    }
}
