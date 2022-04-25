package Ch25;

//상속
//- 상위클래스로부터 물려받는데
//- 기존내용을 고쳐쓸수도 있고(Overriding)
//- 새로운 멤버 추가(extends)

//Up/Down
//상위클래스 참조변수 = 하위 객체
//1) 상속관계의 모든 하위 객체 연결
// - 함수의 매개변수로 주로 사용
//2) 하위클래스에서 함수를 재정의한 경우
// 상위클래스 참조변수가 사용할 수 있다
//3) 하위클래스에서 새로운멤버 추가시
// 상위클래스 참조변수가 사용할 수 없다
// - 다운캐스팅 해야 접근
// - instanceof

//추상클래스
// - 미완성된 메소드를 하나 이상 포함
// - 자체적으로 객체 생성은 불가
// - 강제성 부여
// - 멤버메소드 정의O
// - 멤버변수 선언O

//인터페이스
//- 멤버변수는 무조건 public static final
//- 멤버함수는 무조건 추상메소드

abstract class Employee
{
    public String name;
    public String addr;
    private String phone;

    Employee(String name, String addr, String phone)
    {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    abstract void ShowInfo();
}

class Regular extends Employee
{
    private int salary;
    private String title;
    public String depart;

    Regular(String name, String addr, String phone, int salary, String title, String depart)
    {
        super(name, addr, phone);
        this.salary = salary;
        this.title = title;
        this.depart = depart;
    }

    @Override
    void ShowInfo()
    {
        System.out.println("이름: " + name);
        System.out.println("주소: " + addr);
        System.out.println("연락처: " + getPhone());
        System.out.println("연봉: " + salary);
        System.out.println("직책: " + title);
        System.out.println("부서: " + depart);
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}

class Temporary extends Employee
{
    private int perPayment;
    private int workingHour;
    private int workingDay;

    Temporary(String name, String addr, String phone, int perPayment, int workingHour, int workingDay)
    {
        super(name, addr, phone);
        this.perPayment = perPayment;
        this.workingHour = workingHour;
        this.workingDay = workingDay;
    }

    public int getPerPayment()
    {
        return perPayment;
    }

    public void setPerPayment(int perPayment)
    {
        this.perPayment = perPayment;
    }

    public int getWorkingHour()
    {
        return workingHour;
    }

    public void setWorkingHour(int workingHour)
    {
        this.workingHour = workingHour;
    }

    public int getWorkingDay()
    {
        return workingDay;
    }

    public void setWorkingDay(int workingDay)
    {
        this.workingDay = workingDay;
    }


    @Override
    void ShowInfo()
    {
        System.out.println("이름: " + name);
        System.out.println("주소: " + addr);
        System.out.println("연락처: " + getPhone());
        System.out.println("근로시간: " + workingHour + "시간");
        System.out.println("근로일수: " + workingDay + "일");
    }
}

public class C01Main
{
    public static void main(String[] args)
    {
        Regular emp1 = new Regular("홍길동", "달서구", "010-111-2222", 3000, "사원", "인사부");
        Temporary emp2 = new Temporary("이하늘", "중구", "010-333-4444", 20000, 100, 20);

        emp1.ShowInfo();
        System.out.println();
        emp2.ShowInfo();


    }
}
