package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// maximize the window
		driver.manage().window().maximize();

		// Enter the UserName
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click Login option
		driver.findElement(By.className("decorativeSubmit")).click();

		// click Crmsfa option
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click Account tab

		driver.findElement(By.linkText("Accounts")).click();

		// Click the create account option
		driver.findElement(By.linkText("Create Account")).click();

		// Enter the Account Name
		driver.findElement(By.id("accountName")).sendKeys("TestAccount003");

		// Enter the Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement dropDown = driver.findElement(By.name("industryEnumId"));
		Select obj = new Select(dropDown);
		obj.selectByValue("IND_SOFTWARE");

		WebElement dropDown1 = driver.findElement(By.name("ownershipEnumId"));
		Select obj1 = new Select(dropDown1);
		obj1.selectByVisibleText("S-Corporation");

		WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));
		Select obj2 = new Select(dropDown2);
		obj2.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
		Select obj3 = new Select(dropDown3);
		obj3.selectByIndex(6);
		
		
		WebElement dropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj4 = new Select(dropDown4);
		obj4.selectByValue("TX");
		
		
		driver.findElement(By.className("smallSubmit")).click();

		

	}

}
