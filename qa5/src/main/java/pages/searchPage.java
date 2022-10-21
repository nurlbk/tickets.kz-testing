package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage extends mainPage {

    private final By firstWebpage = By.xpath("//div[@class='yuRUbf']");
    private final By href = By.xpath(".//a");

    public searchPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchWebpage(){
        WebElement fp = driver.findElement(firstWebpage);
        fp.findElement(href).click();
    }
}
