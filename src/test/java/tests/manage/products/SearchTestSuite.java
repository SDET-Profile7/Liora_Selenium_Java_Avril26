package tests.manage.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestSuite {


    // La classe represente la suite de tests
    // Les methodes qu'On crée dans la classe representent les scenarios de tests

    @Test
    public void search_existing_product(){

        String product_name = "t-shirt";
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://shop-in.ovh/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@data-id='search']")).click();

        driver.findElement(By.xpath("//input[@class='modal-field']")).sendKeys(product_name + Keys.ENTER);

        String actual_text = driver.findElement(By.xpath("//h1")).getText();

       String expected_txt = "Résultats de recherche pour t-shirt";

       Assertions.assertEquals(expected_txt, actual_text);

    }


































}
