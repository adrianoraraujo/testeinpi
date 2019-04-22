package br.ucsal.testes.adriano.testeSiteAdriano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
		WebElement element;
		WebElement element2;
		

		WebElement email;

		WebElement button;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeOptions chrome = new ChromeOptions();
		//chrome.setHeadless(false);
		driver = new ChromeDriver(chrome);

		driver.get("https://gru.inpi.gov.br/pePI/");
		driver.findElement(By.xpath("//*[@id=\"principal\"]/form/table/tbody/tr[3]/td/input")).click();
		driver.get("https://gru.inpi.gov.br/pePI/jsp/marcas/Pesquisa_titular.jsp");
		
		element = 	driver.findElement(By.xpath("//*[@id=\"principal\"]/table[2]/tbody/tr[4]/td[2]/font/input"));
		element.sendKeys("32652423827");
		driver.findElement(By.xpath("//*[@id=\"principal\"]/table[2]/tbody/tr[9]/td/font/input[1]")).click();

		
    }
}
