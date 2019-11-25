package com.Dsci.TestScriptsSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.Dsci.ReadPropertyFile.ReadPropertyFile;
import com.Dsci.SuiteBase.GenericLib;
import com.Dsci.SuiteBase.JavascriptHelper;
import com.Dsci.SuiteBase.ProjectspecificFunctions;

public class BOP extends GenericLib{

	public String ExpectedPage1header = "Tell us about your business";
	public String ExpectedPage2header = "Choose Your Policy";
	ReadPropertyFile obj = new ReadPropertyFile();
		 WebDriver driver;

		  @BeforeTest
		  public void setUp() throws Exception {
		         // setup("chrome");
		 		//driver= new GenericLib().driver;
		 	   // System Property for Chrome Driver   
		 	   String path = System.getProperty("user.dir");
		 		System.out.println(path); 
				System.setProperty("webdriver.chrome.driver","com.Dsci.insurancedomain//TestBrowsers//chromedriver 2");
		          
		             // Instantiate a ChromeDriver class.     
		         driver=new ChromeDriver();  
		          
		           // Launch Website 
             driver.get("https://solutions.mckinsey.com/dsci-stg/ef1d3125-0d84-4906-8a92-c2eb40f2c342?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InNoOTgxQHlvcG1haWwuY29tIiwidGVuYW50IjoiZWYxZDMxMjUtMGQ4NC00OTA2LThhOTItYzJlYjQwZjJjMzQyIiwic2NvcGUiOiJNQUdJQ19MSU5LIiwiaWF0IjoxNTc0Mzk5ODM5LCJleHAiOjE1NzY5OTE4Mzl9.xkYcP6WOjPVDz_O6ZU89XXIal2x-g60tyqurKwaXriA");
		         //Maximize the browser  
		          driver.manage().window().maximize();
		          driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		          
		    }
  @Test
  public void BOPTest() throws FileNotFoundException, IOException, InterruptedException 
  
