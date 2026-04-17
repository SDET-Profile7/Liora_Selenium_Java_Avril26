package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/*

 Cette classe est responsable de l'execution, ceci dit, nous avons besoin de rajouter une @ qui vient de Junit-Cucumber pour executer

 le code, vous devriez installer la librairy Junit-Cucumber pour avoir acces aux @RunWith qui remplace @Test
 */

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources",
        glue = "tests.stepDefinitions",
        plugin = {"pretty", "html:target/shopin-report.html"}

)
public class Runner {


}
