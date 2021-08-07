package Week4.day1;

import java.util.concurrent.TimeUnit;
//import java.io.File;
import java.io.IOException;
import java.util.List;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		Actions builder = new Actions(driver);
		WebElement drgnsort = driver.findElement(By.id("sortable"));
		drgnsort.click();
		WebElement container = driver.findElement(By.id("sortable"));
		List<WebElement> lis = container.findElements(By.tagName("li"));
		
		
		WebElement target = lis.get(2);
		WebElement dest = lis.get(6);
		builder.click(target).clickAndHold().moveToElement(dest).moveByOffset(0, 10).release().build().perform();
		

		WebElement target1 = lis.get(4);
		WebElement dest1 = lis.get(1);
		builder.click(target1).clickAndHold().moveToElement(dest1).moveByOffset(0, 10).release().build().perform();
	
		
		WebElement target2 = lis.get(3);
		WebElement dest2 = lis.get(7);
		builder.click(target2).clickAndHold().moveToElement(dest2).moveByOffset(0, 10).release().build().perform();
	

	}

	}
