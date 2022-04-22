package Ch22;

class Employee
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

    void ShowBasicInfo()
    {
        System.out.println("이름: " + name);
        System.out.println("주소: " + addr);
        System.out.println("연락처: " + phone);
    }
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

    void ShowRegInfo()
    {
        ShowBasicInfo();
        System.out.println("연봉: " + salary);
        System.out.println("직책: " + title);
        System.out.println("부서: " + depart);
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

    void ShowTempInfo()
    {
        ShowBasicInfo();
        System.out.println("근로시간: " + workingHour + "시간");
        System.out.println("근로일수: " + workingDay + "일");
    }
}

public class C04Main
{
    public static void main(String[] args)
    {
        Regular emp1 = new Regular("홍길동", "달서구", "010-111-2222", 3000, "사원", "인사부");
        Temporary emp2 = new Temporary("이하늘", "중구", "010-333-4444", 20000, 100, 20);

        emp1.ShowRegInfo();
        System.out.println();
        emp2.ShowTempInfo();
    }
}
