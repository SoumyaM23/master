package assign1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class day1 {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
			 
			System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			 driver.get("file:///C:/Users/SOUMYA/Desktop/first.html");
			 driver.findElement(By.id("fname")).sendKeys("Soumya");
			 driver.findElement(By.id("mname")).sendKeys("ABC");
			 driver.findElement(By.id("lname")).sendKeys("Mishra");
			 driver.findElement(By.id("companyname")).sendKeys("L&T");
			 driver.findElement(By.id("emailid")).sendKeys("Soumya.Mishra@ltts.com");
			 driver.findElement(By.id("pwd")).sendKeys("Soum1234");
			 Thread.sleep(1000);
			 driver.findElement(By.id("clear")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("next")).click();


}
}
