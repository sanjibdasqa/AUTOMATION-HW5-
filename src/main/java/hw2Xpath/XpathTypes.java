package hw2Xpath;

public class XpathTypes {
	/*
	 * 5 ways of creating dynamic xpath:
	 * 
	 * 1. 
	 * a. 
	 *  //a[@class='header__quick-link']
	 *  https://www.forever21.com/
	 *  Gift Cards
	 * 
	 * b.
	 *  //input[@id='email']
	 *  https://us.puma.com/us/en/account/login?action=login
	 *  Email
	 * 
	 * c.
	 *  //input[@name='password']
	 *  https://us.puma.com/us/en/account/login?action=login
	 *  Password
	 * 
	 * d.
	 *  //input[@id='order-no']
	 *  https://us.puma.com/us/en/account/login?action=login
	 *  ORDER NUMBER
	 * 
	 * e.
	 *  //input[@name='billingPostalCode']
	 *  https://us.puma.com/us/en/account/login?action=login
	 *  BILLING POSTAL CODE
	 * 
	 * 
	 * 
	 * 2.
	 * a.
	 * //input[@name='Sign in name'or @id='signInName']
	 * https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_520/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5Dhttps%3A%2F%2Fwww.costco.com%2Flenovo-flex-5-14%2522-2-in-1-touchscreen-laptop---amd-ryzen-7-5700u---2240-x-1400---windows-11.product.100857989.html%5BSSO%5D&nonce=85klWJ5mJzbIyLz2&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post
	 * Email 
	 * 
	 * b.
	 * //button[@class='accountButton firstButton claims-provider-selection' or id='PasswordResetUsingEmailAddressExchange']
	 * https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_520/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5Dhttps%3A%2F%2Fwww.costco.com%2Flenovo-flex-5-14%2522-2-in-1-touchscreen-laptop---amd-ryzen-7-5700u---2240-x-1400---windows-11.product.100857989.html%5BSSO%5D&nonce=vsgdGBcD24E00IoS&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post
	 * forgot password
	 * 
	 * c.
	 * //input[@id='rememberMe'or name='rememberMe']
	 * costco.com
	 * keep me sign in check box
	 * 
	 * d.
	 * //input[@name='username' or class='css-290f3n']
	 * shepora.com >sign in >
	 * Password
	 * 
	 * e.
	 * //input [@name='username' or class='css-290f3n']
	 *  shepora.com >sign in >
	 *  Email
	 * 
	 * 3.
	 *  a.
	 *  //input[@id='enterID-input' and @name='dummy-onlineId']
	 *  https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go 
	 *  UserId
	 *  
	 *  b.
	 *  //input[@id='tlpvt-passcode-input' and @name='dummy-passcode']
	 *  https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go
	 *  password 
	 *  
	 * c.
	 *  //a[@class='arrow' and @name='Enroll_now']
	 *  https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go
	 *  Enroll now
	 *  
	 * d.
	 *   //a[@name='Learn_more_about_Online_Banking_dotcom' and @class='arrow']
	 *   https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go 
	 *   Learn more about Online Banking
	 *   
	 * e.
	 *   //a[@name='Service_Agreement_dotcom' and @class='arrow']
	 *   https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go
	 *   Service Agreement
	 * 
	 * 4. 
	 * a.
	 *   //span[text()='Kohl’s Coupons']
	 *   https://www.kohls.com/
	 *   Kohl’s Coupons
	 * 
	 * b.
	 *   //span[text()='Help']
	 *   https://www.kohls.com/
	 *   Help
	 * 
	 * c.
	 *   //span[text()='Shop by Category']
	 *   https://www.kohls.com/
	 *   Shop by Category
	 * 
	 * d.
	 *   //h3[text()='Customer Service']
	 *   https://www.kohls.com/
	 *   CUSTOMER SERVICE
	 * 
	 * e.
	 *   //h3[text()='Shop Kohl’s']
	 *   https://www.kohls.com/ 
	 *   SHOP KOHL’S
	 * 
	 * 5. 
	 * a.
	 *  //a[contains(text(), 'SIGN I')]
	 *  https://www.dunkindonuts.com/en 
	 *  SIGN IN
	 * 
	 * b.
	 *   //a[contains(text(), 'Forgot your password')]
	 *  https://www.dunkindonuts.com/en/sign-in 
	 *  Forgot your password?
	 * 
	 * c.
	 *   //button[contains(text(), 'Det')]
	 *   https://www.starbucks.com/account/signin? 
	 *   Details
	 * 
	 * d. 
	 *   //button[contains(text(), 'Forgot your user')]
	 *   https://www.starbucks.com/account/signin?
	 *   Forgot your username?
	 * 
	 * e.
	 *   //a[contains(text(), 'Forgot your password?')]
	 *   https://www.starbucks.com/account/signin?
	 *   Forgot your password?
	 * 
	 
	 */

}
