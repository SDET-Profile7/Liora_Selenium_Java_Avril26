package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    WebDriverWait wait = new WebDriverWait(Utility.driver, Duration.ofSeconds(10));

    public void access_to_url(String url){

        Utility.driver.get(url);
        Utility.driver.manage().window().maximize();
        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public void close_web_page(){
        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Utility.driver.close();
    }

    public void click_to_element(String locator){

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();

    }

    public void click_to_element_byJSExecutor(String locator){

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

        ((JavascriptExecutor)Utility.driver).executeScript("arguments[0].click();", element );

    }


}
