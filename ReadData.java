package dec20;
import java.io.*;
public class ReadData {

	public static void main(String[] args) throws Throwable {
		FileReader fr=new FileReader("D://4oclock.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

	}

}
