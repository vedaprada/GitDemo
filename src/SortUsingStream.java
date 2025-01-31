import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column
		//driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the webelements in the list
		//List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		//capture the text of all the webelements and store it in another list
		//List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list
		//List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list and sorted list
		//Assert.assertTrue(originalList.equals(sortedList));
		String price = "";
		do {
			List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));		
			for(int i = 0; i < list.size();i++)
			{
				if(list.get(i).getText().equalsIgnoreCase("Cheese"))
				{
				  price = driver.findElement(By.xpath("//tr["+(i+1)+"]/td[2]")).getText();
				  System.out.println(price);
				}
			}
			if(price.isEmpty())
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}while(price.isEmpty());
		
		
	}

}
