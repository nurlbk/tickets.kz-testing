package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class bookingPage extends mainPage{
    final By profileNav = By.xpath("//div[@class='app-top-nav-user-menu']");
    final By profile = By.cssSelector("div > button");
    final By profileBlock = By.xpath("//div[@class='fields-builder-v2 row']");
    final By email = By.cssSelector("div:nth-child(1) > label > input");
    final By password = By.cssSelector("div:nth-child(2) > label > input");
    final By loginBtn = (By.xpath("//button[@type='submit']"));
    final By logoutBtn = (By.xpath("//button[@class='size-5 ripple f-center-center w-100 color-19 border-width-1 border-color-19 bg-hover-19 color-hover-1 t-btn-atomic cursor-pointer theme-default']"));

    final By aviaBlock = (By.xpath("//div[@class='main-search-inner-form__body']"));
    final By destinationBtn = (By.xpath("div[1]/div/div[1]/div[2]/div/button"));
    final By destination = (By.xpath("div[1]/div/div[1]/div[2]/menu/div/li/div/input"));
    final By departureBtn = (By.xpath(".//button[@class='t-date-picker__activator ltr bg-1 theme-default multiple departure']"));
    final By departureDateBtn = (By.xpath("div[1]/div/div[2]/div[1]/menu/div/div/div[1]/div/div[1]/div[6]/div[7]/button"));
    final By oneWayBtn = (By.xpath("div[1]/div/div[2]/div[1]/menu/div/div/div[2]/div/div[2]/button"));
    final By findBtn = (By.xpath(".//button[@type='submit']"));


    public bookingPage(WebDriver driver) {
        super(driver);
    }

    public void clickProfile(){
        driver.findElement(profileNav).findElement(profile).click();
    }

    public void enterProfile(String email, String password) {
        driver.findElement(profileBlock).findElement(this.email).sendKeys(email);
        driver.findElement(profileBlock).findElement(this.password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(profileBlock).findElement(loginBtn).click();
    }

    public void clickLogout(){
        driver.findElement(logoutBtn).click();
    }

    public void clickDestinationBtn(){
        driver.findElement(aviaBlock).findElement(destinationBtn).click();
    }

    public void enterDestination(String city){
        driver.findElement(aviaBlock).findElement(destination).sendKeys(city);
    }

    public void submitDestination(){
        driver.findElement(aviaBlock).findElement(destination).sendKeys(Keys.ENTER);
    }

    public void clickDepartureBtn(){
        driver.findElement(aviaBlock).findElement(departureBtn).click();
    }

    public void clickDepartureDateBtn(){
        driver.findElement(aviaBlock).findElement(departureDateBtn).click();
    }

    public void clickOneWayBtn(){
        driver.findElement(aviaBlock).findElement(oneWayBtn).click();
    }

    public void clickFindBtn(){
        driver.findElement(aviaBlock).findElement(findBtn).click();
    }

}
