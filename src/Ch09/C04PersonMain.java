package Ch09;

//메인클래스가 아닌 다른 클래스에는 접근 한정자를 붙이지 않는다
class C04Person
{
	//속성(=필드,멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	void talk()
	{
		System.out.println(name + "님이 말합니다");
	}
	
	void walk()
	{
		System.out.println(name + "님이 걷습니다");
	}
}

public class C04PersonMain
{

	public static void main(String[] args)
	{
		C04Person obj = new C04Person();
		obj.name = "홍길동";
		obj.age = 35;
		obj.talk();
		obj.walk();
	}

}
