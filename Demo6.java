package dec17;

public class Demo6 {

	public static void main(String[] args) {
		String str1="20";
		String str2="209";
		//convert strings into integers
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		System.out.println(x/y);
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println(x%y);
System.out.println("====================");
int i=200;
int j=34;
//convert integer into string
String a=String.valueOf(i);
String b=String.valueOf(j);
System.out.println(a.concat(b));

	}

}
