package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver_MarutiSuzuki {
	@Test
	public void test() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.marutisuzuki.com/");
		WebElement MO=driver.findElement(By.linkText("SHOWROOM"));
		//create the object for the actions
		Actions act=new Actions(driver);
		act.moveToElement(MO).build().perform();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id='see_all']/ul/li[7]/a/span[1]/img")).click();
	}

}
