package week3day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		List<WebElement> value = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody//tr/td[3]"));
		int size = value.size();
		System.out.println(size);
		List<String> names=new ArrayList<String>();
		for(WebElement i:value) {
			names.add(i.getText());
			
		}
		System.out.println(names);
		Set<String> str=new LinkedHashSet<String>(names);
		int size2 = str.size();
		System.out.println(size2);
		if(size==size2) {
			System.out.println("ther is  not duplicate in names");
		}
		else {
			System.out.println("there is  duplicate in names");
		}
		
		
	}

}
