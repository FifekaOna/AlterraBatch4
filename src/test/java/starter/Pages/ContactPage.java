package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts")
public class ContactPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div[1]/span")
    WebElement headerContactPage;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div[2]/button")
    WebElement newContactButton;

    public String getHeaderPage(){
        return headerContactPage.getText();
    }

    public void clickNewContact(){
        newContactButton.click();
    }
}
