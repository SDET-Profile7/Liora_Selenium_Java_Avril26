package pages;

import helper.Utility;
import org.openqa.selenium.By;

public class LoginPage extends  BasePage {


    public void login(String username, String password){

        fill_text_in_textbox("//input[@id='username']", username);
        fill_text_in_textbox("//input[@id='password']", password);
        click_to_element("//button[@value='Log in']");

    }

    public String getErrorText(){

      return Utility.driver.findElement(By.xpath("//ul[@class='woocommerce-error']/li")).getText();

    }



}
