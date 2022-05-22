package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rubika");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("13/03/2001");
        WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select element = new Select(Source);
        element.selectByVisibleText("Employee");
        
        
        WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select Element1=new Select(industry);
        Element1.selectByIndex(2);
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select Element2=new Select(ownership);
        Element2.selectByValue("OWN_CCORP");
        
        WebElement marketing = driver.findElement(By.id("createLeadForm_marketingcompaignId"));
        Select Element3=new Select(marketing);
        Element3.selectByVisibleText("Automobile");
        
        WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        Select Element4=new Select(country);
        Element4.selectByVisibleText("India");
        
        
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("345675");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("766");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rubika1322001@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610047537");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rubika");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("leaftaps.com");
        
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rubi");
        driver.findElement(By.id("createLeadForm_generalAddress")).sendKeys("Teachers Colony");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Palavanthangal");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600108");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
        driver.findElement(By.id("createLeadForm_generaLAttName")).sendKeys("Divya");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Meenambakkam");
        
        String firstName = driver.findElement(By.name("firstName")).getText();
        System.out.println("firstName");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();
        
        
        
        
        
        
        
        
        
		
		
		

	}

}
