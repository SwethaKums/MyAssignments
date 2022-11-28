package week2day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Swetha");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("swethalogeswari31@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Swetha@123");
		WebElement findElement = driver.findElement(By.id("day"));
		Select sel=new Select(findElement);
		sel.selectByValue("31");
		WebElement findElement1 = driver.findElement(By.id("month"));
		Select sel1=new Select(findElement1);
		sel1.selectByValue("5");
		WebElement findElement2 = driver.findElement(By.id("year"));
		Select sel2=new Select(findElement2);
		sel2.selectByValue("2000");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	
	}

}
