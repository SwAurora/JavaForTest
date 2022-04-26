package Ch29;

public class C07ClassExam
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        //방법1
        //Class c1 = Person.class;
        //방법2
        //Class c1 = Class.forName("Ch29.Person");
        //방법3
        Person obj = new Person("홍길동", "대구" , 22);
        Class<?>/*-> 어떤 제너릭 타입이든 다 받겠다*/ c1 = obj.getClass();
        //확인
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getPackage().getName());
    }
}
