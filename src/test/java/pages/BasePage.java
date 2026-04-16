package pages;

import helper.Utility;

import java.time.Duration;

public class BasePage {

    public void access_to_url(String url){

        Utility.driver.get(url);
        Utility.driver.manage().window().maximize();
        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void close_web_page(){
        Utility.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Utility.driver.close();
    }


}
