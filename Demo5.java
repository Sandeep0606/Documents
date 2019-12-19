package dec17;

public class Demo5 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="hello";
		if(str1.equals(str2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			try{
			throw new Error("Strings are not equal");
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}

	}

}
