package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static stepdefination.Hook.getDriver;

public class UserRegistrationSD {

    WebDriver driver;
    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        driver=getDriver();
driver.get("file:///C:/Users/z51/Desktop/sample.html");
    }
    @When("^I enter (.+),(.+),(.+)$")
    public void i_enter_pradeep_pradeep_gmail_com(String name,String email,String phone) {
        System.out.println("name="+name);
        System.out.println("email="+email);
        System.out.println("phone="+phone);
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("phone")).sendKeys(phone);
    }
    @When("I click on register")
    public void i_click_on_register() {

    }
    @Then("user should be added")
    public void user_should_be_added() {

    }
}
