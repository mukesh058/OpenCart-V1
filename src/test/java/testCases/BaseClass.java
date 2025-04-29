package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import freemarker.core.ReturnInstruction.Return;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
//	static String url= "https://demowebshop.tricentis.com/";
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) throws IOException {
		FileReader file=new FileReader("./src//test//resources//config.properties");
		prop=new Properties();
		prop.load(file);
		try {
			
			switch (br.toLowerCase()) {
			case "chrome" : driver= new ChromeDriver();break;
			case "edge" : driver=new EdgeDriver();break;
			case "firefox" :driver=new FirefoxDriver();break;
			default: System.out.println("Invalid Browser name");return;
			}
			
			driver.get(prop.getProperty("appUrl"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@AfterClass
	void tearDown() {
		
		try {
			Thread.sleep(5000);
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	

	static public String randomString(int num)
	{
		return RandomStringUtils.randomAlphabetic(num);
	}
	
	
}
