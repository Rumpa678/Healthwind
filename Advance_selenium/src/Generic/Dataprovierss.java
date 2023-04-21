package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovierss extends Launch {
		@DataProvider(name="Rumpa")
		String [][] put()
		{
			String[][]arr= {{"Rumpa11","123"},{"Raaa","452"}};
			return arr;
		}
	@Test(dataProvider="Rumpa")
	void funcTest(String un,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement emailtxt=driver.findElement(By.xpath("//input[@name='email']"));
		emailtxt.sendKeys(un);
		Thread.sleep(2000);
		WebElement pwdtxt=driver.findElement(By.xpath("//input[@name='pass']"));
		pwdtxt.sendKeys(pwd);
					
		
	}
	}



