package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[.='Flights']")
	private WebElement flight;
	

	@FindBy(xpath="//input[@placeholder='From?' and @type='text']")
	private WebElement from;
	@FindBy(xpath="//input[@placeholder='To?' and @type='text']")
	private WebElement To;
	@FindBy (xpath="//span[@class='aJ3v']")
	private WebElement date;
	@FindBy(xpath="//caption[text()='July 2024']/ancestor::table[@class='or3C or3C-wrapper']/descendant::div[text()='20']")
	private WebElement seldate;
	
	@FindBy(xpath="//div[@class='OV9e-tbl-wrapper']/descendant::caption[text()='July 2024']/following-sibling::tbody//div[text()='27']")
	private WebElement comingdate;
	
	@FindBy(xpath="//div[@class='Uqct-title']/span[text()='Return']")
	//@FindBy(xpath="//span[.='One-way']|//span[.='Return']|//span[.='Multi-city']")
	private WebElement onewayclk;
	
	@FindBy(xpath="//ul[@class='EMAt EMAt-pres-padding-default EMAt-mod-alignment-left']/li/span[text()='One-way']")
	private WebElement selone;
	
	@FindBy(xpath="//span[text()='Economy']")
	private WebElement ecoclk;
	
	@FindBy(xpath="//ul[@class='EMAt EMAt-pres-padding-default EMAt-mod-alignment-left']/li/span[text()='Business']")
	private WebElement selbusi;
	
	@FindBy(xpath="//div[@role='button' and contains(.,'1 adult')]")
	private WebElement adultclk;
	
	@FindBy(xpath="(//span[text()='Adults']/../following-sibling::div[@class='bCGf bCGf-mod-theme-default']/descendant::button)[2]")
	private WebElement plus;
	
	@FindBy (xpath="//button[@role='button' and @aria-label='Search']")
	private WebElement search;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFlight() {
		return flight;
	}

	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return To;
	}

	public WebElement getDate() {
		return date;
	}
	public WebElement getseldate()
	{
		return seldate;
	}
	public WebElement getcomingdate()
	{
		return comingdate;
	}
	
	public WebElement getOnewayclk() {
		return onewayclk;
	}
	
	public WebElement getselone() {
		return selone;
	}

	public WebElement getEcoclk() {
		return ecoclk;
	}

	public WebElement getSelbusi() {
		return selbusi;
	}
	
	public WebElement getAdultclk() {
		return adultclk;
	}
	
	public WebElement getplus()
	{
		return plus;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public void flight()
	{
		flight.click();
	}
	
	public void from()
	{
		from.sendKeys("Mysore, Karnataka, India (MYQ) Mysore");
		from.click();
	}
	public void To()
	{
		To.sendKeys("Vasco da Gama, Goa, India (GOI) Goa Intl");
		To.click();
	}
	public void date()
	{
		date.click();
	}
	public void seldate()
	{
		seldate.click();
	}
	public void comingdate()
	{
		comingdate.click();
	}
	public void onewayclk()
	{
		onewayclk.click();
	}
	public void selone()
	{
		selone.click();
	}
	public void ecoclk()
	{
		ecoclk.click();
	}
	public void selbusi()
	{
		selbusi.click();
	}
	public void adultclk()
	{
		adultclk.click();
	}
	public void plus()
	{
		plus.click();
	}

	public void search()
	{
		search.click();
	}
}
