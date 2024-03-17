package step_definitions;

import io.cucumber.java.en.When;
import pages.CartPage;
import pages.Info;
import pages.PaymentPage;
import io.cucumber.java.en.Then;

public class Cart_Step {
	
	CartPage cpage = new CartPage();
	PaymentPage payment = new PaymentPage();
	Info info = new Info();

    @When("Mike go to shopping cart by clicking top cart icon")
    public void userGoToShoppingCart() {
    	cpage.clickOnAElement(cpage.cart);
        // Code to navigate to the shopping cart page
    }

    @When("Mike click checkout button from shopping cart page")
    public void userClicksCheckout() {
    	cpage.clickOnAElement(cpage.checkOut);
        // Code to click on the checkout button from the shopping cart page
    }

    @When("Mike select checkout as guest from shopping cart page")
    public void userSelectsCheckoutAsGuest() {
    	cpage.clickOnAElement(cpage.checkOutGuest);
        // Code to select checkout as guest option
    }

    @Then("Mike input all the details in checkout billing details page and click continue")
    public void Mike() {
    	info.writeOnByLocator(info.firstName, "Abcd");
    	
    	info.writeOnByLocator(info.lastName, "Patwary");
    	
    	info.writeOnByLocator(info.email, "abd@gmail.com");
    	
    	
    	
    	
        // Code to input billing details and continue
    }

    @Then("Mike select 'Next Day Air' as shipping method and click continue")
    public void userSelectsShippingMethod(String shippingMethod) {
    	payment.clickOnAElement(payment.nextDayAir);
        // Code to select shipping method and continue
    }

    @Then("Mike select 'Check/Money Order' as payment method and click continue")
    public void userSelectsPaymentMethod(String paymentMethod) {
    	payment.clickOnAElement(payment.moneyOrder);
        // Code to select payment method and continue
    }

    @When("Mike click next button on payment information page")
    public void userClicksNext() {
    	payment.clickOnAElement(payment.next);
        // Code to click on the next button on the payment information page
    }

    @Then("Mike click confirm button to place the order")
    public void userClicksConfirm() {
    	payment.clickOnAElement(payment.confirmBtn);
        // Code to click on the confirm button to place the order
    }

    @Then("Verify order place successfully with popup message 'Your order has been successfully processed!'")
    public void verifyOrderSuccess(String message) {
    	
        // Code to verify the success message after placing the order
    }
}
