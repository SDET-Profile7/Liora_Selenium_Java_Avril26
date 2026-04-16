package tests.manage.identity;

import helper.EnvReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.manage.common.CommonTestSuites;

public class LoginTestSuite extends CommonTestSuites {


    @Test
    public void connect_with_invalid_username(){
        hp.access_to_my_account();
        lp.login("", "yyyyyy");
        Assertions.assertTrue(lp.getErrorText().contains("Username is required"));

    }

    @Test
    public void connect_with_invalid_password(){
        hp.access_to_my_account();
        lp.login("amirab", "uuuuu");
        Assertions.assertTrue(lp.getErrorText().contains("ce mot de passe ne correspond pas"));

    }
    @Test
    public void connect_with_valid_credntials(){

        hp.access_to_my_account();
        lp.login(EnvReader.validUsername(), EnvReader.validPassword());
    }






































}
