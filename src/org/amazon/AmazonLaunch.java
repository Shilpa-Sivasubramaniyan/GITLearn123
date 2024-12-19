package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14");
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
		WebElement clk = driver.findElement(By.xpath("(//img[@alt='Apple iPhone 14 (128 GB) - Blue'])[1]"));
		clk.click();
	}
}
