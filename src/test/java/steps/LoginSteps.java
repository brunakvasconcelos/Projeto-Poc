package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;

    @Dado("que clico em {string}")
    public void queClicoEm(String string) {
        driver = new ChromeDriver();
        driver.get("https://developers.trello.com/");
        driver.findElement(By.linkText("Log in")).click();

    }

    @Quando("clico em {string}")
    public void clicoEm(String string) {
        driver.findElement(By.className("css-19r5em7")).click();

    }

    @Entao("Exibe mensagem {string}")
    public void exibeMensagem(String string) {
        String texto = driver.findElement(By.id("username-uid3-error")).getText();
        Assert.assertEquals("Insira um endereço de e-mail",texto);
    }

}
