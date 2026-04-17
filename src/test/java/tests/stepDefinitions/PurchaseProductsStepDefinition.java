package tests.stepDefinitions;

import helper.EnvReader;
import helper.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class PurchaseProductsStepDefinition {

    BasePage bp;
    HomePage hp ;
    LoginPage lp;
    ProductPage pp;

    @Given("User is on website page")
    public void acc_website(){


        Utility.driver = new ChromeDriver();
        bp = new BasePage();
        hp = new HomePage();
        lp = new LoginPage();
        pp = new ProductPage();
        hp.access_to_url(EnvReader.getURL());


    }

    @When("User goes to page {string}")
    public void go_to_page(String page_name){

        hp.hover_to_menu_by_name(page_name);

    }

    @When("User goes to sub page {string}")
    public void go_to_sub_page(String sub_page){

        hp.access_to_sub_menu_by_name(sub_page);


    }

    @When("User chooses a product {string} and adds it to cart")
    public void buy_product(String product_name){

        pp.add_product_to_cart_by_name(product_name);


    }





}
