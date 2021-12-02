package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue = {"steps"},
        plugin = { "pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        //tags = {"@testLogin"},
        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
       // dryRun = false
)
public class RunnerTest {
    public static void main(String[] args) {

      { io.cucumber.core.cli.Main.main(args); }
}
}
