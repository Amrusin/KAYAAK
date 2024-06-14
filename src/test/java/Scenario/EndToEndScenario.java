package Scenario;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericUtils.BaseClass;
import com.GenericUtils.webDriverUtils;

import ObjectRepo.FlightPage;
import ObjectRepo.HomePage;

public class EndToEndScenario extends BaseClass
{
@Test
public void Flight() throws IOException, InterruptedException
{
	String month="June 2024";
	String date="2";
	String Browser=futils.ReadDataFromPropertyFile("browser");
	driver.get(futils.ReadDataFromPropertyFile("url"));
	HomePage hp=new HomePage(driver);
	hp.flight();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[name()='svg' and @class='c_neb-item-icon']")).click();
	hp.from();
	Thread.sleep(2000);
	hp.To();
	Thread.sleep(1000);
	hp.date();
	hp.seldate();
//	Thread.sleep(2000);
//	hp.comingdate();
	Thread.sleep(5000);
	hp.onewayclk();
	Thread.sleep(1000);
	hp.selone();
	Thread.sleep(2000);
	hp.ecoclk();
	hp.selbusi();
	Thread.sleep(1000);
	hp.adultclk();
	hp.plus();
	//driver.findElement(By.xpath("//div[@role='button' and @aria-label='Swap departure airport and destination airport']")).click();
	Thread.sleep(1000);
	hp.search();
	Thread.sleep(2000);
//	webDriverUtils wutil= new webDriverUtils();
//	wutil.switchToWindow(driver, Browser);
//	FlightPage fp=new FlightPage();
//	fp.clear();
//	fp.airindia();
//	fp.firstFlight();	
}
}
