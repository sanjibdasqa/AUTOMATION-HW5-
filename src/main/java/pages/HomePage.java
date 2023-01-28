package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(xpath="//input[@name='logonId']") WebElement emailButton;
	 * 
	 * public void clickEmailButton() throws InterruptedException {
	 * emailButton.click(); Thread.sleep(3000); }
	 */

	@FindBy(xpath = "//input[@name='logonId']")
	WebElement emailButton;

	public void clickEmailButton() throws InterruptedException {
		clickElement(emailButton);
		Thread.sleep(3000);
	}

	/*
	 * @FindBy(xpath = "//input[@name='logonId']") WebElement sendkeys;
	 */

	public void inputTextEmail() throws InterruptedException {
		inputText(emailButton, "SanjibDas");
		Thread.sleep(3000);
	}

	@FindBy(css = "input.form-input-label__input.form-input-password__input")
	WebElement password;

	public void password() throws InterruptedException {
		clickElement(password);
		Thread.sleep(3000);
	}

	/*
	 * @FindBy(xpath = "//input[@name='logonId']") WebElement sendkeys2;
	 */

	public void inputTextPassword() throws InterruptedException {
		inputText(password, "sanjib");
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//span[text()='Forgot your password?']")
	WebElement forgotYourPassword;

	public void clickForgotYourPassword() throws InterruptedException {
		clickElement(forgotYourPassword);
		Thread.sleep(3000);
	}

	@FindBy(className = "policy-popup__overlay")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed? Ans: " + flag);
		return flag;

	}

}
