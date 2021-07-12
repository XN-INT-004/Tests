import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();  
	    driver.get("http://192.168.1.7:3000/");
	   
	    WebElement getstarted = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div"));
	    boolean a = getstarted.isDisplayed();
	    System.out.println(a);
	    
	    WebElement getstarted1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div"));
	    boolean b = getstarted.isEnabled();
	    System.out.println(b);
	    
	    WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div"));
	    boolean c = login.isDisplayed();
	    System.out.println(c);
	    
	    WebElement login1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div"));
	    boolean d = login.isEnabled();
	    System.out.println(d);
	    
   

	}


}
