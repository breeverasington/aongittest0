package seleniumTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		selectDate("2022", "June", "15");
	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}
	
	public static void selectDate(String expYear, String expMonth, String expDate) {
		String monthYearVal = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println("Month Year: "+monthYearVal);
		while(!(getMonthYear(monthYearVal)[0].equalsIgnoreCase(expMonth) && getMonthYear(monthYearVal)[1].equalsIgnoreCase(expYear))){
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			
		}
	}
}