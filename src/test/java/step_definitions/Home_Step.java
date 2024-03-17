package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class Home_Step {
	
	HomePage hpage = new HomePage();
	
	@Given("Mike on home page after opening nopCart mobile app")
    public void userOnHomePage() {
	
    }

    @When("Mike click 'electronics' from 'OUR CATAGORIES' list from home page")
    public void userClicksCategory(String category, String list) {
    	hpage.clickOnAElement(hpage.electronic);
    }

    @When("Mike click to 'Mettress Bedroom' product details page")
    public void userClicksProductDetails(String productName) {
    	hpage.clickOnAElement(hpage.mattress);
    }

    @When("Miker click plus button to increase Qty by 2")
    public void userIncreasesQty(int qty) {
    	hpage.clickOnAElement(hpage.qty);
    	hpage.clickOnAElement(hpage.qty);

    }

    @Then("Mike click add to cart button to add the product in his cart")
    public void userClicksAddToCart() {
    	hpage.clickOnAElement(hpage.addCart);

    }

}
