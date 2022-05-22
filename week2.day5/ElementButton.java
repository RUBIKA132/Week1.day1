package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementButton {

	public ElementButton() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("color")).isDisplayed());
		
		driver.navigate().to("http://leafground.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'")));
		driver.close();

	}

}
