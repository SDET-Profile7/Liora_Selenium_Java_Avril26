package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends  BasePage {




    public void login(String username, String password){



        Utility.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        Utility.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        click_to_element("//button[@value='Log in']");

    }


    public String getErrorText(){

      return Utility.driver.findElement(By.xpath("//ul[@class='woocommerce-error']/li")).getText();

    }



}
