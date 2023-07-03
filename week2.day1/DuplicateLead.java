package week2.day1.assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
				
				//load the URL link
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//maximize the screen
				driver.manage().window().maximize();	
				
				//identify the user name input box(text box)
				//find the else( text box) -->using attribute-->enter text
				//unique value -->first preferred locator-->id
				//name
				
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("DemoCSR");	
				
				//sendKeys-->enter the value in the text box
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//click on login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//black text with <a>
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on Create Lead 
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter CompanyName Field Using id Locator
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				//Enter FirstName Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
				
				//Enter LastName Field Using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
				
		        //Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jaanu");
				
				//Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("3 years of experience");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jananibas1@gmail.com");
				
				WebElement sourceEle = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				//Instantiate the Select class 
				Select source =new Select(sourceEle);	
				
				//using visibleText-->black text
				source.selectByVisibleText("New York");
				
				//to click on submit
				driver.findElement(By.className("smallSubmit")).click();
				
				//Get the Title of Resulting Page
				String title = driver.getTitle();
                System.out.println(driver.getTitle());
			    
			    //Click on Duplicate button
			  driver.findElement(By.linkText("Duplicate Lead")).click();

				//Clear the CompanyName Field using .clear() And Enter new CompanyName
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
				
				//Clear the FirstName Field using .clear() And Enter new FirstName
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Laksheta");

				//Click on Create Lead Button
			    driver.findElement(By.className("smallSubmit")).click();
			    
			    //Get the Title of Resulting Page
			    System.out.println(driver.getTitle());
		
			}

}

