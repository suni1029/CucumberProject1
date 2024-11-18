package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ERPSteps {
	WebDriver driver;
	@Given("Launch browser as\"<Browser>\"")
	public void launch_browser_as_browser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
	}
	@When("launch url")
	public void launch_url() {
		FunctionLibrary.openUrl();
	}
	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String mywait) 
	{
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("Enter user name with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String Ltype, String Lvalue, String TestData) 
	{
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);  
	}
	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData); 
	}
	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for Supplier link with {string} and {string} and {string}")
	public void wait_for_supplier_link_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);   
	}
	@When("click Supplier link with {string} and {string}")
	public void click_supplier_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for AddIcon with {string} and {string} and {string}")
	public void wait_for_add_icon_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait); 
	}
	@When("click AddIcon with {string} and {string}")
	public void click_add_icon_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for Supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("Capture Supplier number with {string} and {string}")
	public void capture_supplier_number_with_and(String Ltype, String Lvalue) throws Throwable {
		FunctionLibrary.capturesupp(Ltype, Lvalue);
	}
	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData); 
	}
	@When("click Add button with {string} and {string}")
	public void click_add_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for ConfirmOk button with {string} and {string} and {string}")
	public void wait_for_confirm_ok_button_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("click Confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for Alert ok button with {string} and {string} and {string}")
	public void wait_for_alert_ok_button_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("click Alert ok button with {string} and {string}")
	public void click_alert_ok_button_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Verify SupplierNumber")
	public void verify_supplier_number() throws IOException, InterruptedException {
		FunctionLibrary.supplierTable();
	}
	@When("wait for  Customer link with {string} and {string} and {string}")
	public void wait_for_customer_link_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("click Customer link with {string} and {string}")
	public void click_customer_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for Customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, mywait);
	}
	@When("Capture Customer number with {string} and {string}")
	public void capture_customer_number_with_and(String Ltype, String Lvalue) throws Throwable {
		FunctionLibrary.captureCust(Ltype, Lvalue);
	}
	@When("Verify CustomerNumber")
	public void verify_customer_number() throws IOException, InterruptedException {
		FunctionLibrary.CustomerTable();
	}

	@When("Click Logout link with {string} and {string}")
	public void click_logout_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue); 
	}
	@When("close browser")
	public void close_browser() {
		FunctionLibrary.closeBrowser();
	}
}
