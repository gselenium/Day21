package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ScrollDown {
	@Test
	public void test() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://sites.google.com/site/appsscripttutorial/user-interface/list-box");
		//scroll down the application
		((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("More")).click();
	}

}
