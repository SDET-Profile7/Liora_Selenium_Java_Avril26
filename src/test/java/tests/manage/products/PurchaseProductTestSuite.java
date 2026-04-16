package tests.manage.products;

import org.junit.jupiter.api.Test;
import tests.manage.common.CommonTestSuites;

public class PurchaseProductTestSuite extends CommonTestSuites {


    @Test
    public void purchase_inStock_product(){

    hp.move_to_menu_by_name("Boutique");
    hp.access_to_sub_menu_by_name("Accessories");
    pp.add_product_to_cart_by_name("Brown Cap");


    }



}
