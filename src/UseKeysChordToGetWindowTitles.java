import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseKeysChordToGetWindowTitles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']
		// //a")).size());
		//Actions a = new Actions(driver);
		int size = driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).size();
		for (int i = 0; i < size; i++) 
		{
			
			String keysToOpenLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).get(i).sendKeys(keysToOpenLinks);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) 
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}

}
