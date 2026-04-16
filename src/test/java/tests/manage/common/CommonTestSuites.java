package tests.manage.common;

import helper.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CommonTestSuites {


   public BasePage bp = new BasePage();
   public  HomePage hp = new HomePage();
   public LoginPage lp = new LoginPage();
   public ProductPage pp = new ProductPage();

    @BeforeEach
    public void init() throws InterruptedException {

        String browser = null;

        if (browser.equals("chrome")){

            Utility.driver = new ChromeDriver();


        } else if (browser.equals("edge")) {

            Utility.driver = new EdgeDriver();


        }


        bp.access_to_url("https://shop-in.ovh/");

    }


}
