package week3day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Htmltag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='wrapper wrapper-main clearfix']//tr"));
		int size = findElements.size();
		System.out.println("total number rows"+size);
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='wrapper wrapper-main clearfix']//th"));
	int size2 = findElements2.size();
	System.out.println("Total number of Columns"+size2);
	}

}
