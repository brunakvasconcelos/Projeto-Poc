package steps;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaSteps {
    @Test
    @Dado("^que acsesso a area de desenvolvedores$")
    public void queAcsessoAAreaDeDesenvolvedores() throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://developers.trello.com/");
    }

    @Quando("^clico em search$")
    public void clicoEmSearch() throws Throwable {

    }

    @Quando("^digito o assunto$")
    public void digitoOAssunto() throws Throwable {

    }

    @Então("^visualizo os assuntos sobre buttons$")
    public void visualizoOsAssuntosSobreButtons() throws Throwable {

    }


}
