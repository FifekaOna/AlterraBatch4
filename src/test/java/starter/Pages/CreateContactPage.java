package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts/new")
public class CreateContactPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/span[2]")
    WebElement headerNewContactPage;

    @FindBy(id = "display_name")
    WebElement fieldDisplayName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[1]/div/div/div[3]/div[2]/label[1]")
    WebElement chooseAsCustomer;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[5]/div/button[1]")
    WebElement addButton;

    public String getNewContactHeader(){
        return headerNewContactPage.getText();
    }

    public void fillName(String name){
        fieldDisplayName.sendKeys(name);
    }

    public void choseTypeasCustomer(){
        chooseAsCustomer.click();
    }

    public void clickAddButton(){
        addButton.click();
    }
}
