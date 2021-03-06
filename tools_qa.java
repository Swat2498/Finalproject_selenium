package project_2;

import java.io.File;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class tools_qa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		// Launch chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium JAR\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		Thread.sleep(1000);
		
		
 //Module1 Element
		
		
		//Open URL
		w.get("https://demoqa.com/");
		
		// Maximize the window
		w.manage().window().maximize();
		
		//Get current page URL
		System.out.println(w.getCurrentUrl());
		
		//scroll down
        JavascriptExecutor js = (JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		// Click on Elements
		w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(1) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)")).click();
		
		//Get page title
		System.out.println(w.getTitle());
		Thread.sleep(500);
		
		//Click on Text box field
		w.findElement(By.className("text")).click();
		
		//Enter name
		w.findElement(By.id("userName")).sendKeys("Shruti Hatwar");
		
		//Enter username
		w.findElement(By.id("userEmail")).sendKeys("shrutihatwar6@gmail.com");
		
		//Enter current address
		w.findElement(By.id("currentAddress")).sendKeys("sdgv hjbwe; jkwe;k jbqe;k");
		
		//Enter permanent address
		w.findElement(By.id("permanentAddress")).sendKeys("jahb jdbwk trd iurlh bhjcx,bg");
		
		//Scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) w;
		js1.executeScript("window.scrollTo(0,200)");
		Thread.sleep(1000);
		
		//Click on submit button
		w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		System.out.println("Registration done successfully!!!!");
		
		//Click on check box field
		w.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
	    Thread.sleep(2000);
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
		
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[1]")).click();
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
		
		//Click on radio button field
		w.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
		Thread.sleep(500);
		w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")).click();
		System.out.println("you select  "+w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")).getText());
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label")).click();
		System.out.println("you select  "+w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label")).getText());

		//w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label")).click();
		//System.out.println("you select  "+w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label")).getText());
		
		JavascriptExecutor js2 = (JavascriptExecutor) w;
		js2.executeScript("window.scrollTo(0,200)");
		
		// Click on web tabs
		Thread.sleep(1000);
		w.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		Thread.sleep(500);
		w.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(500);
		
		w.findElement(By.id("firstName")).sendKeys("Kriti");
		w.findElement(By.id("lastName")).sendKeys("Sanon");
		w.findElement(By.id("userEmail")).sendKeys("kriti.sanon@gmail.com");
		w.findElement(By.id("age")).sendKeys("28");
		w.findElement(By.id("salary")).sendKeys("5000000");
		w.findElement(By.id("department")).sendKeys("Acting & Entertainment");
		w.findElement(By.id("submit")).click();
		System.out.println("Added successfully!!!");
		Thread.sleep(1000);
		Select S=new Select(w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]")));
		S.selectByValue("20");
		System.out.println("Rows extended: 20 ");
		
		//Click on buttons
		w.findElement(By.id("item-4")).click();
		
		Actions A=new Actions(w);
		WebElement elementLocator = w.findElement(By.id("doubleClickBtn"));
		A.doubleClick(elementLocator).perform();
		System.out.println("Double clicked");
		A.contextClick(w.findElement(By.id("rightClickBtn"))).perform();
		System.out.println("Right clicked");
		Thread.sleep(1000);
		
		//A.click(w.findElement(By.id("Iv2dU"))).perform();
		//System.out.println("clicked successfully!!!!");
		JavascriptExecutor js3 = (JavascriptExecutor) w;
		js3.executeScript("window.scrollTo(0,1000)");
		
		//Click on Links
		w.findElement(By.id("item-5")).click();
		Thread.sleep(1000);
		w.findElement(By.linkText("Home")).click();
		
		Set <String> windows = w.getWindowHandles();
		
		Iterator IT = (Iterator) windows.iterator();
		
		String parent_window = IT.next();
		
		String child_window = IT.next();
		
		w.switchTo().window(child_window);
		Thread.sleep(10000);
		w.switchTo().window(parent_window);
		System.out.println(" Window open successfully!!!!");
		
		w.findElement(By.linkText("Created")).click();
		JavascriptExecutor js4 = (JavascriptExecutor) w;
		js4.executeScript("window.scrollTo(0,200)");
		System.out.println("Link has responded with staus 201 and status text Created");
		
		w.findElement(By.linkText("No Content")).click();
		System.out.println("Link has responded with staus 204 and status text No Content");
		
		w.findElement(By.linkText("Moved")).click();
		System.out.println("Link has responded with staus 204 and status text moved permanently");
		
		w.findElement(By.linkText("Bad Request")).click();
		System.out.println("Link has responded with staus 400 and status text Bad Request");
		
		w.findElement(By.linkText("Unauthorized")).click();
		System.out.println("Link has responded with staus 401 and status text Unauthorized");
		
		w.findElement(By.linkText("Forbidden")).click();
		System.out.println("Link has responded with staus 403 and status text Forbidden");
		
		w.findElement(By.linkText("Not Found")).click();
		System.out.println("Link has responded with staus 404 and status text Not Found");
		Thread.sleep(1000);
		JavascriptExecutor js5 = (JavascriptExecutor) w;
		js5.executeScript("window.scrollTo(0,1000)");
		
		//Click on Upload Download
		w.findElement(By.xpath("//span[contains(text(),'Upload and Download')]")).click();
		
		//Download button
		w.findElement(By.id("downloadButton")).click();
		System.out.println("Downloaded successfully");
		Thread.sleep(2000);
		
		//Upload file
		Thread.sleep(3000);
		w.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\DELL\\Pictures\\soft-skills.jpg");
		System.out.println("File successfully uploaded!!!");
		
		//Screenshot 
		TakesScreenshot t= (TakesScreenshot) w;
		File src=t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\DELL\\Desktop\\Screenshorts\\s1.png"));
		
		w.quit();
		
		
		
		
 //module2 FORM
		
		
		w.get("https://demoqa.com/automation-practice-form"); 
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[2]/span/div")) .click();
	    
	    Thread.sleep(2000);
			 
		w.manage().window().maximize();
	    w.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ASWATHY");
	    w.findElement(By.id("lastName")).sendKeys("MK");
	    w.findElement(By.id("userEmail")).sendKeys("aswathy@gmail.com");
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[2]/label")).click();
	    
	    
	    w.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
	    
	    Select m=new Select(w.findElement(By.className("react-datepicker__month-select")));
	    m.selectByIndex(5);
	   
	    Select d=new Select(w.findElement(By.className("react-datepicker__year-select")));
	    d.selectByValue("1997");
	    
	   
	   w.findElement(By.xpath("//div[contains(text(),'20')]")).click();
	    
	    
	    w.findElement(By.id("userNumber")).sendKeys("9878563213");
			
	    
	    JavascriptExecutor jsa1= (JavascriptExecutor) w;
	   	jsa1.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
	    
	    
	    
	    w.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("parekkad house thozhuppadam p o");
	    
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[2]/label")).click();
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[3]/label")).click(); 
	    
	    
	    w.findElement(By.id("uploadPicture")).sendKeys("C:\\aswathy2\\2017-12-22-12-49-37-862.jpg");
	    
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div[1]/div[1]")).click();
	    w.findElement(By.xpath("//div[contains(text(),'Rajasthan')]")).click();
	    
	    
	    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div[1]/div[1]")).click();
	    w.findElement(By.xpath("//div[contains(text(),'Jaipur')]")).click();
	    
	    
	    Thread.sleep(2000);

	    w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    
	    
	   // w.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();
	    
		System.out.println("practice form done successfully ");
			
			
			
//module3 WINDOWS ALERT FRAME
		
		
		//Open URL
		w.get("https://demoqa.com/");
		// Maximize the window
		w.manage().window().maximize();
		//Alert frame window
		
		JavascriptExecutor jsa2 = (JavascriptExecutor) w;
		jsa2.executeScript("window.scrollTo(0,1000)");
		
		Thread.sleep(1000);
		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[3]/div/div[3]")).click();
		Thread.sleep(0);
		///browse window
		
		JavascriptExecutor jsb1 = (JavascriptExecutor) w;
		jsb1.executeScript("window.scrollTo(0,1000)");
		
		Thread.sleep(1000);
		
		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]/span")).click();
		w.manage().window().maximize();
		JavascriptExecutor jsb2 = (JavascriptExecutor) w;
		jsb2.executeScript("window.scrollTo(0,1000)");
		
		Thread.sleep(1000);
		w.findElement(By.id("tabButton")).click();
		w.manage().window().maximize();
		JavascriptExecutor jsb3 = (JavascriptExecutor) w;
		jsb3.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		
		w.findElement(By.id("windowButton")).click();
		
		JavascriptExecutor jsb4 = (JavascriptExecutor) w;
		jsb4.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		w.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);
			
		
		
		//part2
		
		

	     JavascriptExecutor jsc1 = (JavascriptExecutor) w;
	     jsc1.executeScript("window.scrollTo(0,1000)");
	     Thread.sleep(2000);
	     w.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();
	     Thread.sleep(2000);
	     JavascriptExecutor jsc2 = (JavascriptExecutor) w;
	     jsc2.executeScript("window.scrollTo(0,1000)");
	     Thread.sleep(2000);
         w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]/span")).click();
	
         Thread.sleep(2000);
	     w.findElement(By.id("alertButton")).click();
	     Thread.sleep(2000);
	     Alert A1=w.switchTo().alert();
	     System.out.println(A1.getText());
	     A1.accept();
	
	     //w.findElement(By.id("timerAlertButton")).click();
	     //Thread.sleep(2000);
	    //Alert B=w.switchTo().alert();
	    //System.out.println(A.getText());
	    //B.accept();
	
	    JavascriptExecutor js8 = (JavascriptExecutor) w;
	    js8.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(2000);
	
	    w.findElement(By.id("confirmButton")).click();
	    Alert b=w.switchTo().alert();
	    System.out.println(b.getText());
	    b.accept();
	

	    JavascriptExecutor js9 = (JavascriptExecutor) w;
	    js9.executeScript("window.scrollTo(0,1000)");
	
	    Thread.sleep(2000);
	    w.findElement(By.id("promtButton")).click();
	    Alert c=w.switchTo().alert();
	    System.out.println(c.getText());
	    //c.accept();
	    c.dismiss();
	
	    //Frame
	    JavascriptExecutor jss = (JavascriptExecutor) w;
	    jss.executeScript("window.scrollTo(0,1000)");
	    w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[3]/span")).click();

	     //Nested frame
	    w.manage().window().maximize();
	    JavascriptExecutor jsd2 = (JavascriptExecutor) w;
	    jsd2.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(2000);
	
	    w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[4]/span")).click();
	    Thread.sleep(2000);
	
	   //MODULE DIALOG
	   JavascriptExecutor jr = (JavascriptExecutor) w;
	   jr.executeScript("window.scrollTo(0,1000)");
	   Thread.sleep(2000);
	   w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]/span")).click();
	
	   Thread.sleep(2000);
	   JavascriptExecutor jt = (JavascriptExecutor) w;
	   jt.executeScript("window.scrollTo(0,1000)");
	   w.findElement(By.id("showSmallModal")).click();

	   Thread.sleep(2000);
	   w.findElement(By.id("showLargeModal")).click();

	   Thread.sleep(2000);
	
	
