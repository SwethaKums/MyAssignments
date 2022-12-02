package week2.day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseBookmyshow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='sc-cgHJcJ hPcraY']/img)[4]")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("hyderabad")) {
			System.out.println("the Url is correct");
		}
		else {
			System.out.println("the url is wrong");
		}
		driver.findElement(By.xpath("//span[@id='4']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("DSP");
Thread.sleep(3000);
		driver.findElement(By.tagName("strong")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		String text = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println(text);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		driver.findElement(By.xpath("//div[@class='info-section']/div")).click();
		String text2 = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]")).getText();
		//System.out.println(text2);
		if(text2.contains("Parking")) {
			System.out.println("it has parking facilities");
		}
		else {
			System.out.println("it doesnt have parking facilities");
			
		}
		
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[@class='__details']")).click();
		driver.findElement(By.xpath("//div[@class='bar-btn _primary']")).click();
		driver.findElement(By.xpath("//ul[@id='popQty']/li")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("(//td[@class='SRow1']//a)[3]")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		WebElement pay = driver.findElement(By.xpath("//span[@class='__sub-total']"));
		Thread.sleep(3000);
		String value = pay.getText();
		System.out.println(value);
	}

}
