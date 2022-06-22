package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginPage extends PageObject {

    @FindBy(id="txtUsername")
    WebElement fieldUsername;

    @FindBy(xpath = "//*[@id=\"txtUsername\"]")
    WebElement getFieldUsernameWithXpath;

    @FindBy (how= How.ID , using = "txtUsername")
    WebElement getFieldUsernameWithHow;

    @FindBy(id="txtPassword")
    WebElement fieldPassword;

    @FindBy(id="btnLogin")
    WebElement buttonLogin;

    public void inputUserName(){
        fieldUsername.sendKeys("Admin");
    }

    public  void inputPassword(){
        fieldPassword.sendKeys("admin123");
    }

    public void clickLoginButton(){
        buttonLogin.click();
    }
}
