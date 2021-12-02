package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;

    @Test
    @Dado("que clico em login")
    public void que_clico_em_login() {
        driver = new ChromeDriver();
        driver.get("https://developers.trello.com/");
        driver.findElement(By.linkText("Log in")).click();

    }

    @Quando("clico em Continuar")
    public void clicoEmContinuar() {
        driver.findElement(By.className("css-19r5em7")).click();

    }

    @Entao("Exibe mensagem Insira um endereco de email")
    public void exibeMensagemInsiraUmEnderecoDeEmail() {

        String texto = driver.findElement(By.xpath("//div@id=\"username-uid3-error\"");

        //System.out.println(texto);


    }
}
