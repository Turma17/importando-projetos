package AutomacaoAdvantageShop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvantageOnlineShop {
	
	
	WebDriver navegador;
	
	@Before
	public void setUp() throws Exception {
	// mostrar o caminho do chrome para o codigo	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	// para abrir o chrome
	navegador = new ChromeDriver();
	// abre e maximiza a tela
	navegador.manage().window().maximize();
	// para acessar a url
	navegador.get("https://www.advantageonlineshopping.com/#/");
	// código de pausa
		Thread.sleep(5000);	
	// para pegar o elemento    //elemento   //código para clicar
	navegador.findElement(By.id("menuUser")).click();
	// para pegar o elemento    //elemento   //código preencher
	navegador.findElement(By.name("username")).sendKeys("TesteTurma1720"); 
	// código de pausa
	Thread.sleep(5000);
	navegador.findElement(By.name("password")).sendKeys("Tu12345678");
	
	navegador.findElement(By.id("sign_in_btn")).click();
	// codigo para fechar navegador
	navegador.quit();
	}

	@After
	public void tearDown() throws Exception {
		
		
		
	}

	@Test
	public void test() {
		
		
		
		
		fail("Not yet implemented");
	}

}
