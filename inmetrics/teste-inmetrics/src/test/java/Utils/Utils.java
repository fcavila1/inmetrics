package Utils;

import static Utils.Utils.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

public class Utils {

	public static WebDriver driver;

	public static void acessarAplicacao() {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
	}

	public static <T> T ExecutarClasse(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}

	public static void capturarTela(Scenario scenario) {
		System.out.println("------------------CAPTUROU TELA--------------------------------");
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
	public static void esperarElemento(WebElement elemento) {
		WebDriverWait espera = new WebDriverWait(driver, 60);
		espera.until(ExpectedConditions.visibilityOf(elemento));
	}


}
