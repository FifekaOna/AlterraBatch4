package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.ContactDetail;
import starter.Pages.ContactPage;
import starter.Pages.CreateContactPage;
import starter.Pages.MenuPage;
import static org.junit.Assert.*;


public class AddContactStep {

    MenuPage menuPage;
    ContactPage contactPage;
    CreateContactPage createContactPage;
    ContactDetail contactDetail;

    @Step
    public void clickContactMenu(){
        menuPage.open();
        menuPage.clickContactMenu();
    }

    @Step
    public void VerifyContactPage(){
        String headerPage=contactPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("contacts"));
    }

    @Step
    public void clickNewContact(){
        contactPage.clickNewContact();
    }

    @Step
    public void verifyCreateNewContactPage(){
        String headerPage=createContactPage.getNewContactHeader();
        assertTrue(headerPage.equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name){
        createContactPage.fillName(name);
    }

    @Step
    public void selectAsCustomer(){
        createContactPage.choseTypeasCustomer();
    }

    @Step
    public void clickAddButton(){
        createContactPage.clickAddButton();
    }

    @Step
    public  void verifyContactCreated(String ExpectedName){
        String actualName = contactDetail.getContactName();
        assertTrue(ExpectedName.equalsIgnoreCase(actualName));
        String type= contactDetail.getCustomerType();
        assertTrue(type.equalsIgnoreCase("customer"));
    }


}
