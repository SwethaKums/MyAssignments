package week3day3Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//simple alert
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link']//following-sibling::span")).click();
		driver.switchTo().alert().accept();
		String text3 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("This is simple alert"+text3);
		
		//Confrim alert
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link'])[2]/following-sibling::span")).click();
		driver.switchTo().alert().accept();
		String text4 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println("This is confim alert"+text4);
		
		//prompt alert
		driver.findElement(By.xpath("(//div[@class='col-12 lg:col-6'])[2]//span[2]")).click();
		driver.switchTo().alert().sendKeys("Swetha Kumar");
		driver.switchTo().alert().accept();
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("This is prompt alert"+text2);
		
		//sweet alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		WebElement scr = driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-check']/following-sibling::span)[2]"));
        scr.click();
		String text = scr.getText();
		System.out.println("This is Sweet alert"+text);
		}

}
