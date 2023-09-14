package com.facegenie;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Facegenie {
	WebDriver driver;

	@Test
	public void Login_TS_facegenie_001() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.findElement(By.cssSelector("#email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Reporter.log("Login successful",true);
		driver.close();
	}
	@Test
	public void Login_TS_facegenie_002()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.findElement(By.cssSelector("#email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("facegenie123");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		String s = driver.findElement(By.xpath("//div[text()='Password wrong']")).getText();
		System.out.println(s);
		Reporter.log("Wrong Password",true);
		driver.close();	
	}
	@Test
	public void Login_TS_facegenie_003()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.findElement(By.cssSelector("#email")).sendKeys("stbams@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		String s = driver.findElement(By.xpath("//div[text()='User not found']")).getText();
		System.out.println(s);
		Reporter.log("Wrong Email",true);
		driver.close();	
	}
	@Test
	public void Login_TS_facegenie_004()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facegenie-ams-school.web.app/dashboard/home");
		driver.findElement(By.cssSelector("#email")).sendKeys("bams@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("cegenie");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		String s = driver.findElement(By.xpath("//div[text()='User not found']")).getText();
		System.out.println(s);
		Reporter.log("Wrong Email & Wrong Password",true);
		driver.close();	
	}

}
