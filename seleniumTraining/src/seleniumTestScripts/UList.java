package seleniumTestScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		Thread.sleep(1000);
		List<WebElement> List = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		System.out.println("Number of list items :" +List.size());
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
				System.out.println(List.get(i).getText());
				List.get(i).click();
				break;
			}
		}
	}
}