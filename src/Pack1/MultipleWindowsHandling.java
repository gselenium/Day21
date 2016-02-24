package Pack1;

import java.util.Iterator;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindowsHandling {
	@Test
	public void test() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/");
		driver.findElement(By.linkText("Demat Account")).click();
		//to get the window ids we have to use java collections
		//Set and Iterator: using these collections we can print the window ids in the sort order.
		Set<String> allwindowids=driver.getWindowHandles();
		Iterator<String> iter=allwindowids.iterator();
		/*while(iter.hasNext()){
			System.out.println(iter.next());
		}*/
		String mainwin=iter.next();
		String popupwin=iter.next();
		driver.switchTo().window(popupwin);		
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[3]/input")).sendKeys("govardhan");
		
		/*driver.close();
		driver.switchTo().window(mainwin);
		driver.close();*/
		
		driver.quit();
	}

}
