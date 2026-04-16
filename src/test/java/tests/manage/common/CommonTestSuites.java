package tests.manage.common;

import helper.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class CommonTestSuites {


   public BasePage bp = new BasePage();
   public  HomePage hp = new HomePage();
   public LoginPage lp = new LoginPage();

    @BeforeEach
    public void init(){

        Utility.driver = new ChromeDriver();

        bp.access_to_url("https://shop-in.ovh/");

    }


}
