
public class RobotStatic{
	public static void main(String args[])
	{
		Robot1 r1 = new Robot1(600, 100, "짱가");
		Robot1 r2 = new Robot1(1000, 200, "마징가");
		Robot1 r3 = new Robot1(1000, 200, "태권브이");
		int num = Robot1.robotCount; // 정적변수 = 클래스 변수

		System.out.print("지금까지 생성된 로봇 수 = " + num);
	}
}