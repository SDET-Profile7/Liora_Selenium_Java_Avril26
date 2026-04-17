package helper;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvReader {

    public static String getURL()
    {

        return  Dotenv.load().get("URL");

    }


    public static String validUsername()
    {

    return  Dotenv.load().get("VALID_USERNAME");

    }

    public static String validPassword()
    {
        return  Dotenv.load().get("VALID_PASSWORD");
    }

    public static String get_browser(){

        return Dotenv.load().get("BROWSER");

    }
}
