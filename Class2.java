import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();  
	    driver.get("http://192.168.1.7:3001/");
	   
	    WebElement type = driver.findElement(By.xpath("//*[@id=\"to-do-form\"]/input"));
	    type.sendKeys("Do Yoga");
	    
	 
	    
	    WebElement add = driver.findElement(By.xpath("/html/body/div/div/header/form/button"));
	    boolean a = add.isDisplayed();
	    System.out.println(a);
	    
	    WebElement add1 = driver.findElement(By.xpath("/html/body/div/div/header/form/button"));
	    boolean b = add1.isEnabled();
	    System.out.println(b);
	    
	    WebElement clickadd = driver.findElement(By.xpath("/html/body/div/div/header/form/button"));
	    clickadd.click();
	   
	}


}
