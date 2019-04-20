package two;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\STORE\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://faceboook.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@name='firstname']").sendKeys("Hashim");
		driver.findElementByXPath("//input[@name='lastname']").sendKeys("Alameri");
		driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("Sheem215@gmail.com");
		driver.findElementByXPath("//input[@name='reg_email_confirmation__']").sendKeys("Sheem215@gmail.com");

		
		
		
		
		
		
		
		
		
	}

}
