package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PaymentPage extends BasePage{
	
	public By nextDayAir= AppiumBy.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[4]");
	public By shippingBtn = AppiumBy.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]");
	public By moneyOrder = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName\" and @text=\"Check / Money Order\"]");
	public By paymentBtn = AppiumBy.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]");
	public By next = AppiumBy.className("android.widget.Button");
	public By confirmBtn = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
	public By confirmMessage = AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message");

}
