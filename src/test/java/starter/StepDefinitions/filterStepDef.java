package starter.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;
public class filterStepDef {

    InventoryPage inventoryPage;
    @When("I click sort by {string}")
    public void i_click_sort_by(String sortBy) {
        switch (sortBy){
            case "Price (low to high)":
                inventoryPage.selectSortByVisibleText(sortBy);
            case "lohi":
                inventoryPage.selectSortByValue(sortBy);
                break;
        }
    }
    @Then("Item should be filtered by {string}")
    public void item_should_be_filtered_by(String string) {

        assertEquals(string,inventoryPage.getActiveSort());
    }

}
