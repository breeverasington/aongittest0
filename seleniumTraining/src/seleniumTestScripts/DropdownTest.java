package seleniumTestScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select SinglSel = new Select(driver.findElement(By.id("select-demo")));
		SinglSel.selectByIndex(1);
		
		Select MultiSel = new Select(driver.findElement(By.id("multi-select")));
		if(MultiSel.isMultiple()) {
			MultiSel.selectByIndex(1);
			MultiSel.selectByIndex(1);
			MultiSel.selectByValue("Ohio");
			MultiSel.selectByVisibleText("California");
		}
			
			List<WebElement> List = MultiSel.getAllSelectedOptions();
			
			for(int i=0;i<List.size();i++) {
					System.out.println(List.get(i).getText());
				}
	}
}