import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
//		driver.findElement(By.id("password")).sendKeys("learning");
//		driver.findElement(By.xpath("//input[@value = 'user']/following-sibling::span[@class='checkmark']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("okayBtn")).click();
//		WebElement dropdownAddress = driver.findElement(By.cssSelector("select.form-control"));
//		Select select = new Select(dropdownAddress);
//		select.selectByVisibleText("Consultant");
//		driver.findElement(By.id("terms")).click();
//		driver.findElement(By.id("signInBtn")).click();
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(username);
	}

}
