package com.CommonActions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	

	public class AppDriver {
		
		public static WebDriver driver;
		
		public static void openBrowser(String browser) {
			
			try {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HomePC\\eclipse-workspace\\SeleniumAutomation\\chromedriver.exe");
				//WebDriver driver=new ChromeDriver();
				driver = new ChromeDriver();
			
				System.out.println("user is able to open Browser");			
			}
			
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(" user is not able to open Browser");
			}
					
		}
		
		//URL Navigation
		
		public static void UrlNavigate() {
			
			try {
				
				//driver.manage().window().fullscreen();
				driver.manage().window().maximize();
				//driver.manage().wait(10);
				//WebDriver driver = new ChromeDriver();
			
				driver.get("https://ebay.com/");
				
				System.out.println("User is able to launch the app");
				
			}
			
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("User is not able to launch the app");
			}
		}

		// Enter text in text field
		
		public static void enterText(String xPath, String value) {
			
			try {
				
				
			
				driver.findElement(By.xpath(xPath)).clear();
				driver.findElement(By.xpath(xPath)).sendKeys(value);

				System.out.println("User is able to enter text" +value);									
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("User is not able to enter text");
			}
		}
		
		public static void enterInteger (String xPath, int value) {
			try {
				
				driver.findElement(By.xpath(xPath)).clear();
				// to enter numeric values via sendKeys()
				driver.findElement(By.xpath(xPath)).sendKeys(String.valueOf(value));

				
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("user is not able to enter value" +value);
			}
		}
		
		//to select element
		
		public static void selectItem(String xPath, String value) {
			try {
				
				WebElement element = driver.findElement(By.xpath(xPath));
				Select sele = new Select (element);
				sele.selectByVisibleText(value);
			
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("user is not able to select element" +value);
			}
		}
		
		// for clicking the Xpath 
		public static void clickButton (String xPath) {
			try {
			
				
				driver.findElement(By.xpath(xPath)).click();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		// to close the browser
		public static void closeBrowser() {
			try {
				//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
				driver.close();
				driver.quit();
			}
			
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("User not able to close the browser");
			}
		}
		
	}
 

