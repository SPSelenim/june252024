package home1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome1.Home1;

public class TC1Home {
	public WebDriver driver = null;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Test NG"+getClass());
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");

	}

	@Test
	public void f() {
		// 10.50 am 11:25 // 35
		try {
			driver.manage().window().maximize();
			Home1 hh = new Home1(driver);
			hh.sendFirstName("xxx2121");
			hh.sendLastName("done");
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.getStackTrace();
		}

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
