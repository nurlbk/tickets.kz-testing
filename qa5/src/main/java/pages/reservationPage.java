package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reservationPage extends mainPage {

    private final By dataBlock = By.xpath("//div[@class='row fields-builder-v2']");

    private final By name = By.xpath("div[4]/div/label/input");
    private final By surname = By.xpath("div[3]/div/label/input");

    private final By genderDropdownBtn = By.xpath("div[2]/div/label/button");
    private final By genderBtn = By.xpath("div[2]/div/div/div/div/button[1]");

    private final By dateOfBirth = By.xpath("div[5]/div/label/input");

    private final By uin = By.xpath("div[10]/label/input");
    private final By documentTypeDropdownBtn = By.xpath("div[7]/div/label/button");
    private final By documentTypeBtn = By.xpath("div[7]/div/div/div/div/button[1]");
    private final By documentNumber = By.xpath("div[8]/div/label/input");
    private final By documentValidityDate = By.xpath("div[9]/div/label/input");

    private final By nextPageBtn = By.xpath("//button[@class='bg-17 color-1 size-6 pl-2 pr-2 shadow ripple f-center-center w-100 font-size-16 t-btn-atomic cursor-pointer theme-default']");

    public reservationPage(WebDriver driver) {
        super(driver);
    }

    public void setFullName(String name, String surname){
        driver.findElement(dataBlock).findElement(this.name).sendKeys(name);
        driver.findElement(dataBlock).findElement(this.surname).sendKeys(surname);
    }

    public void clickGenderDropdownBtn(){
        driver.findElement(dataBlock).findElement(genderDropdownBtn).click();
    }

    public void clickGenderBtn(){
        driver.findElement(dataBlock).findElement(genderBtn).click();
    }

    public void clickDocumentTypeDropdownBtn(){
        driver.findElement(dataBlock).findElement(documentTypeDropdownBtn).click();
    }

    public void clickDocumentTypeBtn(){
        driver.findElement(dataBlock).findElement(documentTypeBtn).click();
    }

    public void setDocument(String uin, String documentNumber, String documentValidity){
        driver.findElement(dataBlock).findElement(this.uin).sendKeys(uin);
        driver.findElement(dataBlock).findElement(this.documentNumber).sendKeys(documentNumber);
        driver.findElement(dataBlock).findElement(this.documentValidityDate).sendKeys(documentValidity);
    }

    public void setDateOfBirth(String dateOfBirth){
        driver.findElement(dataBlock).findElement(this.dateOfBirth).sendKeys(dateOfBirth);
    }

    public void clickNextPageBtn(){
        driver.findElement(nextPageBtn).click();
    }
}
