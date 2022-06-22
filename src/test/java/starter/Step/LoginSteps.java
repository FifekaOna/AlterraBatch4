package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.DashboardPage;
import starter.Pages.LoginJurnalPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class LoginSteps {

    LoginPage loginpage;
    DashboardPage dashboardPage;
    LoginJurnalPage loginJurnalPage;

    @Step
    public void openLoginPage(){
        loginpage.open();
    }

    @Step
    public void inputUsername(){
        loginpage.inputUserName();
    }

    @Step
    public void inputPassword(){
        loginpage.inputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginpage.clickLoginButton();
    }

    @Step
    public void verifyDashboardPage(){
        String header = dashboardPage.getHeaderText();
        assertTrue(header.equalsIgnoreCase("dashboard"));
        assertTrue(dashboardPage.isQuickLaunchAppear());
    }

    @Step
    public void loginInJurnal(){
        loginJurnalPage.open();
        loginJurnalPage.inputUserEmail();
        loginJurnalPage.inputPassword();
        loginJurnalPage.clickLoginBUtton();
    }
}
