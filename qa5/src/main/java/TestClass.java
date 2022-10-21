import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.*;

public class TestClass {
    mainTest mt;
    Logger logger = LogManager.getLogger();

    @BeforeTest
    public void driver_config(){
        logger.info("Driver Configuration Started");

        mt = new mainTest();
        mt.configure();
        logger.info("Driver Configuration Ended");
    }

    @Test(priority = 1)
    public void search_webpage(){
        logger.info("Searching Webpage Started");
        googlePageTest gpt = new googlePageTest(mt.getDriver());
        gpt.testQueryGoogle("tickets.kz");
        logger.info("Searching Webpage Ended");

    }

    @Test(priority = 2)
    public void click_webpage(){
        logger.info("Clicking Webpage Started");
        searchPageTest spt = new searchPageTest(mt.getDriver());
        spt.testSearchPage();
        logger.info("Clicking Webpage Ended");
    }

    @Test(priority = 3)
    public void login_and_logout(){
        logger.info("Log(in|out) Started");
        bookingPageTest bpt = new bookingPageTest(mt.getDriver());
        bpt.testBookingLogin("...@gmail.com", "whiLvTN6");
        bpt.testBookingLogout();
        bpt.testBookingLogin("...@gmail.com", "whiLvTN6");
        logger.info("Log(in|out) Ended");
    }


    @Test(priority = 3)
    public void search_ticket(){
        logger.info("Searching Ticket Started");
        bookingPageTest bpt = new bookingPageTest(mt.getDriver());
        bpt.testTicketSearch("Almaty");
        logger.info("Searching Ticket Ended");
    }


    @Test(priority = 5)
    public void click_ticket(){
        logger.info("Clicking Ticket Started");
        ticketPageTest tpt = new ticketPageTest(mt.getDriver());
        tpt.testTicketSelect();
        logger.info("Clicking Ticket Ended");
    }

    @Test(priority = 6)
    public void reserve_ticket(){
        logger.info("Reserving Ticket Started");
        reservationPageTest rpt = new reservationPageTest(mt.getDriver());
        rpt.reserveTicketTest();
        logger.info("Reserving Ticket Ended");
    }

    @AfterTest
    public void closeDriver(){
        logger.info("Closing Driver Started");
        mt.closeDriver();
        logger.info("Closing Driver Ended");
    }
}
