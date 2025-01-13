package AutomateScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//suji.v//Downloads//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sc,new File("C://Users//suji.v//Downloads//img.png"));
				
//				
//				driver.findElement(By.cssSelector("#divpaxinfo")).click();
//				Thread.sleep(4000);
//				int i=1;
//				while(i<4);
//				{
//					driver.findElement(By.xpath("//div/span[@id='hrefIncAdt']")).click();
//					i++;
//					
//				}
//				
//				driver.findElement(By.xpath("#btnclosepaxoption")).click();
//				System.out.println(driver.findElement(By.xpath("#divpaxinfo")).getText());
	}

	private static void getScreeenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		
	}

}
