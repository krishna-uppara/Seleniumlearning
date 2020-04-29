
interface ABCD
{
	 public void test();
	 default public void test1()
	 {
		 System.out.println(" default method");
	 }
	 
	 public static void test2()
	 {
		 System.out.println(" static method ");
	 }
	 
	 
	 
}


public class inter {
	
	public static void main(String[] args) {
		
		
		
		ABCD a = new ABCD (){

			@Override
			public void test() {
				// TODO Auto-generated method stub
		System.out.println("abstract method");		
			}
		
		};
		
		a.test();
		a.test1();
		ABCD.test2();
	
		
	}

}
