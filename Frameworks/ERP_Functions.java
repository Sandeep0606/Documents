package CommonFunLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ERP_Functions {
public static WebDriver driver;
//launch browser and url
public static String launchApp(String url)
{
String res="";
System.setProperty("webdriver.chrome.driver","D:\\Selenium_Evening\\ERP_Stock\\CommonDriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
if(driver.findElement(By.id("btnsubmit")).isDisplayed())
{
res="Application Launch Success";
}
else
{
res="Application Launch Fail";
}
return res;
}
//login method
public static String verifyLogin(String username,String password)
throws Throwable{
	String res="";
WebElement objuser=driver.findElement(By.name("username"));
objuser.clear();
Thread.sleep(3000);
objuser.sendKeys(username);
WebElement objpass=driver.findElement(By.name("password"));
objpass.clear();
Thread.sleep(3000);
objpass.sendKeys(password);
driver.findElement(By.id("btnsubmit")).click();
Thread.sleep(5000);
if(driver.findElement(By.id("logout")).isDisplayed())
{
	res="Login Success";
}
else
{
	res="Login Fail";

}
return res;
}
public static void verifylogout()
{
driver.close();	
}

}














