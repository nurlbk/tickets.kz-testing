package tests;

import org.openqa.selenium.WebDriver;
import pages.ticketPage;

public class ticketPageTest extends mainTest{

    ticketPage tp;

    public ticketPageTest(WebDriver driver) {
        this.driver = driver;
        tp = new ticketPage(this.driver);
    }

    public void testTicketSelect(){
        sleep(1.5f);
        tp.clickFirstTicket();


    }

}
