package dec17;

public class Demo2 {
static int x,y,z;
public static void add()
{
	x=20;
	y=5;
	z=x+y;
	System.out.println(z);
}
public static String compareStrings(String str1,String str2)
{
	String res="";
	if(str1.equals(str2))
	{
	res="Strings are equal";
	}
	else
	{
		res="Strings are not equal";
	}
	return res;
}
public static boolean compare(int a,int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Demo2.add();
		String results=Demo2.compareStrings("lazy", "Lazy");
		System.out.println(results);
boolean str=Demo2.compare(100, 100);
System.out.println(str);
	}

}
