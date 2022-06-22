package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://account.mekari.com/users/sign_in")
public class LoginJurnalPage extends PageObject {

    @FindBy(id="user_email")
    WebElement fieldEmail;
    @FindBy(id="user_password")
    WebElement fieldPassword;
    @FindBy(id="new-signin-button")
    WebElement loginbutton;

    public void  inputUserEmail(){
        fieldEmail.sendKeys("nana.rowling@gmail.com");
    }

    public void inputPassword(){
        fieldPassword.sendKeys("12345678");
    }

    public void clickLoginBUtton(){
        loginbutton.click();
    }
}
