package week3day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notiofications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//login
		WebElement val = driver.findElement(By.xpath("//input[@id='username']"));
		val.sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		//app
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//viewall
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		WebElement scr = driver.findElement(By.xpath("//input[@class='slds-input']"));
		scr.click();
		scr.sendKeys("Tasks");

		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		Thread.sleep(3000);
//new task
		WebElement mark = driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container'])[4]"));
		driver.executeScript("arguments[0].click();", mark);
		WebElement mark1 = driver.findElement(By.xpath("//span[text()='New Task']"));
		driver.executeScript("arguments[0].click();", mark1);
//entering value
		WebElement value = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']"));
		value.click();
		value.sendKeys("Bootcamp");
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("(//div[@class='uiPopupTrigger']//a)[5]"));
		driver.executeScript("arguments[0].click();", name);
		Thread.sleep(3000);
//selecting
		WebElement selecting = driver.findElement(By.xpath("//a[text()='Waiting on someone else']"));
		driver.executeScript("arguments[0].click();", selecting);
//save
		WebElement mark3 = driver.findElement(By.xpath("//button[contains(@class,'brand uiButton forceActionButton')]"));
		driver.executeScript("arguments[0].click();", mark3);

	}


}
