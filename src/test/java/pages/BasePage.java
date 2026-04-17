package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class BasePage {


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void access_to_url(String url){

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public void fill_text_in_textbox(String xpathLocator, String text){

       WebElement text_element = driver.findElement(By.xpath(xpathLocator));

       text_element.sendKeys(text);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.backgroundColor = 'yellow'", text_element);

    }

    public void hover(String locator){

        Actions act = new Actions(driver);

        WebElement element = driver.findElement(By.xpath(locator));

        act.moveToElement(element).perform();

    }

    public void close_web_page(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.close();
    }

    public void click_to_element(String locator){

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();

    }

    public void click_to_element_byJSExecutor(String locator){

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element );

    }


}
