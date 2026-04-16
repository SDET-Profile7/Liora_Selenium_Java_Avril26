package tests.manage.common;

import helper.EnvReader;
import helper.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CommonTestSuites {


   public BasePage bp;
   public  HomePage hp ;
   public LoginPage lp;
   public ProductPage pp ;

    @BeforeEach
    public void init() throws InterruptedException {

       String browser = EnvReader.get_browser();



       if (browser == null || browser.isBlank()){

           throw new RuntimeException("La variable BROWSER est vide ou absente dans le fichier .env");
       }
       else if(browser.equalsIgnoreCase("chrome")){

           Utility.driver = new ChromeDriver();
       }

       else if(browser.equalsIgnoreCase("safari")){

           Utility.driver = new SafariDriver();

       }
       else{

           throw new RuntimeException("L navigateur n'est pas encore supporté: " + browser);


       }
        bp = new BasePage();
        hp = new HomePage();
        lp = new LoginPage();
        pp = new ProductPage();
        bp.access_to_url("https://shop-in.ovh/");

    }


}
