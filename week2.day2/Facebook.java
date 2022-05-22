package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public Facebook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rubika");
		driver.findElement(By.name("lastname")).sendKeys("B");
		driver.findElement(By.name("reg_email__")).sendKeys("rubika1322001@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Rubimotu@1");
		
		WebElement daydropdown=driver.findElement(By.id("day"));
		Select obj1=new Select(daydropdown);
		obj1.selectByValue("13");
		
		WebElement monthdropdown=driver.findElement(By.id("month"));
		Select obj2=new Select(monthdropdown);
		obj2.selectByVisibleText("Feb");
		
		WebElement yeardropdown=driver.findElement(By.id("year"));
		Select obj3=new Select(yeardropdown);
		obj3.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
	}
	

		
		
		
		
			
		
	

	}


