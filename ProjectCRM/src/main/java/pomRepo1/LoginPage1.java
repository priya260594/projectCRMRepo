package pomRepo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
public  LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(id="username")
private WebElement UserTextField;
@FindBy(id="password")
private WebElement PasswordTextField;
@FindBy(id="login-button")
private WebElement LoginButton;
//getters
public WebElement getUserTextField() {
	return UserTextField;
}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
		
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
}









