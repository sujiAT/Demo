package AutomateScripts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//suji.v//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> itemsToAdd = Arrays.asList("Cucumber", "Brocolli", "Tomato");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='product']"));
		
			for(WebElement element:elements)
			{
				String productName = element.findElement(By.cssSelector(".product-name")).getText().split(" -")[0].trim();
				if(itemsToAdd.contains(productName))
				{
					//System.out.println(element.getText());
					element.findElement(By.xpath(".//div[@class='product-action']/button")).click();
					
				}
			 
			}

		//Godriver.close();
		
	}

}
