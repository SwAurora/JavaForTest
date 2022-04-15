package Ch09;

//메인클래스가 아닌 다른 클래스에는 접근 한정자를 붙이지 않는다
class C03Person
{
	//속성(=필드,멤버변수)
	String name;
	int age;
	float height;
	double weight;
}

public class C03PersonMain
{

	public static void main(String[] args)
	{
		C03Person obj = new C03Person();
		obj.name = "홍길동";
		obj.age = 35;
	}

}
