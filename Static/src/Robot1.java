
public class Robot1
{
	int x, y;   //인스턴스 변수
	int power;  //인스턴스 변수
	int price;  //인스턴스 변수
	String name;
	int id;
	static int robotCount = 0; //클래스 변수, 공유해서 사용할 수 있는 변수
	Robot1(int power, int price, String name)
	{
		this.power = power;
		this.price = price;
		this.name = name;
		
		robotCount += 1; // Robot
		id = robotCount;
		
	}
}