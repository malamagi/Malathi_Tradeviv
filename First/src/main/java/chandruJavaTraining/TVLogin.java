package chandruJavaTraining;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;

import chandruJavaTraining.TVLogin;

import org.openqa.selenium.TimeoutException;


import io.github.bonigarcia.wdm.WebDriverManager;

class TVLogin {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

//		driver.get("https://tradeviv.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//		//User Icon
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement usericon=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='row sign-in my-account-dropdown position-relative'])[1]")));
//		usericon.click();
//
//		//User Login
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement userlogin=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='User Login'])[1]")));
//		userlogin.click();
//
//		WebElement usernamefield=driver.findElement(By.id("username"));
//		WebElement passwordfield=driver.findElement(By.id("password"));


		String fileLocation = "./Test_Data/Login_TestData.xlsx";//Locate the file
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); //Locate the workbook
		XSSFSheet sheet=wbook.getSheetAt(2); //get the first sheet & sheet is an object
		
		 int loginCount = 0;
		for (int i = 1; i <=5; i++) {
			XSSFRow row = sheet.getRow(i);
	//		for (int j = 0; j <2; j++) {
				//XSSFCell cell = row.getCell(j);
				  XSSFCell usernameCell = row.getCell(0);
		            XSSFCell passwordCell = row.getCell(1);
				
		            String username = usernameCell.getStringCellValue();
		            String password = passwordCell.getStringCellValue();
		            
		            System.out.println("Attempting login " + (i) + " with:");
		            
		            System.out.println("Username: " + username);
		            System.out.println("Password: " + password);
		            
		            driver.get("https://tradeviv.com");
		            driver.manage().window().maximize();
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          		            
		          //User Icon
		    		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		    		WebElement usericon=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='row sign-in my-account-dropdown position-relative'])[1]")));
		    		usericon.click();

		    		//User Login
		    		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		    		WebElement userlogin=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='User Login'])[1]")));
		    		userlogin.click();

		    		WebElement usernamefield=driver.findElement(By.id("username"));
		    		WebElement passwordfield=driver.findElement(By.id("password"));
		    		
		    		usernamefield.clear();
		            usernamefield.sendKeys(username);
		            passwordfield.clear();
		            passwordfield.sendKeys(password);
		            
		         // login_btn.click();  Use Javascript
		    		WebElement login_btn=driver.findElement(By.xpath("//*[@value='Log in']"));
		    		JavascriptExecutor executor=(JavascriptExecutor)driver;
		    		executor.executeScript("arguments[0].click()", login_btn);
		    		
		    		//After Login Click for user icon for logout
					WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
					WebElement logout_icon=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='img-fluid user lazy'])[1]")));
					logout_icon.click();
					
					//Logout Link
					driver.findElement(By.xpath("(//span[.='Logout'])[1]")).click();
					 // Increment login count
		            loginCount++;
		            System.out.println("Logged in and out successfully " + loginCount + " time(s).");
    					 }

		wbook.close();
	}}

//Sendkeys
//		driver.findElement(By.id("username")).sendKeys("rajasekar3900@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("raja");




//driver.findElement(By.xpath("(//img[@class='img-fluid user lazy'])[1]")).click();

//After Login Click for user icon for logout
//				WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
//				WebElement logout_icon=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='img-fluid user lazy'])[1]")));
//				logout_icon.click();

//Logout Link
//		driver.findElement(By.xpath("(//span[.='Logout'])[1]")).click();


//================================================================================================


//Explicit with try and catch	

//		 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 WebElement logout_Link =wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[.='Logout'])[1]")));
//		 logout_Link.click();
//		 String loginCountText = logout_Link.
//		 System.out.println("User Logins Count: " + loginCountText);


//Log in button - explicit wait with try catch
//		try {
//			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(60));
//				WebElement login=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space(text()='Log in')])[1]")));
//				login.click();
//		}catch(TimeoutException e) {
//		            e.printStackTrace();
//	        }


//Log in button - Fluent wait with try catch
//		try {
//		Wait<WebDriver> wait =
//				new FluentWait<>(driver)
//				.withTimeout(Duration.ofSeconds(2))
//				.pollingEvery(Duration.ofMillis(300))
//				.ignoring(ElementNotInteractableException.class);
//
//		WebElement Loginbtn = wait.until(new Function<WebDriver,WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				// TODO Auto-generated method stub
//				return driver.findElement(By.xpath("(//button[normalize-space(text()='Log in')])[1]"));
//			}
//		});
//		Loginbtn.click();
//		}catch(Exception e) {
//            e.printStackTrace();
//        } 
//	



//driver.findElement(By.xpath("(//button[normalize-space(text()='Log in')])[1]")).click();
//driver.findElement(By.name("login")).click();

//driver.findElement(By.xpath("(//span[.='User Login'])[1]")).click();

//driver.findElement(By.xpath("(//div[@class='row sign-in my-account-dropdown position-relative'])[1]")).click();

//driver.findElement(By.xpath("(//div[@class='row sign-in my-account-dropdown position-relative'])[1]")).click();

//driver.findElement(By.xpath("(//span[.='User Login'])[1]")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement usericon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"page_wrapper\\\"]/header/div[2]/div/div/div[2]/div/div[1]/a/i")));
//		usericon.click();



