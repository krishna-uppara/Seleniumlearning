
class test {

	
		public static void check()
		{
	        System.out.println("THis is Test class static method");
		}
	}
	class Demo extends test
	{
	    //method hiding
		public static void check()//fresh method created
		{
	        System.out.println("Overriding of parent class check method");

		}
	}
	public class  Staticoveriding
	{
		public static void main(String[] args) 
		{
			Demo d=new Demo();
			d.check();//call child class static method
			test t=new test();
			t.check();//call parent class static method
		}
	}
