package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src\\main\\resources\\features\\pesquisa.feature",
        glue = "src/main/java/steps/PesquisaSteps.java",
        plugin = {"pretty"},
        //tags = {},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class Runner {

}
