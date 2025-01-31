import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 650)");
		System.out.println("Number of Rows "+driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
		System.out.println("Number of columns "+driver.findElements(By.cssSelector("table[name='courses'] th")).size());
		for(int i = 0; i<3; i++)
		{
			System.out.println("2nd row content-"+(i+1)+": "+driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td")).get(i).getText());
		}
	}

}
