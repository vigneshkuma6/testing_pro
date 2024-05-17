package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("headless");
		option.addArguments("incognito");
driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");
System.out.println(driver.getTitle());
	}

}
