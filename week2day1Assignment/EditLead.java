package week2day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Swetha");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Kumar");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='15480']")).click();
	   String val= driver.getTitle();
	   System.out.println(val);
	    
	    String expected="View Lead | opentaps CRM";

		if(val.equalsIgnoreCase(expected)) {
		System.out.println("Title match");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		WebElement yes=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		yes.sendKeys("Test");
		String value=yes.getAttribute("value");
		
		 
		 if(value.equals("Test")) {
		
		System.out.println(value);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		driver.close();
	}
	else {
			System.out.println("title not matched");

			
		
	}
	}
	}}

