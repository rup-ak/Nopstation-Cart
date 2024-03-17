package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class Info extends BasePage{
	
	public By firstName = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
	public By lastName = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
	public By email = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
	public By company = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
	public By country = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner");
	public By city = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etCity");
	public By street = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
	public By zip = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
	public By btn = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");

}
