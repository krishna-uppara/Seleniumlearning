abstract class ABC
{
	//public abstract void test();
	public void test1()
	{
		System.out.println("con ABC method");
	}
}


public class anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("classas");
		
		ABC a = new ABC(){

//			@Override
//			public void test() {
//				System.out.println("ABC ");
//				// TODO Auto-generated method stub
//				
//			}
			
		};
		
		//a.test();
		a.test1();

	}

}
