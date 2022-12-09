package week3day4Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
        driver.findElement(By.xpath("(//div[@class='slds-truncate'])[7]")).click();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("-disable-notiofications");
        Thread.sleep(3000);
        WebElement nme = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        driver.executeScript("arguments[0].click();", nme);
        WebElement nme1 = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", nme1);
        //new
        driver.findElement(By.xpath("//div[text()='New']")).click();
        WebElement name = driver.findElement(By.xpath(" //div[@class='slds-form-element__control slds-grow']/input"));
        name.sendKeys("Swetha.K");
        WebElement sc = driver.findElement(By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/button)[3]"));
      //scroll function
        Actions obj=new Actions(driver);
        obj.scrollToElement(sc).perform();
        driver.executeScript("arguments[0].click();", sc);
     //clicking the public option
      driver.findElement(By.xpath("//span[contains(text(),'Public')]")).click();
      driver.findElement(By.xpath("//button[text()='Save']")).click();
      Thread.sleep(3000);
      WebElement sc1 = driver.findElement(By.xpath("//span[text()='Accounts']"));
      driver.executeScript("arguments[0].click();", sc1);
      Thread.sleep(3000);
      
      //verifying the name
      String text = driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a")).getText();
      Thread.sleep(3000);
      System.out.println(text);
      if(text.equalsIgnoreCase("Swetha.K"))
      System.out.println("Created successfully");
      else 
    	  System.out.println("Not Created ");
      
	}

}
