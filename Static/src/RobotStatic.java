public class RobotStatic
{
	int x, y;   //인스턴스 변수
	int power;  //인스턴스 변수
	int price;  //인스턴스 변수
	String name;
	int id;
	static int robotCount = 0; //클래스 변수, 공유해서 사용할 수 있는 변수
	RobotStatic(int power, int price, String name)
	{
		this.power = power;
		this.price = price;
		this.name = name;
		
		robotCount += 1; // Robot
		
	}
	public static void main(String args[])
	{
		System.out.print("지금까지 생성된 로봇 수 = ");
	}
}