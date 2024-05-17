package seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink {
 static WebDriver driver;
 
 public static void verifyLinks(String link) throws IOException
 {
	 URL url=new URL(link);
	 HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	 connection.setConnectTimeout(5000);
	 connection.connect();
	
	 if(connection.getResponseCode()==200)
	 {
		 System.out.println(link+"-"+connection.getResponseMessage());
	 }
	 else
	 {
		 System.out.println(link+"-"+connection.getResponseMessage()+"-"+" is a broken link");
	 }
 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
 driver=new ChromeDriver(option);
 driver.manage().window().maximize();
 driver.get("https://www.saucedemo.com/inventory.html");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
 driver.findElement(By.xpath("//input[@type='submit']")).click();
 List<WebElement> tags=driver.findElements(By.tagName("a"));
 System.out.println(tags.size());
 for(WebElement element:tags)
 {
	 String url=element.getAttribute("href");
	 verifyLinks(url);
 }
	}

}
