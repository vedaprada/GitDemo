import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.cssSelector("input#tags")).sendKeys("p"); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id = 'ui-id-1']/li[@class = 'ui-menu-item']")));
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id = 'ui-id-1']/li[@class = 'ui-menu-item']"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("Python"))
			{
				option.click();
				break;
			}
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}

// //frameset[@name = 'frameset-middle']/frame[@name = 'frame-middle']
