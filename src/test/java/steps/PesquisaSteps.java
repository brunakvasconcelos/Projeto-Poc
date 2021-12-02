package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaSteps {
private WebDriver driver;
@Test

    @Dado("que acsesso a area de desenvolvedores")
    public void queAcsessoAAreaDeDesenvolvedores() {
        driver = new ChromeDriver();
        driver.get("https://developers.trello.com/");
    }


    @Quando("clico em search digitando o assunto")
    public void clicoEmSearchDigitandoOAssunto() {
        driver.findElement(By.className("css-1yzx7dv")).sendKeys("buttons");
    }

    @Quando("dou enter")
    public void douEnter() {
        driver.findElement(By.className("css-1yzx7dv")).sendKeys(Keys.ENTER);

    }
    @Entao("visualizo o resultado da pesquisa")
    public void visualizoOResultadoDaPesquisa() {
        //String texto= driver.findElement(By.xpath("//div[@id=\"root\"]")).getText();

       //Assert.assertEquals("buttons",texto);
    }


}
