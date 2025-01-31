import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String date = "15";
		String month = "6";
		String year = "2027";
		String[] expectedList = { month, date, year };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.xpath("//button[text() ='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actualList.size(); i++) {

			System.out.println(actualList.get(i).getAttribute("value"));

			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}

	}

}
