package week3day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//parent frame
		WebElement val = driver.findElement(By.xpath("(//div[@class='card mb-3']/iframe)[1]"));
		driver.switchTo().frame(val);
		WebElement val1 = driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
		val1.click();
		val1.sendKeys("Testleaf");
		Thread.sleep(3000);
		
		//Child frame
		driver.switchTo().frame("frame3");
		WebElement val2 = driver.findElement(By.id("a"));
		driver.executeScript("arguments[0].click();", val2);
		
		//out of frame
		driver.switchTo().defaultContent();
	
		//another fame
   WebElement src = driver.findElement(By.xpath("(//div[@class='card mb-3']//iframe)[2]"));
	driver.switchTo().frame(src);
	WebElement src1 = driver.findElement(By.id("animals"));
	Select obj=new Select(src1);
	obj.selectByValue("avatar");
	
	
	}

}
