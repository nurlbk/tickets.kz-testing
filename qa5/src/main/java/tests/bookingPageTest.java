package tests;

import org.openqa.selenium.WebDriver;
import pages.bookingPage;

public class bookingPageTest extends mainTest {
    bookingPage bp;

    public bookingPageTest(WebDriver driver) {
        this.driver = driver;
        bp = new bookingPage(this.driver);
    }

    public void testBookingLogin(String email, String password){
        bp.clickProfile();
        sleep();
        bp.enterProfile(email, password);
        sleep(1f);
        bp.clickLogin();
        sleep(2f);
    }

    public void testBookingLogout(){
        bp.clickProfile();
        sleep(1.0f);
        bp.clickLogout();
        sleep(2f);
    }

    public void testTicketSearch(String destination){
        bp.clickDestinationBtn();
        sleep(1f);
        bp.enterDestination(destination);
        sleep();
        bp.submitDestination();
        sleep(1f);
        bp.clickDepartureBtn();
        sleep();
        bp.clickDepartureDateBtn();
        sleep();
        bp.clickOneWayBtn();
        sleep(2f);
        bp.clickFindBtn();
        sleep(10);
        sleep(5f);
    }
}
