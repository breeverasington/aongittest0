package seleniumAssignments;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnSelection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		if(inp.equalsIgnoreCase("Male")) {
			driver.findElement(By.cssSelector("input[value='Male'][name='optradio']")).click();
			if(driver.findElement(By.cssSelector("input[value='Male'][name='optradio']")).isSelected()) {
				System.out.println(inp+" is selected");
			}
			else {
				System.out.println(inp+" is not selected");
			}
		}
		else {
			driver.findElement(By.cssSelector("input[value='Female'][name='optradio']")).click();
			if(driver.findElement(By.cssSelector("input[value='Female'][name='optradio']")).isSelected()) {
				System.out.println(inp+" is selected");
			}
			else {
				System.out.println(inp+" is not selected");
			}
		}
	}
}