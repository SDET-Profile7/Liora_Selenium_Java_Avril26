package pages;

import helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {


    public void access_to_my_account(){

        Utility.driver.findElement(By.xpath("//a[@href='https://shop-in.ovh/mon-compte/']")).click();

    }


    public void access_to_menu_by_name(String page_name){

        Utility.driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[normalize-space()='"+page_name+"']")).click();


    }

    public void move_to_menu_by_name(String page_name){

        Actions act = new Actions(Utility.driver);

        WebElement menu_element = Utility.driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[normalize-space()='"+page_name+"']"));

        act.moveToElement(menu_element).perform();

    }

    public void access_to_sub_menu_by_name(String subMenu){

        click_to_element("//ul[@id='menu-main-menu']//ul[@class='sub-menu']//a[normalize-space()='"+subMenu+"']");

    }


}
