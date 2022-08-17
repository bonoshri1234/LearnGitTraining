package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
  @Test
  public void SearchDragDrop() throws InterruptedException {
	  
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	Actions act= new Actions(driver);
	WebElement A=driver.findElement(By.id("column-a"));//source
	WebElement B =driver.findElement(By.id("column-b"));//target
	Thread.sleep(6000);
	act.dragAndDrop(A, B).perform();
	Thread.sleep(6000);
  }
     @BeforeMethod
     public void beforeMethod() {
    	 System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Bonoshri\\eclipse-workspace\\seleniumlearning\\test\\resources\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 
  }
}
