public class Robot {

	int x;
	int y;
	int power;
	String color;
	String name;
	
	Robot(int x, int y, String color, String name)
	{
		this.x = x;
		this.y = y;
		this.color = color;
		this.name = name;
	}
	
	void moveBack()
	{
		y -= 5; //y 값을 5만큼 감소시키기
	}
	
	void introduceMe()
	{
		System.out.print("나의 이름" + name + "입니다.");
		System.out.print("나의 색은" + color + "입니다.");
	}
}