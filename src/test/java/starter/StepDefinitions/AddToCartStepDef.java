package starter.StepDefinitions;

import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;

public class AddToCartStepDef {

    InventoryPage inventoryPage;

    @When("I select an item")
    public void xxx(){}

    @When("I select item {string}")
    public void ISelectItem(String benda){
        inventoryPage.selectItem(benda);

    }
}
