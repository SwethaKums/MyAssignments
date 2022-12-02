package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.id("src"));

		findElement.sendKeys(Keys.ENTER);
		findElement.sendKeys("chennai");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		WebElement value = driver.findElement(By.xpath("//input[@id='dest']"));
        value.sendKeys(Keys.ENTER);
		value.sendKeys("Bangalore");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']/following-sibling::label")).click();
		driver.findElement(By.xpath("//td[@class='we day']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		//driver.findElement(By.xpath("//ul[@class='list-chkbox']//label")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(3000);
		
		WebElement findElement2 = driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]"));
		
		
		driver.executeScript("arguments[0].click();", findElement2);
	String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
	System.out.println(text2);
	driver.findElement(By.xpath("(//div[@class='clearfix m-top-16']/div)[3]")).click();

	}

}
