package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hook {
   public static WebDriver driver;

   @Before("@nonlogin")
   public void openbrowser()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
    }

    @After("@nonlogin")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    public static WebDriver getDriver()
    {
        return driver;
    }
}
