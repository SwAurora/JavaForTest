package Ch09;


class C14Car{
	//속성
	public String owner;
	public String model;
	public int speed;
	public int fuel;
	
	public String cupholder1;
	public String cupholder2;
	
	//생성자
	C14Car(){}
	C14Car(String o,String m, int f,int s){
		this.owner=o;this.model=m;this.fuel=f;this.speed=s;
	} //소유자(owner),모델(model),연료량(fuel),속도(speed)
	C14Car(String o,String m, int f,int s,String b1){
		this.owner=o;this.model=m;this.fuel=f;this.speed=s;this.cupholder1=b1;
	} //소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1)
	C14Car(String o,String m, int f,int s,String b1,String b2){
		this.owner=o;this.model=m;this.fuel=f;this.speed=s;this.cupholder1=b1;
		this.cupholder2=b2;
	} //소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1),홀더2(cup2)
	
	
	
	//기능
	void AddCupholder(String b1) {
		this.cupholder1=b1;
	}
	void AddCupholder(String b1,String b2) {
		this.cupholder1=b1;
		this.cupholder2=b2;
	}
	
	//기능
	public void Accel() {
		
		//연료량 체크
		if(fuel-5<0) {
			fuel=0;
			System.out.println("연료량 0.. 가속불가입니다");
			return ;
		}
		else 
		{
			fuel-=5;
		}
		//속도 증가
		if(speed+10>200) 
		{
			speed=200;
			System.out.println(owner+"님 차량 최대속력입니다");
			System.exit(-1); //프로그램 종료 코드
		}
		else
		{
			speed=speed+10; //speed+=10
			System.out.printf(owner+"님 차량 가속. Fuel=%d,시속=%dkm/h\n",fuel,speed);
		}
	}
	public void Break() {
		if(speed-10<0) {
			speed=0;
			System.out.printf("현재속도 %d km/h..정지합니다\n",speed);
			System.exit(-1); //프로그램 종료 코드
		}else
		{
			speed-=10;
			System.out.printf("현재속도 %d km/h \n",speed);
		}	
	}
	void ShowInfo() {
		System.out.println("소유자 : " + owner);
		System.out.println("현재속도 : " + speed + "km/h");
		System.out.println("연료량 : " + fuel);
		System.out.println("CUP1 : " + cupholder1);
		System.out.println("CUP2 : " + cupholder2);
	}
}
public class C14CarMain {
	public static void main(String[] args) {
			
		C14Car mycar1 = new C14Car("홍길동","아반떼",0,100,"식혜","수정과");
						//소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1),홀더2(cup2)
		
		mycar1.ShowInfo();
		C14Car mycar2 = new C14Car("홍길동","펠리세이드",0,100,"아아");
				//소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1)
		
		System.out.println();
		mycar2.ShowInfo();
		C14Car mycar3 = new C14Car("홍길동","그랜저",0,100);
				//소유자(owner),모델(model),연료량(fuel),속도(speed)
		System.out.println();
		mycar3.ShowInfo();
		
	}

}
