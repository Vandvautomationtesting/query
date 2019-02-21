package com.cg.project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shivacho\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String url="http://thedemosite.co.uk/index.php";
 		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("html/body/table/tbody/tr/td[2]/center/table[1]/tbody/tr/td/div/p/font[1]/a/b"));
		element.click();
		Thread.sleep(2000);
		
        WebElement element1 = driver.findElement(By.xpath(".//*[@id='right']/div/a[1]"));
		element1.click();
		Thread.sleep(2000);
		
        WebElement element2 = driver.findElement(By.name("query_relates_to"));
		element2.click();
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath(".//*[@id='maincontent']/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr/td/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/select/option[2]"));
		element3.click();
		Thread.sleep(2000);
		
		 WebElement NameInputbox = driver.findElement(By.name("name"));
		 NameInputbox.click();
	     NameInputbox.sendKeys("Shivani");
	     Thread.sleep(5000);
	     String typedValue = NameInputbox.getAttribute("value");
	     int size = typedValue.length();
	     if (size>=3 && size <= 30) {
	     System.out.println("Max character functionality is working fine.");
	     }
	     else {
	     System.out.println("Limit must be below 30 characters only");
	     }   
	     Thread.sleep(2000);
		
		WebElement element5 = driver.findElement(By.name("email"));
		element5.click();
		element5.sendKeys("cg13213@gmail.com");
		Thread.sleep(2000);
		
		WebElement element6 = driver.findElement(By.name("thesubject"));
		element6.click();
		element6.sendKeys("engineerring graphics and applied mechanics");
		String typedValue1 = element6.getAttribute("value");
	     int size1 = typedValue1.length();
	     if (size1>=15 && size1 <= 50) {
	     System.out.println("Max character functionality is working fine.");
	     }
	     else {
	     System.out.println("Limit must be below 50 characters only");
	     }   
	     
		Thread.sleep(2000);
		
		WebElement element7 = driver.findElement(By.name("m1"));
		element7.click();
		element7.sendKeys("the marketing field is not properly working and not showing the subtitles");
		String typedValue2 = element7.getAttribute("value");
	     int size2 = typedValue2.length();
	     if (size2>=20 && size2 <= 100) {
	     System.out.println("Max character functionality is working fine.");
	     }
	     else {
	     System.out.println("Limit must be below 100 characters only");
	     }   
	     
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='maincontent']/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr/td/div/center/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/button")).click();
		Thread.sleep(2000); 
		System.out.println("Success, your query has been sent.Thank you");
		
		driver.quit();

	}

}
