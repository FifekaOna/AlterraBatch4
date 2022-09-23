package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryPage extends PageObject {

    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.cssSelector("#shopping_cart_container > a");
    private final By sortingDropDown = By.className("product_sort_container");
    private final By sortActive = By.className("active_option");
    @Managed
    WebDriver driver = getDriver();

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getHeaderTittle() {
        return driver.findElement(headerTittle).getText();
    }

    public boolean isCartVisible() {
        return driver.findElement(cartIcon).isDisplayed();
    }

    public void selectItem(String item) {
        driver.findElement(By.id(item)).click();
    }

    public void selectSortByVisibleText(String sortBy) {
        Select dropdown = new Select(driver.findElement(sortingDropDown));
        dropdown.selectByVisibleText(sortBy);
    }

    public String getActiveSort() {
        return driver.findElement(sortActive).getAttribute("innerHTML");
    }

    public void selectSortByValue(String sortBy) {
        Select dropdown = new Select(driver.findElement(sortingDropDown));
        dropdown.selectByValue(sortBy);
    }




}
