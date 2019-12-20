package dec20;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelData {
public static void main(String[] args) throws Throwable{
		//to read data from file
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		//get wb from file
		Workbook wb=WorkbookFactory.create(fi);
		//get shett from wb
		Sheet ws=wb.getSheet("Login");
		//get first row from sheet
		Row r=ws.getRow(0);
		//count no of rows from sheet
	int rc=ws.getLastRowNum();
	int cc=r.getLastCellNum();
	System.out.println(rc+"    "+cc);
	for(int i=1;i<=rc;i++)
	{
		//get username cell
String username=ws.getRow(i).getCell(0).getStringCellValue();
String password=ws.getRow(i).getCell(1).getStringCellValue();
System.out.println(username+"       "+password);
//write as pass into result column
ws.getRow(i).createCell(2).setCellValue("dont sleep in class");
	}
fi.close();
FileOutputStream fo=new FileOutputStream("D://Results.xlsx");
wb.write(fo);
fo.close();
wb.close();

	}

}














