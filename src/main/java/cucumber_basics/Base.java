package cucumber_basics;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Base 
{
	public static WebDriver driver;
    public static WebDriver getDriver() {
    	driver = WebDriverManager.chromedriver().create();
    	return driver;
    	
    }
}
