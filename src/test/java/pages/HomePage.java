package pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class HomePage extends BasePage{
	
	public By electronic = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvProductName\" and @text=\"Electronics\"]");
	public By mattress = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvProductName\" and @text=\"Mattress Bedroom\"]");
	public By qty 		= AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus");
	public By addCart	= AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart");
	


}




