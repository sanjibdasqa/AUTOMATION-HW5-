package test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	/*
	 * @Test public void clickEmailButtonTest() throws InterruptedException {
	 * homePage.clickEmailButton(); }
	 */

	@Test(enabled = false, priority = 1)
	public void clickEmailButtonTest() throws InterruptedException {
		homePage.clickEmailButton();
	}

	@Test(enabled = false, priority = 2)
	public void inputTextEmailTest() throws InterruptedException {
		homePage.inputTextEmail();
	}

	@Test(enabled = false, priority = 3)
	public void clickPasswordTest() {
		driver.findElement(By.cssSelector("input.form-input-label__input.form-input-password__input")).click();
	}

	@Test(enabled = false, priority = 4)
	public void inputTextPasswordTest() throws InterruptedException {
		homePage.inputTextPassword();
	}

	@Test(enabled = false, priority = 5)
	public void clickForgotYourPasswordTest() throws InterruptedException {
		homePage.clickForgotYourPassword();
	}

	@Test(enabled = false, priority = 6)
	public void zaraLogoTest() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false, priority = 7)
	public void dropDownSelectByIndex() throws InterruptedException {
		driver.get("https://www.statefarm.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropDown1 = driver.findElement(By.name("productName"));
		select = new Select(dropDown1);
		select.selectByIndex(4);
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 8)
	public void dropDownSelectByValue() throws InterruptedException {
		driver.get("https://www.statefarm.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropDown2 = driver.findElement(By.name("productName"));
		select = new Select(dropDown2);
		select.selectByValue("Motorcycle");
		Thread.sleep(3000);
	}

	@Test(enabled = false, priority = 9)
	public void dropDownSelectByVisibleText() throws InterruptedException {
		driver.get("https://www.statefarm.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropDown3 = driver.findElement(By.name("productName"));
		select = new Select(dropDown3);
		select.selectByVisibleText("Hospital Income");
		Thread.sleep(3000);
	}

	@Test(enabled = false, priority = 10)
	public void mouseHoverOverAction() throws InterruptedException {
		driver.get("https://www.td.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		actions = new Actions(driver);
		WebElement products = driver.findElement(By.xpath("(//li[@class='cmp-primary-header__menu-item'])[1]"));
		Thread.sleep(3000);
		actions.moveToElement(products).build().perform();
		Thread.sleep(3000);

	}

	@Test(enabled = false, priority = 11)
	public void setTheSizeOfWindow() throws InterruptedException {
		dimension = new Dimension(600, 400);
		driver.manage().window().setSize(dimension);
		driver.get("https://www.td.com/");
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(enabled = false, priority = 6)
	public void zaraLogoTest1() {
		homePage.logoDisplayed();
		Assert.assertTrue(true, "Application logo is not displayed");
	}

	@Test(enabled = false, priority = 7)
	public void assertion() {
		driver.get("https://www.td.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expected = "Online Banking, Loans, Credit Cards & Home Lending | TD Bank";
		String actual = driver.getTitle();
		System.out.println("The title of home page is: " + actual);
		Assert.assertEquals(actual, expected, "HomePage title doesn't match");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentUrl);

	}

	@Test(enabled = false, priority = 8)
	public void softAssertion() throws InterruptedException {
		driver.get("https://www.td.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expected = "Online Banking, Loans, Credit Cards & Home Lending | TD Bank                ";
		String actual = driver.getTitle();
		System.out.println("The title of the home page is: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home page title doesn't match ....... ");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);

	}

}
