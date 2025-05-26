import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SampleTest {
	private static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Phóng lớn cửa sổ
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 if (driver != null) {
	            driver.quit();
	        }
	}

	@Test
	void test1() {
		driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        assert title.contains("Google");
	}
	@Test
	void test2() {
		String url = "https://www.youtube.com/";
		driver.get(url);
		String title = driver.getTitle();
        System.out.println("Title is: " + title);
        assert title.contains("YouTube");
	}
	
}
