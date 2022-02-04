package kkk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secondse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Desktop\\Sem10-Intern-CaratLane\\Selenium\\Selenium\\geckodriver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://login.yahoo.com/?.intl=us");
    driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("karthi.773091@yahoo.com");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
    driver.close();
	}

}
