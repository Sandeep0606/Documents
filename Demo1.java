package dec17;

public class Demo1 {
	int 	i=100;
	public static void method1()
	{
		
		System.out.println("method1");
	}
public static void method2()
{
	System.out.println("method2");
}
public void method3()
{
	System.out.println("Method3");
}
	public static void main(String[] args) {
		Demo1.method1();
		Demo1.method1();
		Demo1 d=new Demo1();
		d.method3();
	}

}
