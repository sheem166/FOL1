package two;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstwebriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\STORE\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByName("firstname").sendKeys("Hashim"); 	
//		driver.findElementById("u_0_c").click(); 	



		driver.findElementByName("lastname").sendKeys("Alameri");


		driver.findElementByName("reg_email__").sendKeys("Sheem215@gmail.com");

		driver.findElementByName("reg_email_confirmation__").sendKeys("Sheem215@gmail.com");

		driver.findElementByName("reg_passwd__").sendKeys("Aa1234");

		Select selectmonth = new Select(driver.findElement(By.id("month")));
		selectmonth.selectByVisibleText("Jan");

		driver.findElementByName("birthday_day").sendKeys("7");

		driver.findElementByName("birthday_year").sendKeys("1989");

		driver.findElement(By.id("u_0_a")).click();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
