package pages;


public class ProductPage extends  BasePage {



    public void add_product_to_cart_by_name(String product_name){


        click_to_element_byJSExecutor("//a[@aria-label='Add to cart: “"+product_name+"”']");

    }



}
