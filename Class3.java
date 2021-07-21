import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();  
	    driver.get("http://localhost:19006/");
	  
	    
	    String expectedHeading1 = "Today's task";
    	//Storing the text of the heading in a string
    	String heading1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]")).getText();
    	if(expectedHeading1.equalsIgnoreCase(heading1))
          	System.out.println("The expected text is same as actual text --- "+heading1);
    	else
          	System.out.println("The expected text doesn't match the actual text --- "+heading1);
    	
    	WebElement writeatask = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/input"));
	    boolean a = writeatask.isDisplayed();
	    System.out.println(a);
	    
	    WebElement writeatask1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/input"));
	    boolean b = writeatask1.isEnabled();
	    System.out.println(b);
	    
	    WebElement button = driver.findElement(By.xpath("//html/body/div/div/div/div/div[2]/div/div"));
	    boolean c = button.isDisplayed();
	    System.out.println(c);
	    
	    WebElement button1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div"));
	    boolean d = button1.isEnabled();
	    System.out.println(d);
	    
	    WebElement write = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/input"));
	    write.sendKeys("Do Yoga");
	    
	    WebElement click = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div"));
	    click.click();
	    
	    WebElement click1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[2]/div/div"));
	    click1.click();
	    
	    
	    
	    
    	
    	

	}


}
