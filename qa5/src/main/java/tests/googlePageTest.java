package tests;
import org.openqa.selenium.WebDriver;
import pages.googlePage;

public class googlePageTest extends mainTest{
    googlePage gp;

    public googlePageTest(WebDriver driver) {
        this.driver = driver;
        gp = new googlePage(this.driver);
    }

    public void testQueryGoogle(String queryName){
        gp.enterGoogleQuery(queryName);
        logger.info("Name Entered");
        sleep();
        gp.clickGoogleQuery();
        sleep();
    }
}
