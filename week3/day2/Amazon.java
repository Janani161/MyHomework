package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		//loading URL
		driver.get("https://amazon.in/");
		
		driver.manage().window().maximize();
		//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
 driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    System.out.println(price.size());
	
    for(int i=0;i<price.size();i++) {
        String text = price.get(i).getText();
        System.out.println(text);
}
}
}