package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.nio.file.LinkOption;
import java.time.Duration;

public class mainTest {
    WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
    Logger logger = LogManager.getLogger();

    @BeforeTest
    public void configure(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        logger.info("Browser Started");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeDriver(){
        driver.close();
        logger.info("Browser Closed");
        driver.quit();
    }

    protected void sleep(){
        logger.info("Sleeping in 0.5 sec");
        // sleeping to wait js loading
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        try { Thread.sleep(500); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
    protected void sleep(int load){
        // the same with given time
        logger.info("Sleeping while loading {} sec", load);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(load));
        try { Thread.sleep(500); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }

    protected void sleep(float sec){
        // the same with given time
        logger.info("Sleeping in {} sec", sec);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        try { Thread.sleep((long) (sec * 1000)); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
