package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Createcontact")).click();
		driver.findElement(By.id("firstnamefield")).sendKeys("Rubika");
		driver.findElement(By.id("lastnamefield")).sendKeys("B");
		driver.findElement(By.id("createcontactform_firstNameLocal")).sendKeys("u");
		driver.findElement(By.id("createContactform_lastnameLocal")).sendKeys("a");
		driver.findElement(By.name("submitButton")).click();
		

	}
	

}
