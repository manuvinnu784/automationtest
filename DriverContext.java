package context;

import org.openqa.selenium.WebDriver;

public class DriverContext {
    public WebDriver driver;

    webdrivermanager.chromedriver().setup();
    webdriver driver= new chromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
	
	driver.findelement(by.id("username"));
	driver.findelement(By.id("password"));
}
