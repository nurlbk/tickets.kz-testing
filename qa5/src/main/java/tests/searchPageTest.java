package tests;
import org.openqa.selenium.WebDriver;
import pages.searchPage;

public class searchPageTest extends mainTest{
    searchPage sp;

    public searchPageTest(WebDriver driver) {
        this.driver = driver;
        sp = new searchPage(this.driver);
    }

    public void testSearchPage(){
        sp.clickSearchWebpage();
        sleep();
    }
}
