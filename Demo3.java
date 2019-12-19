package dec17;

public class Demo3 {

	public static void main(String[] args) {
		try{
		int x=34,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		double a=345,b=7,c;
		c=a/b;
		System.out.println(c);

	}

}
