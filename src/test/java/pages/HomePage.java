package pages;

import helper.Utility;
import org.openqa.selenium.By;

public class HomePage {


    public void access_to_my_account(){

        Utility.driver.findElement(By.xpath("//a[@href='https://shop-in.ovh/mon-compte/']")).click();

    }


    public void access_to_menu_by_name(String page_name){

        Utility.driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[normalize-space()='"+page_name+"']")).click();


    }


}
