package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {


    public static void main(String[] args) {


        WebDriver driver = null;

        String browser = null;

        if (browser.equals("chrome")){

                driver  = new ChromeDriver();

        } else if (browser.equals("edge")) {

            driver = new EdgeDriver();

        }

        driver.get("");




    }
    }