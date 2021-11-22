package br.com.ivanfsilva.leilao.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "htmlunit"); // VM Argument: -Dbrowser=firefox
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	private  WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanf\\WebDriver\\bin\\chromedriver.exe");
		return new ChromeDriver();
	}

	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ivanf\\WebDriver\\bin\\geckodriver.exe");
		return new FirefoxDriver();
	}
}
