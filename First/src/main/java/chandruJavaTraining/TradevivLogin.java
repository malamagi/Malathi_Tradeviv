package chandruJavaTraining;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementClickInterceptedException;





import io.github.bonigarcia.wdm.WebDriverManager;

public class TradevivLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://tradeviv.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//div[.='row sign-in my-account-dropdown position-relative show'])[1]")).click();
		//use Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement userlogin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='User Login'])[1]")));
		userlogin.click();
		driver.findElement(By.id("username")).sendKeys("rajasekar3900@gmail.com");
		driver.findElement(By.id("password")).sendKeys("raja");
	//	driver.findElement(By.name("login")).click();

//			WebElement element = driver.findElement(By.xpath("//button[@class='woocommerce-form-login__submit btn btn-primary border-0 rounded-0 submit-btn float-none w-100']"));
//		
//			Actions actions = new Actions(driver);
//		
//			actions.moveToElement(element).click().perform();





		//driver.findElement(By.xpath("//button[@class='woocommerce-form-login__submit btn btn-primary border-0 rounded-0 submit-btn float-none w-100']")).click();

		//		WebDriverWait loginwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//		WebElement userlogin1=loginwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@class='woocommerce-form-login__submit btn btn-primary border-0 rounded-0 submit-btn float-none w-100']")));
		//		userlogin1.click();













		//driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/header/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a/span")).click();

		//driver.findElement(By.xpath("//a[@class='text-dark']")).click();//open user registration page.


		//*[@id="page_wrapper"]/header/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a/span

		//*[@id=\"page_wrapper\"]/header/div[1]/div/div/div[2]/div/div[2]/ul/li[2]



		//		WebDriverWait wait= new WebDriverWait(driver, 30);
		//		WebElement usericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row sign-in my-account-dropdown position-relative']")));
		//		usericon.click();

		//WebDriverWait wait= new WebDriverWait(driver, 40);
		//WebElement usericon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row sign-in my-account-dropdown position-relative show']")));
		//usericon.click();

		//driver.findElement(By.xpath("//div[@class='row sign-in my-account-dropdown position-relative show']"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}



}
