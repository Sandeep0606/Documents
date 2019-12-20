package dec20;

import java.io.*;
public class WriteText {

	public static void main(String[] args)throws Throwable {
		File f=new File("D://4oclock.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("iam learning java");
		bw.newLine();
		bw.write("iam so lazy to learn");
		bw.newLine();
		bw.write("But i want job in top mnc");
		bw.flush();
		bw.close();

	}

}