//module4 WIDGET

	  w.get("https://demoqa.com/widgets"); 
	  w.manage().window().maximize();
	    
     JavascriptExecutor jsd1= (JavascriptExecutor) w;
	 jsd1.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
	  
	  //ACCORDIAN
	  
	  w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]/span")).click();
		
     w.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
     
     w.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();
     
     w.findElement(By.xpath("//*[@id=\"section3Heading\"]")).click();
     
     Thread.sleep(1000);
     
     
     
     //DATE PICKER
     
    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]")).click();
     
     w.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).clear();
     
     Select m1=new Select(w.findElement(By.className("react-datepicker__month-select")));
     m1.selectByIndex(6);
    
     Select d1=new Select(w.findElement(By.className("react-datepicker__year-select")));
     d1.selectByValue("1997");
     
     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]")).click();   
     
		
     //DATE AND TIME
     
     w.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).clear();
     Thread.sleep(1000);
     
     w.findElement(By.className("react-datepicker__month-read-view--down-arrow")).click();
     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]")).click();
     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();
     
     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]/a")).click();
     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[11]")).click();
     
     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[64]")).click();
        
		
     JavascriptExecutor jse1= (JavascriptExecutor) w;
	 jse1.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
 
	  Thread.sleep(1000);
	  
	  
	  
	  //progressbar
	  
	  
     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]")).click();
     JavascriptExecutor jse3=(JavascriptExecutor) w;
     jse3.executeScript("window.scrollBy(0,-1000)");
     
     w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
     
     Thread.sleep(1000);
     w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
    
     Thread.sleep(1000);
     w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
     
     Thread.sleep(10000);
     
     w.findElement(By.xpath("//*[@id=\"resetButton\"]")).click();
     
     
     //TABS
     Thread.sleep(1000);
     JavascriptExecutor jse4=(JavascriptExecutor) w;
     jse4.executeScript("window.scrollBy(0,1000)");
    
     
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[6]/span")).click(); 
    w.findElement(By.xpath("//*[@id=\"demo-tab-what\"]")).click();
    
    w.findElement(By.xpath("//*[@id=\"demo-tab-origin\"]")).click();
    w.findElement(By.xpath("//*[@id=\"demo-tab-use\"]")).click();
    
    Thread.sleep(1000);
    
    //MENU
    
    
    JavascriptExecutor jse5=(JavascriptExecutor) w;
    jse5.executeScript("window.scrollBy(0,1000)");
   
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[8]/span")).click();
   
    
    Thread.sleep(1000);
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/a")).click();
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/a")).click();
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/ul/li[2]/a")).click();
    
    
    //select menu
    JavascriptExecutor js6=(JavascriptExecutor) w;
    js6.executeScript("window.scrollBy(0,1000)");
    
    Thread.sleep(1000);
    
    w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[9]/span")).click();
    
    
    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
    w.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]")).click();
    
    
    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")).click();
    w.findElement(By.xpath("//div[contains(text(),'Dr.')]")).click();
    
    
    
    //defect
   // Select a=new Select(w.findElement(By.xpath("//select[@id='oldSelectMenu']")));
   // a.selectByIndex(3);
    
    
   // Select b=new Select(w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")));
   // b.selectByIndex(3);
    
   // Thread.sleep(2000);
    
    
    
    
    
    JavascriptExecutor js7=(JavascriptExecutor) w;
    js7.executeScript("window.scrollBy(0,1000)");
    
   Select c1=new Select(w.findElement(By.id("cars")));
   c1.selectByValue("Audi");
	
   
   //module5 INTERCTION
   
   
        //Open URL
 		w.get("https://demoqa.com/");
 		// Maximize the window
 		w.manage().window().maximize();
 		//Intraction
 		
 		JavascriptExecutor jsf = (JavascriptExecutor) w;
 		jsf.executeScript("window.scrollTo(0,1000)");
 		
 		Thread.sleep(1000);
 		
 		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]")).click();
 		//sortable
 		
 		JavascriptExecutor jsf1 = (JavascriptExecutor) w;
 		Thread.sleep(1000);
 		jsf1.executeScript("window.scrollTo(0,3000)");
 		
 		Thread.sleep(1000);
 		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]")).click();
 		
 		JavascriptExecutor jsf2=(JavascriptExecutor) w;
 		Thread.sleep(2000);
 		w.findElement(By.id("demo-tab-list")).click();
 		
 		JavascriptExecutor jsf3=(JavascriptExecutor) w;
 		Thread.sleep(2000);
 		w.findElement(By.id("demo-tab-grid")).click();
 		
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[1]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[2]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[3]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[4]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[5]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[6]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[7]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[8]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[9]")).click();
 		
 		//selectable
 		JavascriptExecutor jsf4=(JavascriptExecutor) w;
 		Thread.sleep(2000);
 		js4.executeScript("window.scrollTo(0,3000)");
 		
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[2]/span")).click();
 		
 		JavascriptExecutor jsf5=(JavascriptExecutor) w;
 		Thread.sleep(2000);
 		
 		w.findElement(By.id("demo-tab-list")).click();
 		
 		Thread.sleep(2000);
 		
 		w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]")).click();
 		Thread.sleep(2000);
 		w.findElement(By.xpath("//*[@id=\\\"verticalListContainer\\\"]/li[4]")).click();
 		Thread.sleep(2000);

 		w.findElement(By.id("demo-tab-grid")).click();
 		
 		//Resizable
 		
 		JavascriptExecutor jsf6=(JavascriptExecutor) w;
 		
 		jsf6.executeScript("window.scrollTo(0,3000)");
 		Thread.sleep(2000);
 		
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[3]/span")).click();
 		
 		//Droppbale
          JavascriptExecutor jsf7=(JavascriptExecutor) w;
          Thread.sleep(2000);
 		jsf7.executeScript("window.scrollTo(0,3000)");
 		
 		Thread.sleep(2000);
 	    w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[4]/span")).click();
 		//simple
 		
 		w.findElement(By.id("droppableExample-tab-simple")).click();
 		Thread.sleep(2000);
 		//drag
 		WebElement Drag=w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]"));
 		//drop
 		WebElement Drop=w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]"));
 		Thread.sleep(2000);
 		Actions Act=new Actions(w);
 		Act.dragAndDrop(Drag, Drop).build().perform();
 		
 		 JavascriptExecutor jsf9=(JavascriptExecutor) w;
          Thread.sleep(2000);
 		jsf9.executeScript("window.scrollTo(0,3000)");
 		
 	//	Thread.sleep(2000);
 	//	w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[2]")).click();
 	//	Thread.sleep(2000);
 		
 	//	w.findElement(By.id("droppable")).click();
 	//	Thread.sleep(2000);
 		//Drag
 		//WebElement Drag=w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]"));
 		//Drop
 	// WebElement Drop=w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]"));
 	// Thread.sleep(2000);
 	//	Actions a=new Actions(w);
 	//	a.dragAndDrop(Drag, Drop).build().perform();
 	//	Thread.sleep(2000);
 		
 		
 		
 	
 		
 		//draggeble
 		  JavascriptExecutor jsf8=(JavascriptExecutor) w;
 	         Thread.sleep(2000);
 			jsf8.executeScript("window.scrollTo(0,3000)");
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[5]/span")).click();
 		Thread.sleep(2000);
 		
 		
 		//Axis  Restricted
 		JavascriptExecutor js10=(JavascriptExecutor) w;
         Thread.sleep(2000);
 		js10.executeScript("window.scrollTo(0,3000)");
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[2]")).click();
 		Thread.sleep(2000);

 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]")).click();
 		Thread.sleep(2000);

 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]")).click();
 		Thread.sleep(2000);

 		//contain Restricted	
 		JavascriptExecutor js12=(JavascriptExecutor) w;
         Thread.sleep(2000);
 		js12.executeScript("window.scrollTo(0,3000)");
 		
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[3]")).click();
 		
 		
 		w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[4]")).click();
 		Thread.sleep(2000);
 		
 		
 //module6 BOOK STORE APPLICATION
 		//02. Open URL
 				w.get("https://demoqa.com/");
 				
 				// 03. Maximize the window
 			   w.manage().window().maximize();
 				
 				//04.scroll down
 			        JavascriptExecutor jsf11 = (JavascriptExecutor) w;
 				jsf11.executeScript("window.scrollTo(0,1000)");
 				Thread.sleep(1000);
 				
 				//05.Click on book store application field
 				w.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]")).click();
 				Thread.sleep(3000);
 				
 				//06.search in search tab
 				w.findElement(By.id("searchBox")).sendKeys("You Don't Know JS");
 				Thread.sleep(1000);
 				
 				//07.Click on search button
 				w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/*[1]")).click();
 				
 				//Click on book link
 				w.findElement(By.linkText("You Don't Know JS")).click();
 				
 				//Click on login button
 				w.findElement(By.id("login")).click();
 				Thread.sleep(1000);
 				
 				//Click on on new user
 				w.findElement(By.id("newUser")).click();
 				
 				//Enter first name
 				w.findElement(By.id("firstname")).sendKeys("Kriti");
 				
 				//Enter last name
 				w.findElement(By.id("lastname")).sendKeys("sanon");
 				
 				//Enter username
 				w.findElement(By.id("userName")).sendKeys("kriti.sanon@gmail.com");
 				
 				//Enter password
 				w.findElement(By.id("password")).sendKeys("Kriti@123");
 				Thread.sleep(1000);
 				
 				//Scroll down
 				JavascriptExecutor jsf12= (JavascriptExecutor) w;
 				jsf12.executeScript("window.scrollTo(0,1000)");
 				Thread.sleep(1000);
 				
 				//Click on captcha check box
 				//w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")).click();
 				//Click on register
 				//w.findElement(By.id("register")).click();
 				//Click on pop-up, click ok
 				//Alert a = w.switchTo().alert();
 				//a.accept();
 				//Click on go to login button
 				//w.findElement(By.id("gotologin")).click();
 				//Enter user name
 				//w.findElement(By.id("userName")).sendKeys("kriti.sanon@gmail.com");
 				//Enter password
 				//w.findElement(By.id("password")).sendKeys("Kriti@123");
 				//Click on login
 				//w.findElement(By.id("login")).click();
 				//Click on Go to store
 				//w.findElement(By.id("gotoStore")).click();
 				//Click on book
 				//w.findElement(By.linkText("Learning JavaScript Design Patterns")).click();
 				//Click add to record
 				//w.findElement(By.id("addNewRecordButton")).click();
 				//pop-up, click ok
 				//Alert a1 = w.switchTo().alert();
 				//a1.accept();
 				//Back to store
 				//w.findElement(By.id("addNewRecordButton")).click();
 				//Logout
 				//w.findElement(By.id("submit")).click();
 				
 				w.close();
	
	
	
	
		
		}
	
	
	
	

}
