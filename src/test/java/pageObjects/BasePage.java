package pageObjects;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 1L);
        this.fluentWait = (new FluentWait(driver)).pollingEvery(Duration.ofMillis(100L)).withTimeout(Duration.ofSeconds(1L)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
    }
}