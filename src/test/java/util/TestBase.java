package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream fileInput_obj = new FileInputStream("C:\\Selenium_Workspace_New\\Test_01_BDD\\src\\test\\java\\util\\config.properties");
		prop.load(fileInput_obj);
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser1");
		System.out.println("Browser : "+browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chroem.driver","user.dir"+"src/test/java/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url1"));
	}
}
