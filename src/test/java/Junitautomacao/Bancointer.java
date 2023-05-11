package Junitautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	WebDriver driver;
	
		@Before
	public void setUp() throws Exception {
// comando para apontar o driver do navegador
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//comando para indicar meu driver instaciado
driver = new ChromeDriver()	;
//comando para maximizar a tela
driver.manage().window().maximize();

// comando para indicar o site a ser aberto
driver.get("https://www.4devs.com.br/gerador_de_pessoas");
Thread.sleep(3000);
//comando para indicar o elemento a ter a interaçao
driver.findElement(By.id("bt_gerar_pessoa")).click();
String nome;
String cpf;
String telefone;
String email;
String datanascimento;
Thread.sleep(3000);
nome = driver.findElement(By.id("nome")).getText();
cpf = driver.findElement(By.id("cpf")).getText();
telefone = driver.findElement(By.id("telefone_fixo")).getText();
email = driver.findElement(By.id("email")).getText();
datanascimento = driver.findElement(By.id("data_nasc")).getText();
System.out.println(nome);
System.out.println(cpf);
System.out.println(telefone);
System.out.println(email);
System.out.println(datanascimento);
//Thread.sleep(5000);
driver.quit();

System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
driver = new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://www.bancointer.com.br/");
driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
Thread.sleep(3000);
driver.findElement(By.id("nome")).sendKeys(nome);
driver.findElement(By.id("cpf")).sendKeys(cpf);
driver.findElement(By.id("celular")).sendKeys(telefone);
driver.findElement(By.id("email")).sendKeys(email);
driver.findElement(By.id("dataNascimento")).sendKeys(datanascimento);
Thread.sleep(1000);
driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
		}

		

	@After
	public void tearDown() throws Exception {
	//driver.quit();
		
				
	}

	@Test
	public void validacaodoTextoFormulario() throws InterruptedException {
		
		
	
	
	
	}

}
