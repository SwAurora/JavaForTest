package Ch29;

import java.util.Objects;

class Person
{
    String name;
    String addr;
    int age;

    public Person(String name, String addr, int age)
    {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person [name = " + name + ", addr = " + addr + ", age = " + age + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, addr, age);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Person)
        {
            Person down = (Person)obj;
            return this.name.equals(down.name) && this.addr.equals(down.addr) && this.age == down.age;
        }
        return false;
    }
}

public class C06EqualsMain
{
    public static void main(String[] args)
    {
        Person ob1 = new Person("홍길동", "대구", 22);
        Person ob2 = new Person("홍길동", "대구", 22);
        Person ob3 = new Person("이상민", "울산", 55);
        System.out.println("ob1 과 ob2 일치 ? " + ob1.equals(ob2));
        System.out.println("ob2 과 ob3 일치 ? " + ob2.equals(ob3));
    }
}
