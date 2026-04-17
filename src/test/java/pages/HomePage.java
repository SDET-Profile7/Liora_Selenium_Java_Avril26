package pages;


public class HomePage extends BasePage {

    public void access_to_my_account(){

        click_to_element("//a[@href='https://shop-in.ovh/mon-compte/']");
    }

    public void access_to_menu_by_name(String page_name){

        click_to_element("//ul[@id='menu-main-menu']//a[normalize-space()='"+page_name+"']");

    }
    public void hover_to_menu_by_name(String page_name){

      hover("//ul[@id='menu-main-menu']//a[normalize-space()='"+page_name+"']");

    }
    public void access_to_sub_menu_by_name(String subMenu){

        click_to_element("//ul[@id='menu-main-menu']//ul[@class='sub-menu']//a[normalize-space()='"+subMenu+"']");

    }

}
