package week3day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement val = driver.findElement(By.xpath("//div[@id='container']//iframe"));
		driver.switchTo().frame(val);
		WebElement value = driver.findElement(By.xpath("//button[text()='Try it']"));
		value.click();
	   Thread.sleep(3000);
	   
	   //to inset value 
		driver.switchTo().alert().sendKeys("Swetha Kumar");
		driver.switchTo().alert().accept();
		 String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 System.out.println(text);
		 
		 //to check the name
		 if(text.contains("Swetha Kumar")) {
			 System.out.println("you have entered correct name");
		 }
		 else {
			 System.out.println("you have entered wrong name");
		 }
		

	}

}
