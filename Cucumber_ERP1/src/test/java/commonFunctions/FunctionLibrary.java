package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class FunctionLibrary 
{
	public static WebDriver driver;
	public static Properties conpro;
	//1.method for launching browser
	public static WebDriver startBrowser()throws Throwable
	{
		//create object for properties class
		conpro = new Properties();
		//load property file
		conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox"))
        {
         driver = new FirefoxDriver();
	    }
		else
		{
			Reporter.log("Browser value is not matching",true);
		}
		return driver;
      }
//2.method for launch Url
public static void openUrl()
{
	driver.get(conpro.getProperty("Url"));
}
//3.method for wait for element
public static void waitForElement(String LocatorType,String LocatorValue,String Mywait)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Mywait)));
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));	
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));	
	}
}
//4.method for text boxes
public static void typeAction(String LocatorType,String LocatorValue,String TestData)
{
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
	driver.findElement(By.xpath(LocatorValue)).clear();
	driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
	driver.findElement(By.name(LocatorValue)).clear();
	driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
	driver.findElement(By.id(LocatorValue)).clear();
	driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
	}	
}
//5.methods for buttons,radio buttons, checkboxes,links,images
public static void clickAction(String LocatorType,String LocatorValue)
{
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		driver.findElement(By.xpath(LocatorValue)).click();
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		driver.findElement(By.name(LocatorValue)).click();
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
	}
}
//6.method capturing supplier number into notepad
public static void capturesupp(String LocatorType,String LocatorValue)throws Throwable
{
	String supplierNum="";
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		supplierNum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		supplierNum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		supplierNum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
	}

    //create note pad and write suppliernum
    FileWriter fw = new FileWriter("./CaptureData/supplier.txt");
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(supplierNum);
    bw.flush();
    bw.close();
    }
//7.method validate supplier number in table
public static void supplierTable() throws IOException, InterruptedException
{
	//read supplier number from note pad
	FileReader fr = new FileReader("./CaptureData/supplier.txt");
	BufferedReader br = new BufferedReader(fr);
	String Exp_Data = br.readLine();
	//click search panel if search textbox not displayed
	if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
	//click searchpanel button
	driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
	driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
	Thread.sleep(3000);
	String Act_Data=driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
	Reporter.log(Exp_Data+"      "+Act_Data);
	if(Exp_Data.equals(Act_Data))
	{
		Reporter.log("Supplier Number Added Success",true);
	}
	else
	{
		Reporter.log("Supplier Number Added Fail",false);
	}
}

//8.method capturing Customer number into notepad
public static void captureCust(String LocatorType,String LocatorValue)throws Throwable
{
	String customerNum="";
	if(LocatorType.equalsIgnoreCase("xpath"))
	{
		customerNum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("name"))
	{
		customerNum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
	}
	if(LocatorType.equalsIgnoreCase("id"))
	{
		customerNum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
	}

  //create note pad and write customerNum
  FileWriter fw = new FileWriter("./CaptureData/customer.txt");
  BufferedWriter bw = new BufferedWriter(fw);
  bw.write(customerNum);
  bw.flush();
  bw.close();
  }
//9.method validate customer number in table
public static void CustomerTable() throws IOException, InterruptedException
{
	//read customer number from note pad
	FileReader fr = new FileReader("./CaptureData/customer.txt");
	BufferedReader br = new BufferedReader(fr);
	String Exp_Data = br.readLine();
	//click search panel if search textbox not displayed
	if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
	//click searchpanel button
	driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
	driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
	driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
	Thread.sleep(3000);
	String Act_Data=driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span")).getText();
	Reporter.log(Exp_Data+"      "+Act_Data,true);
	try {
		Assert.assertEquals(Exp_Data,Act_Data,"Customer Number Not Added");
	} catch (AssertionError e) {
		Reporter.log(e.getMessage());
	}
}

//method for close browser
public static void closeBrowser()
{
	driver.quit();
}
}

























