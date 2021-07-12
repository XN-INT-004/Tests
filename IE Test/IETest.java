import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Test {
	public static void main(String[] args) {
		
//setting the driver executable
			//IE Driver
		//System.setProperty("webdriver.ie.driver","C:\\Users\\DELL\\Desktop\\Setup\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
					
		//Initiating Browser Driver
			//Initiating IE Driver
		//WebDriver driver=new InternetExplorerDriver();
	       		
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
