
public class Robot {
 int x, y;
 void mySituation()
 {
	 System.out.print("나의 위치 x: " + x + " , y: " + y);
 }
}

class FishRobot extends Robot{
	int depth;
	FishRobot(int x, int y, int depth)
	{
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
	
}