package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googlePage extends mainPage {

    private final By search = By.xpath("//input[@title='Поиск']");

    public googlePage(WebDriver driver) {
        super(driver);
    }

    public void enterGoogleQuery(String queryName){
        driver.findElement(search).sendKeys(queryName);
    }

    public void clickGoogleQuery(){
        driver.findElement(search).sendKeys(Keys.ENTER);
    }
}
