import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test {
	public static void main(String[] args) {
		//setting the driver executable
			//Firefox Driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Setup\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
			//Initiating Firefox Driver
		WebDriver driver = new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//open browser with desired URL
		driver.get("http://192.168.56.1:3000");
		
		//To Locate Get Started Button and click
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div")).click();
        //To Locate Log In Button and Click on 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div")).click();
		

		}
}
