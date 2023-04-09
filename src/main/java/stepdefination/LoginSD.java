package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSD {

    WebDriver driver;
    @Given("I open browser")
    public void iOpenBrowser() {
        driver=new EdgeDriver();

    }

    @And("I maximize it")
    public void iMaximizeIt() {
        driver.manage().window().maximize();
    }
    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

        driver.get("http://localhost/ip");
    }
    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
    }
    @When("I click login button")
    public void i_click_login_button() {
        System.out.println("I click login button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("I should be on dashboard")
    public void i_should_be_on_dashboard() {
        System.out.println("I should be on dashboard");
        String expected="http://127.0.0.1/ip/index.php/dashboard";
        String actual=driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }

    @When("I enter incorrect username and incorrect password")
    public void iEnterIncorrectUsernameAndIncorrectPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
    }

    @Then("^I should get an error$")
    public void i_should_get_an_error() throws Throwable {
        System.out.println("I should be on dashboard");
        String expected="http://127.0.0.1/ip/index.php/sessions/login";
        String actual=driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
        System.out.println("hip hip .hurray!");

    }

    @When("I enter blank username and blank password")
    public void EnterblankUsernameAndPassword()
    {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
    }
    @Then("I should get another error")
    public void iShouldGetAnError()
    {
        System.out.println("I should be on dashboard");
        String expected="http://127.0.0.1/ip/index.php/sessions/login";
        String actual=driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }

    @When("I enter username as {string} and password {string}")
    public void iEnterUsernameAsAndPassword(String username, String password) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }
    @When("I click forgot password button")
    public void i_click_forgot_password_button() {
driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
    }
    @Then("I should reach to forgot password page")
    public void i_should_reach_to_forgot_password_page() {
Assert.assertEquals("wrong page","Forgot Password",driver.getTitle());
    }


}
