package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage {
//comments
	@FindBy(xpath="//div[text()='Clear all']")
	private WebElement clear;
	
	@FindBy(xpath="//div[text()='Air India']")
	private WebElement airindia;
	
	@FindBy(xpath=
"(//div[@class='vmXl vmXl-mod-variant-large']/ancestor::div[@class='nrc6-inner']/descendant::div[@class='M_JD-booking-btn']//span[@class='dOAU-booking-text' and contains(.,Select)])[1]")
	private WebElement firstFlight;

	public WebElement getClear() {
		return clear;
	}

	public WebElement getAirindia() {
		return airindia;
	}

	public WebElement getFirstFlight() {
		return firstFlight;
	}
	
	public void clear()
	{
		clear.click();
	}
	public void airindia()
	{
		airindia.click();
	}
	public void firstFlight()
	{
		firstFlight.click();
	}
}
