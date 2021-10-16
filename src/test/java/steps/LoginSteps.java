package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;
@Test
@Dado("que clico em log in")
public void que_clico_em_log_in() {
        driver = new ChromeDriver();
        driver.get("https://developers.trello.com/");
        driver.findElement(By.linkText("Log in")).click();

    }

    @Quando("clico em Continuar")
    public void clico_em_Continuar() {
        driver.findElement(By.className("css-19r5em7")).click();

    }

    @Entao("Exibe mensagem Insira um endereço de e-mail")
    public void exibe_mensagem_Insira_um_endereço_de_e_mail() {
        String texto = driver.findElement(By.id("username-uid3-error")).getText();
        Assert.assertEquals("Insira um endereço de e-mail",texto);
    }

}
