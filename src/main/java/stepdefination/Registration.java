package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import static stepdefination.Hook.getDriver;

public class Registration {
WebDriver driver;
    @Given("I am on user enquiry page")
    public void iAmOnUserEnquiryPage()
    {
        driver=getDriver();
        driver.get("https://amolujagare.com/contact/");
    }

    @When("I enter below data")
    public void iEnterBelowData(DataTable dataTable) {
        List<List<String>> datalist = dataTable.asLists();
        System.out.println(datalist.get(0).get(0));
        System.out.println(datalist.get(0).get(1));
        System.out.println(datalist.get(0).get(2));
        System.out.println(datalist.get(0).get(3));
        System.out.println(datalist.get(0).get(4));
        driver.findElement(By.name("item_meta[6]")).sendKeys(datalist.get(0).get(0));
        driver.findElement(By.name("item_meta[7]")).sendKeys(datalist.get(0).get(1));
        driver.findElement(By.name("item_meta[9]")).sendKeys(datalist.get(0).get(2));
        driver.findElement(By.name("item_meta[10]")).sendKeys(datalist.get(0).get(3));
        driver.findElement(By.name("item_meta[12]")).sendKeys(datalist.get(0).get(4));
    }

    @And("I click on submit")
    public void iClickOnSubmit() {
        System.out.println("I click on submit");
    }

    @Then("enquiry should be submitted")
    public void enquiryShouldBeSubmitted() {
        System.out.println("enquiry should be submitted");
    }
}
