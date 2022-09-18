package methodHiding;

class Telusko
{
	public static void disp()
	{
		System.out.println("Telusko is parent");
	}
}
class Alien extends Telusko
{
	public static void disp()//we cant override the static methods of parent it behaves like special method
	{
		System.out.println("Alien is telusko");
	}
}
public class HidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telusko t = new Alien();
		((Alien)(t)).disp();
		Telusko t1 = new Telusko();
		t1.disp();
		Alien t2 = new Alien();
		t2.disp();
		Telusko t3 = new Alien();
		t3.disp();
	}

}
