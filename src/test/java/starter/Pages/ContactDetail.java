package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetail extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[1]")
    WebElement contactName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[3]")
    WebElement contactType;

    public String getContactName(){
        return contactName.getText();
    }

    public String getCustomerType(){
        return contactType.getText();
    }
}
