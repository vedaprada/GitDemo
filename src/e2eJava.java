import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2eJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while(i < 5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
