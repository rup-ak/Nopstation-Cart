package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class CartPage extends BasePage{
    
	public By cart = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon");
	public By checkOut = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut");
	public By checkOutGuest = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");
	
	
}
