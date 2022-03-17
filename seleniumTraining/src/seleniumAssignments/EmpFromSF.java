package seleniumAssignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpFromSF {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
//		List of employee names
		List<WebElement> List = driver.findElements(By.xpath("//tbody/tr[@role='row']/td[1]"));
		
//		List of City
		List<WebElement> List2 = driver.findElements(By.xpath("//tbody/tr[@role='row']/td[3]"));
		
		for(int i=0;i<List2.size();i++) {
			if(List2.get(i).getText().equalsIgnoreCase("San Francisco")) {
				System.out.println(List.get(i).getAttribute("data-search"));
			}
		}
	}
}