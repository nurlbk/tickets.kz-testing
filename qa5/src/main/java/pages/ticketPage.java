package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ticketPage extends mainPage{
    private final By firstTicket = By.xpath("//button[@class='t-btn-atomic cursor-pointer theme-default t-btn-buy bg-17 color-1 f-center-center f--column w-100 shadow ripple size-7']");

    public ticketPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstTicket(){
        driver.findElement(firstTicket).click();
    }


}
