package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.reservationPage;

public class reservationPageTest extends mainTest {
    reservationPage rp;

    public reservationPageTest(WebDriver driver) {
        this.driver = driver;
        rp = new reservationPage(this.driver);
    }

    public void reserveTicketTest(){
        sleep(4f);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)", "");
        sleep();
        rp.setFullName("Abcde", "Bcdef");
        rp.clickGenderDropdownBtn();
        sleep();
        rp.clickGenderBtn();
        sleep();
        rp.clickDocumentTypeDropdownBtn();
        sleep();
        rp.clickDocumentTypeBtn();
        sleep();
        rp.setDocument("222222222222", "111111111", "01012030");
        sleep();
        rp.setDateOfBirth("01012000");
        sleep(2f);
        rp.clickNextPageBtn();
        sleep();
    }
}