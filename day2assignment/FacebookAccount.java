package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {
		
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Deepika");
		
		driver.findElement(By.name("lastname")).sendKeys("Murugan");
		
		WebElement dateDropdown = driver.findElement(By.name("birthday_day"));

		Select dd1 = new Select(dateDropdown);
		dd1.selectByValue("11");

		WebElement monthDropdown = driver.findElement(By.name("birthday_month"));

		Select dd2 = new Select(monthDropdown);
		dd2.selectByValue("6");

		WebElement yearDropdown = driver.findElement(By.name("birthday_year"));

		Select dd3 = new Select(yearDropdown);
		dd3.selectByValue("1995");
		
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		

	}

}
