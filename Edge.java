package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Bonoshri\\eclipse-workspace\\seleniumlearning\\test\\resources\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		driver.quit();


	}

}
