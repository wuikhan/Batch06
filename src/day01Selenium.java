import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Waqas Khan\\Downloads\\Jar Files\\chromedriver\\chromedriver.exe");
		
		// create an object of the webdriver interface using chromedriver constructor
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codegator.herokuapp.com/index.php");
		
		String title = driver.getTitle();
		System.out.println("The title of the website is : "+title);
		
		WebElement inputFieldLink = driver.findElement(By.id("inputField"));
		inputFieldLink.click();
		
		driver.findElement(By.name("vehicle1")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Form")).click();
		
		driver.findElement(By.partialLinkText("Practice")).click();
		
		String h1Text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(h1Text);
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("tablesLink")).click();
		
		// driver.close();
	}

}