  {
	  
	  String continuebutton= obj.ReadElementObjectRepo("BussinessLookUpContinueButton");
	  	String AppAssistQuestion=obj.ReadElementObjectRepo("AppAssistQuestion1");
	 // String TellAboutBussinessHeader =	obj.ReadElementObjectRepo("TellUsAboutBussinessHeader");
	 String RecommendationContinueButton= obj.ReadElementObjectRepo("PolicyRecommendationContinueButton");
	// String ChooseYourPolicy =obj.ReadElementObjectRepo("ChooseYourPolicyHeader");
	 String UnselectBussinessOwnerPolicy1 =obj.ReadElementObjectRepo("UnselectBussinessOwnerPolicy");
	 String SelectWorkercompensationpolicy1 = obj.ReadElementObjectRepo("SelectWorkercompensationpolicy");
	String PolicyContinueButton= obj.ReadElementObjectRepo("ChooseYourPolicyContinueButton");
		
  Actions action=new Actions(driver);
	Thread.sleep(3000);
	  // Click on continue
try {	
	Thread.sleep(10000);
    WebElement  BussinesslookupContinue =	getElementByXpath(driver,continuebutton);
   action.moveToElement(BussinesslookupContinue).perform();
   BussinesslookupContinue.click();
    //((JavascriptExecutor) driver).executeScript(js, BussinesslookupContinue);
    //JavascriptHelper obj = new JavascriptHelper(driver);
    Thread.sleep(5000);
  
                // Select No for Question 1 in Tell us about your business
                 
                 WebElement  AppAssistQuestion1 =	getElementByXpath(driver,AppAssistQuestion);
                 // Wait for Element to be clickable
                 Thread.sleep(3000);
                 AppAssistQuestion1.click();  
               

             // Click on PolicyRecommendationContinueButton 
                 Thread.sleep(7000);
             WebElement  PolicyRecommendationContinueButton =	getElementByXpath(driver,RecommendationContinueButton);
             PolicyRecommendationContinueButton.click();
             Thread.sleep(6000);
            
      
   // Click on ChooseYourPolicyContinueButton
      WebElement  ChooseYourPolicyContinueButton =	getElementByXpath(driver,PolicyContinueButton);
      ChooseYourPolicyContinueButton.click();
      Thread.sleep(8000);
	                       
	                       String UnderwriteQuestion1= obj.ReadElementObjectRepo("UnderwrittingQuestion1");
	                       String UnderwriteQuestion2= obj.ReadElementObjectRepo("UnderwrittingQuestion2");
	                       String UnderwriteQuestion3= obj.ReadElementObjectRepo("UnderwrittingQuestion3");
	                       String UnderwritQuestion31= obj.ReadElementObjectRepo("UnderwrittingQuestion31");

	                       String UnderwriteQuestion4= obj.ReadElementObjectRepo("UnderwrittingQuestion4");
	                       String UnderwriteQuestion5= obj.ReadElementObjectRepo("UnderwrittingQuestion5");
	                       String UnderwriteQuestion6= obj.ReadElementObjectRepo("UnderwrittingQuestion6");
	                      String Underwriteyears= obj.ReadElementObjectRepo("Underwrittingyears");
	                      String UnderwrittingMore5years=obj.ReadElementObjectRepo("UnderwrittingMorethan5years");
	                      String UnderwriteMore3years=obj.ReadElementObjectRepo("UnderwrittingMorethan3years");

	                     String UnderwrittingContinueBtn= obj.ReadElementObjectRepo("UnderwrittingContinueButton");
	                     String BusinessOwnersQuestion1= obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion1");
	                     String BusinessOwnersQuestion2=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion2");
	                     String BusinessOwnersQuestion3=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion3");
	                     String BusinessOwnersQuestion4=  obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion4");
	                     String BusinessOwnersQuestion5= obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion5");
	                     String BusinessOwnersQuestion6= obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion6");
	                     String BusinessOwnersQuestion7=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion7");
	                     
	                     String BusinessOwnersQuestion71=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion7Select3plus");
	                     String BusinessOwnersQuestion8=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion8");
	                     String BusinessOwnersQuestion81=obj.ReadElementObjectRepo("BusinessOwnersUnderwritingQuestion8Selectdaily");
	                     String BusinessUnderwritinContinue=obj.ReadElementObjectRepo("BusinessOwnersUnderwritinContinue");

  

          Thread.sleep(3000);  
        //underwritting questions level 1
          getElementById(driver,UnderwriteQuestion1).click();
          Thread.sleep(2000);
          //underwritting questions level 2
          getElementById(driver,UnderwriteQuestion2).click();
          Thread.sleep(2000);

          //underwritting questions level 3
          getElementById(driver,UnderwriteQuestion3).click();
          Thread.sleep(2000);
        //underwritting questions level 31
          getElementById(driver,UnderwritQuestion31).click();
          Thread.sleep(2000);

          //underwritting questions level 4
          getElementById(driver,UnderwriteQuestion4).click();
          Thread.sleep(2000);

          //underwritting questions level 5
          action.moveToElement(getElementById(driver,UnderwriteQuestion5)).perform();

          getElementById(driver,UnderwriteQuestion5).click();
          Thread.sleep(2000);

          //underwritting questions level 6
          action.moveToElement(getElementById(driver,UnderwriteQuestion6)).perform();

          getElementById(driver,UnderwriteQuestion6).click();
          Thread.sleep(2000);
          

     // Enter the Longer than 5 years in How many years has the same management been in place?
          JavascriptExecutor js = (JavascriptExecutor) driver;
          //This will scroll the web page till end.		
          js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement years  = getElementByXpath(driver,Underwriteyears);
        action.moveToElement(years);
        years.click();
        WebElement Underwritting5years  = getElementByXpath(driver,UnderwriteMore3years);
        action.moveToElement(Underwritting5years).click().build().perform();

                 Thread.sleep(3000);

              // Click on underwritting continue button
                 WebElement ucontinue =    getElementById(driver,UnderwrittingContinueBtn);
                     action.moveToElement(ucontinue).perform();
                     ucontinue.click();
              Thread.sleep(4000);
 
              // Click on Bussiness underwritting Question 1
              getElementById(driver,BusinessOwnersQuestion1).click();
               System.out.println("Click on No Business Owners Underwriting Question1 ");
               Thread.sleep(2000);
               // Click on Bussiness underwritting Question 2
               getElementById(driver,BusinessOwnersQuestion2).click();
               Thread.sleep(2000);
                System.out.println("Click on No Business Owners Underwriting Question2 ");
                // Click on Bussiness underwritting Question 3
                getElementById(driver,BusinessOwnersQuestion3).click();
                Thread.sleep(2000);
                 System.out.println("Click on No Business Owners Underwriting Question3 ");
                 // Click on Bussiness underwritting Question 4
               //  getElementById(driver,BusinessOwnersQuestion4).click();
                 // System.out.println("Click on No Business Owners Underwriting Question4 ");
                 
                  // Click on Bussiness underwritting Question 5
                  getElementById(driver,BusinessOwnersQuestion5).click();
                  Thread.sleep(2000);
                   System.out.println("Click on No Business Owners Underwriting Question5 ");
                   // Click on Bussiness underwritting Question 6
                   getElementById(driver,BusinessOwnersQuestion6).click();
                   Thread.sleep(2000);
                    System.out.println("Click on No BusinessOwnersUnderwritingQuestion6 ");
                    
                    // Click on Bussiness underwritting Question 7
                    WebElement BusinessOwnersUnderwritingQuestion7 =    getElementByXpath(driver,BusinessOwnersQuestion7);
                    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

                    action.moveToElement(BusinessOwnersUnderwritingQuestion7);
                    BusinessOwnersUnderwritingQuestion7.click();                   
                    System.out.println("Click on Bussiness underwritting Question 7");
                    // Select the 3+times a day option in Bussiness underwritting Question 7
                    WebElement BusinessOwnersUnderwritingQuestion71= getElementByXpath(driver,BusinessOwnersQuestion71);                  
                    action.moveToElement(BusinessOwnersUnderwritingQuestion71).click().build().perform();
                    System.out.println("Select the 3+times a day option in Bussiness underwritting Question 7 ");
                    Thread.sleep(3000);
                    
                    // Click on Bussiness underwritting Question 8
                    WebElement BusinessOwnersUnderwritingQuestion8 =  getElementByXpath(driver,BusinessOwnersQuestion8);
                    action.moveToElement(BusinessOwnersUnderwritingQuestion8);
                    BusinessOwnersUnderwritingQuestion8.click();
                    System.out.println("Click on Bussiness underwritting Question 8");
                    
                    // Select daily for Bussiness underwritting Question 8
                    WebElement BusinessOwnersUnderwritingQuestion81 =  getElementByXpath(driver,BusinessOwnersQuestion81);
                    action.moveToElement(BusinessOwnersUnderwritingQuestion81).click().build().perform();

                    Thread.sleep(3000);
                    System.out.println("Select the daily for Bussiness underwritting Question 8 ");
                    
                 
                    // Click on Continue button in Bussiness owners underwritting page
                 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                 Thread.sleep(2000);
                    getElementById(driver,BusinessUnderwritinContinue).click();
                    System.out.println("Click on BusinessOwnersUnderwritinContinue ");
                    Thread.sleep(3000);
                    String BuildAnnualsale= obj.ReadElementObjectRepo("BopLoc&BuildingsAnnualsale");
                    String BopLocBuildingsQuestion1=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion1");
                    String BopLocBuildingsQuestion2=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion2");
                   String BopLocBuildingsQuestion3=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion3");
                   String LocContinuebutton=obj.ReadElementObjectRepo("LocationsContinuebutton");
                   String BuildingDescripText=obj.ReadElementObjectRepo("BuildingDescriptionText");
                   String BuildingValueequipment=obj.ReadElementObjectRepo("BuildingValueofequipment");
                   String BopLocBuildingsQuestion4=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion4");
                   String BopLocBuildingsQuestion4sel=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion4select");
                   String BopYearBuil= obj.ReadElementObjectRepo("BopYearBuilt");
                   String BopLocBuildingQuestion5=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion5");
                   String BopLocBuildingQuestion6=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion6");
                   String BopLocBuildingQuestion7=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion7");
                   String BopLocBuildingQuestion8=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion8");
                   String BopLocBuildingQuestion9=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion9");
                   String BopLocBuildingQuestion91=obj.ReadElementObjectRepo("BopLoc&BuildingsQuestion91");
                   String buildingsContinue=obj.ReadElementObjectRepo("BopLoc&BuildingsContinue");
                   String BuildingsFinalContinue=obj.ReadElementObjectRepo("BopLoc&BuildingsFinalContinue");


                    // User navigated to Building & location page
                    WebElement BuildingsAnnualsale =    getElementByXpath(driver,BuildAnnualsale);
                    action.moveToElement(BuildingsAnnualsale).perform();
                    action.click().perform();
                    BuildingsAnnualsale.sendKeys("100000");
                    System.out.println("Enter 1000000 in annual sales at location");
                    Thread.sleep(3000);
                    // Select no for Has your business been at this location for at least 5 years?
                    getElementById(driver,BopLocBuildingsQuestion1).click();
                    System.out.println("Click on no for Has your business been at this location for at least 5 years?");
                    Thread.sleep(3000);
                    // Select No for Is this location located in an indoor mall?
                    getElementById(driver,BopLocBuildingsQuestion2).click();
                    System.out.println("Click on no for Is this location located in an indoor mall?");
                    Thread.sleep(3000);
                    // Select No for Are you located in a building with a restaurant?
                    getElementById(driver,BopLocBuildingsQuestion3).click();
                    System.out.println("Click on no for Are you located in a ubuilding with a restaurant?");
                    Thread.sleep(3000);
                    // Click on continue button in buildings section
                    WebElement LocContinuebtn =getElementByXpath(driver,LocContinuebutton);
                    action.moveToElement(LocContinuebtn).click().build().perform();
                    Thread.sleep(3000);
                    System.out.println("Click on continue button in buildings section");
                    
                    // Enter Building description
                    WebElement BuildingDescripTxt=getElementByXpath(driver,BuildingDescripText);
                    action.moveToElement(BuildingDescripTxt).perform();
                    action.click().perform();
                    BuildingDescripTxt.clear();
                    BuildingDescripTxt.sendKeys("coffee shop");
                    Thread.sleep(3000);
                    System.out.println("Enter  Building description");
                    
                    // Enter the Value of business equipment (best estimate)
                    WebElement BuildingValequipment =   getElementByXpath(driver,BuildingValueequipment);
                    action.moveToElement(BuildingValequipment).perform();
                    action.click().perform();
                    BuildingValequipment.sendKeys("100000");                    
                    System.out.println("Enter the Value of business equipment");
                    Thread.sleep(3000);
                    // Select construction type as joisted masonry
                  WebElement BopLocBuildingQuestion4=  getElementByXpath(driver,BopLocBuildingsQuestion4);
                    action.moveToElement(BopLocBuildingQuestion4);
                    BopLocBuildingQuestion4.click();
                    WebElement BopLocBuildingsQuestion4s=getElementByXpath(driver,BopLocBuildingsQuestion4sel);
                    
                    action.moveToElement(BopLocBuildingsQuestion4s).click().build().perform();

                    System.out.println("Select construction type as joisted masonry");
                    Thread.sleep(3000);
                    // enter the year built
                    WebElement BopYearBui=getElementByXpath(driver,BopYearBuil);
                    action.moveToElement(BopYearBui).perform();
                    action.click().perform();
                    BopYearBui.clear();
                    BopYearBui.sendKeys("2016");  
                    System.out.println("enter the year built as 2016");
                    Thread.sleep(3000);
                    // select no for Is this building owned by your business?
                    WebElement BopLocBuildingsQuestion5 =    getElementById(driver,BopLocBuildingQuestion5);
                    action.moveToElement(BopLocBuildingsQuestion5).perform();
                    BopLocBuildingsQuestion5.click();
                    System.out.println("select no for Is this building owned by your business?");
                    Thread.sleep(3000);
                    
                    // select no for Do you want coverage in the event your coolers break down and your product is spoiled?
                    WebElement BopLocBuildingsQuestion6 =    getElementById(driver,BopLocBuildingQuestion6);
                    action.moveToElement(BopLocBuildingsQuestion6).perform();
                    BopLocBuildingsQuestion6.click();
                    Thread.sleep(3000);
                    System.out.println("select no for Do you want coverage in the event your coolers break down and your product is spoiled?");
                    Thread.sleep(2000);
                    // Select No for Do you occupy the entire building?
                    WebElement BopLocBuildingsQuestion7 =    getElementById(driver,BopLocBuildingQuestion7);
                    action.moveToElement(BopLocBuildingsQuestion7).perform();
                    BopLocBuildingsQuestion7.click();
                    System.out.println("Select No for Do you occupy the entire building?");
                    Thread.sleep(2000);
                    // Select yes for Do you have a fire suppression sprinkler system that covers at least 50% of your space?
                    WebElement BopLocBuildingsQuestion8 =    getElementById(driver,BopLocBuildingQuestion8);
                    action.moveToElement(BopLocBuildingsQuestion8).perform();
                    BopLocBuildingsQuestion8.click();
                    System.out.println("Select yes for Do you have a fire suppression sprinkler system that covers at least 50% of your space?");
                    Thread.sleep(2000);
                    //select yes for Is there an alarm system?
                    WebElement BopLocBuildingsQuestion9 =    getElementById(driver,BopLocBuildingQuestion9);
                    action.moveToElement(BopLocBuildingsQuestion9).perform();
                    BopLocBuildingsQuestion9.click();
                    System.out.println("Select yes for Is there an alarm system?");
                    Thread.sleep(2000);
                    //Select No for Does the alarm system ring at an offsite location that is monitored by a 3rd party?
                    WebElement BopLocBuildingsQuestion91 =    getElementById(driver,BopLocBuildingQuestion91);
                    action.moveToElement(BopLocBuildingsQuestion91).perform();
                    BopLocBuildingsQuestion91.click();
                    System.out.println("Select No for Does the alarm system ring at an offsite location that is monitored by a 3rd party?");
                    Thread.sleep(2000);
                    // click on Building continue button
                    getElementById(driver,buildingsContinue).click();;
                    System.out.println("click on Building continue button");
                    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                    Thread.sleep(2000);
                    
                    // Click on location & building continue button
                    getElementByXpath(driver,BuildingsFinalContinue).click();
                    System.out.println("Click on location & building continue button");
                    Thread.sleep(4000);
                    // Call common function for completing the acknowledgment
                   ProjectspecificFunctions obj = new ProjectspecificFunctions();
                   obj.additionalInterstTillPayment(driver);  
                   
                   // Call the payment function
                 //  ProjectspecificFunctions ref = new ProjectspecificFunctions();
                   obj.Paymentfunction("ryan", "4111111111111111", "80204", driver);
                   System.out.println("Payment of policy done successfully "); 
}

catch(Exception e)      
{
	  e.printStackTrace();
	   System.out.println("Exception is catched");
}
	
                
         
	  
  }
  
  
  
  

  @AfterTest
  public void afterTest() {
	  
	  // close the browser
      driver.quit();
  }

}
