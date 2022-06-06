
public class MainClass {
	public static void main(String[] ar)
	{
		Childeren child1 = new Childeren();
		Robot r1 = new Robot();
		//System.out.println(child1.building); // error
		System.out.println(r1.getter());
		System.out.println(r1.x);
		System.out.println(r1.y);
		
		r1.setter("짱가");
		System.out.println(r1.getter());
	}
}
