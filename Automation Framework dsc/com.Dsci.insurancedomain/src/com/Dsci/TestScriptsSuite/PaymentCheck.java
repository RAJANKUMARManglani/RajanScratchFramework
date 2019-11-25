package com.Dsci.TestScriptsSuite;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.Dsci.ReadPropertyFile.ReadPropertyFile;
import com.Dsci.SuiteBase.GenericLib;
import com.Dsci.SuiteBase.ProjectspecificFunctions;

import org.testng.annotations.BeforeTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class PaymentCheck extends GenericLib{
	public String ExpectedPage1header = "Tell us about your business";
	public String ExpectedPage2header = "Choose Your Policy";
	public String ExpectedPage3header = "Policy Level";
	public String ExpectedPage4header = "Company Officers" ;
	public String ExpectedPage5header = "Coverages & Pricing" ;
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
     //driver.get("https://dsc.mvp01.dev.nvt.mckinsey.cloud/dsci/ef1d3125-0d84-4906-8a92-c2eb40f2c342?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhamFubTIuNzExQGdtYWlsLmNvbSIsInRlbmFudCI6ImVmMWQzMTI1LTBkODQtNDkwNi04YTkyLWMyZWI0MGYyYzM0MiIsInNjb3BlIjoiTUFHSUNfTElOSyIsImlhdCI6MTU3MDc4MTg2MCwiZXhwIjoxNTcxMDQxMDYwfQ.6bt905nwpZZe4FwuS2Q5tACpi9SV5n1kwUQV4iLROPs");
	  driver.get("https://solutions.mckinsey.com/dsci-stg/ef1d3125-0d84-4906-8a92-c2eb40f2c342?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InNoOThAeW9wbWFpbC5jb20iLCJ0ZW5hbnQiOiJlZjFkMzEyNS0wZDg0LTQ5MDYtOGE5Mi1jMmViNDBmMmMzNDIiLCJzY29wZSI6Ik1BR0lDX0xJTksiLCJpYXQiOjE1NzQzOTk2NDIsImV4cCI6MTU3Njk5MTY0Mn0.OGhpnwL3BhThr6IDM9M-EDqoJkceA9feSrLDtCU6epA");
     
	  //Maximize the browser  
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         
   }

	@Test
	  public void PaymentCheckTest() throws FileNotFoundException, IOException, InterruptedException 
	{
	  	 String continuebutton= obj.ReadElementObjectRepo("BussinessLookUpContinueButton");
	  	String AppAssistQuestion=obj.ReadElementObjectRepo("AppAssistQuestion1");
	 // String TellAboutBussinessHeader =	obj.ReadElementObjectRepo("TellUsAboutBussinessHeader");
	 String RecommendationContinueButton= obj.ReadElementObjectRepo("PolicyRecommendationContinueButton");
	// String ChooseYourPolicy =obj.ReadElementObjectRepo("ChooseYourPolicyHeader");
	 String UnselectBussinessOwnerPolicy1 =obj.ReadElementObjectRepo("UnselectBussinessOwnerPolicy");
	 String SelectWorkercompensationpolicy1 = obj.ReadElementObjectRepo("SelectWorkercompensationpolicy");
	String PolicyContinueButton= obj.ReadElementObjectRepo("ChooseYourPolicyContinueButton");
	try {	
    Actions action=new Actions(driver);

		Thread.sleep(10000);
		  // Click on continue
		
	     /* WebElement  BussinesslookupContinue =	getElementByXpath(driver,continuebutton);
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
                  
                   // Click on Business Owners Policy to unselect
                   WebElement UnselectBussinessOwnerPolicy   =	getElementByXpath(driver,UnselectBussinessOwnerPolicy1);
                   UnselectBussinessOwnerPolicy.click();

                   Thread.sleep(6000);
                   // Click on workerCompensation to select
                   WebElement SelectWorkercompensationpolicy =getElementByXpath(driver,SelectWorkercompensationpolicy1);
                   SelectWorkercompensationpolicy.click();
                   Thread.sleep(6000);
                   // Click on ChooseYourPolicyContinueButton
                   WebElement  ChooseYourPolicyContinueButton =	getElementByXpath(driver,PolicyContinueButton);
                   ChooseYourPolicyContinueButton.click();*/
                   
                   Thread.sleep(6000);
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
                String PolicyLeveAns1=   obj.ReadElementObjectRepo("PolicyLevelAns1");
                String PolicyLeveAns2=   obj.ReadElementObjectRepo("PolicyLevelAns2");
                String PolicyLeveAns21=   obj.ReadElementObjectRepo("PolicyLevelAns21");
                String PolicyLeveAns22=    obj.ReadElementObjectRepo("PolicyLevelAns22");
                String PolicyLeveAns3=   obj.ReadElementObjectRepo("PolicyLevelAns3");
                String PolicyLeveAns4=   obj.ReadElementObjectRepo("PolicyLevelAns4");
                String PolicyLeveAns41=   obj.ReadElementObjectRepo("PolicyLevelAns41");

                String PolicyLeveAns5=   obj.ReadElementObjectRepo("PolicyLevelAns5");
                String PolicyLeveAns51=   obj.ReadElementObjectRepo("PolicyLevelAns51");
                String  PolicyLeveContinueButton= obj.ReadElementObjectRepo("PolicyLevelContinueButton");
               // String CompanyofficeHeader= obj.ReadElementObjectRepo("CompanyofficerHeader");
                String  OfficerNamText= obj.ReadElementObjectRepo("OfficerNameText");
                String  OfficeText= obj.ReadElementObjectRepo("officerText");

                String OfficerCovereAns =obj.ReadElementObjectRepo("OfficerCoveredAns");
                String CompanyOfficContinuebutton=obj.ReadElementObjectRepo("CompanyOfficerContinuebutton");
                String MonthlyPayrotextbox=obj.ReadElementObjectRepo("MonthlyPayrolltextbox");
                String NofProdEmployeeText=obj.ReadElementObjectRepo("NoofProdEmployeeText");
                String CompanyPayrolContinuebutton=obj.ReadElementObjectRepo("CompanyPayrollContinuebutton");
                String clericalPayrolTextbox=obj.ReadElementObjectRepo("clericalPayrollTextbox");
                String NfClearicalEmployeeText=obj.ReadElementObjectRepo("NoofClearicalEmployeeText");
               String AdditionalIntersQuestion= obj.ReadElementObjectRepo("AdditionalInterstQuestion");
              
/*//underwritting questions level 1
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
Thread.sleep(3000);
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
action.moveToElement(Underwritting5years).click().build().perform();*/

        /* Thread.sleep(3000);
// Click on underwritting continue button
     WebElement ucontinue =    getElementById(driver,UnderwrittingContinueBtn);
         action.moveToElement(ucontinue).perform();
         ucontinue.click();
System.out.println("Click on underwritting continue button");
Thread.sleep(2000);
// Enter Production payroll
WebElement  MonthlyPayrolltextbox =	getElementByXpath(driver,MonthlyPayrotextbox);
action.moveToElement(MonthlyPayrolltextbox).perform();
action.click().perform();
MonthlyPayrolltextbox.clear();
MonthlyPayrolltextbox.sendKeys("100000");
System.out.println("Enter Production payroll");
Thread.sleep(3000);
// Enter the No of production employees
WebElement  NoofProdEmployeeText =	getElementByXpath(driver,NofProdEmployeeText);
action.moveToElement(NoofProdEmployeeText).perform();
action.click().perform();
NoofProdEmployeeText.clear();
NoofProdEmployeeText.sendKeys("2");
Thread.sleep(3000);
System.out.println("Enter No of production employees");
                   
                   // Click on Policy level question 1
                   WebElement PolicyLevelAns1 =getElementByXpath(driver,PolicyLeveAns1);
                   PolicyLevelAns1.click();
                   System.out.println("Selected no for Do you have employees (such as a cashier) who are dedictated to selling your product in a retail portion of your establishment (or a separate storefront you own) and do not work at all in your production area?");
                   Thread.sleep(3000);
                   // Click on Policy level question 2
                   WebElement PolicyLevelAns2 =getElementByXpath(driver,PolicyLeveAns2);
                   PolicyLevelAns2.click();
                   System.out.println("Selected Yes for Do you employ salespeople to visit potential customers? ");
                   Thread.sleep(3000);
                   // Enter Number of traveling salespeople 
                   WebElement  PolicyLevelAns21 =	getElementByXpath(driver,PolicyLeveAns21);
                   PolicyLevelAns21.clear();
                   PolicyLevelAns21.sendKeys("2");
                   System.out.println("Enter 2 Number of traveling salespeople ");
                   Thread.sleep(3000);
                   //Enter Salespeople Payroll
                   WebElement  PolicyLevelAns22 =	getElementByXpath(driver,PolicyLeveAns22);
                   action.moveToElement(PolicyLevelAns22).perform();
                   Thread.sleep(3000);
                   PolicyLevelAns22.sendKeys("10000");
                   System.out.println("Enter 10000 Salespeople Payroll ");

                   // Answer for quest Is your annual employee turnover less than 30%?
                   WebElement PolicyLevelAns3 =getElementByXpath(driver,PolicyLeveAns3);
                   action.moveToElement(PolicyLevelAns3).perform();

                   PolicyLevelAns3.click();
                   System.out.println("Selected no for Is your annual employee turnover less than 30%? ");
                   Thread.sleep(3000);
                   //Select no for Do you employ clerical employees such as secretaries that work solely in an office?help_outline

                   WebElement PolicyLevelAns41 =getElementByXpath(driver,PolicyLeveAns41);
                   action.moveToElement(PolicyLevelAns41).perform();

                   PolicyLevelAns41.click();
                   System.out.println("Selected no for Do you provide your employees with health benefits? ");
                   Thread.sleep(3000);
                   
                   // Answer for question Do you provide your employees with health benefits?
                   WebElement PolicyLevelAns4 =getElementByXpath(driver,PolicyLeveAns4);
                   action.moveToElement(PolicyLevelAns4).perform();

                   PolicyLevelAns4.click();
                   System.out.println("Selected no for Do you provide your employees with health benefits? ");
                   Thread.sleep(3000);
                   // Answer for question Do you have an experience modification factor, published by a Workers' Compensation rating bureau (NCCI, WCIRB, etc)?
                   WebElement  PolicyLevelAns5 =	getElementByXpath(driver,PolicyLeveAns5);
                   action.moveToElement(PolicyLevelAns5).perform();

                   PolicyLevelAns5.click();
                   System.out.println("Selected Yes for Do you have an experience modification factor, published by a Workers' Compensation rating bureau (NCCI, WCIRB, etc)?"); 
                   Thread.sleep(3000);
                    // Enter the Experience Mod
                   WebElement  PolicyLevelAns51 =	getElementByXpath(driver,PolicyLeveAns51);
                   action.moveToElement(PolicyLevelAns51).perform();
                   PolicyLevelAns51.clear();
                   PolicyLevelAns51.sendKeys("0.95");
                   System.out.println("Enter 0.95 in Experience Mod ");
                   
                  // Click on PolicyLevelContinueButton
                   WebElement PolicyLevelContinueButton =getElementById(driver,PolicyLeveContinueButton);
                   PolicyLevelContinueButton.click();
                   
                   Thread.sleep(3000);
                   
                    // Enter company officer name
                   WebElement  OfficerNameText =	getElementByXpath(driver,OfficerNamText);
                   OfficerNameText.clear();
                   OfficerNameText.sendKeys("first");
                   System.out.println("Enter first in company officer name ");
                   
                   // Enter the OfficeText
                   WebElement  OfficeText1 =	getElementByXpath(driver,OfficeText);
                   OfficeText1.clear();
                   OfficeText1.sendKeys("first");
                   System.out.println("Enter first in company officer name ");
                   Thread.sleep(2000);
                   // Select No for covered radio button
                   WebElement  OfficerCoveredAns =	getElementById(driver,OfficerCovereAns);
                   action.moveToElement(OfficerCoveredAns).perform();

                   OfficerCoveredAns.click();  
                   System.out.println("Selected Yes for covered radio button ");    
                   
                   // Click on Continue button
                   getElementById(driver,CompanyOfficContinuebutton).click();
                   System.out.println("Click on CompanyOfficerContinuebutton ");    
                   Thread.sleep(3000);*/
                   /*// Enter Production payroll
                   WebElement  MonthlyPayrolltextbox1 =	getElementById(driver,MonthlyPayrotextbox);
                   MonthlyPayrolltextbox1.clear();
                   MonthlyPayrolltextbox1.sendKeys("100000");
                   System.out.println("Enter Production payroll");
                   Thread.sleep(2000);
                   // Enter the No of production employees
                   WebElement  NoofProdEmployeeText1 =	getElementById(driver,NofProdEmployeeText);
                   NoofProdEmployeeText1.clear();
                   NoofProdEmployeeText1.sendKeys("2");
                   System.out.println("Enter No of production employees");
                   Thread.sleep(2000);
                   // Enter clerical Payroll 
                   WebElement  clericalPayrollTextbox =	getElementById(driver,clericalPayrolTextbox);
                   clericalPayrollTextbox.clear();
                   clericalPayrollTextbox.sendKeys("25000");
                   System.out.println("Enter clericalPayroll");
                   Thread.sleep(2000);
                   // Enter the No of clerical employees
                   WebElement  NoofClearicalEmployeeText =	getElementById(driver,NfClearicalEmployeeText);
                   NoofClearicalEmployeeText.clear();
                   NoofClearicalEmployeeText.sendKeys("2");
                   System.out.println("Enter  No of Clearical Employee");*/
                   String AdditionContinuebutton= obj.ReadElementObjectRepo("AdditionalContinuebutton");
                  String WorkercompensationHeade = obj.ReadElementObjectRepo("WorkercompensationHeader");
                 String PricefPolicy = obj.ReadElementObjectRepo("PriceofPolicy");
                String PricingpagContinue= obj.ReadElementObjectRepo("PricingpageContinue");
                String ChoosePaymentpla=obj.ReadElementObjectRepo("ChoosePaymentplan");
               String PaymentdetailsContinueButto= obj.ReadElementObjectRepo("PaymentdetailsContinueButton");
               String ReviewPageDisclosurenam=obj.ReadElementObjectRepo("ReviewPageDisclosurename");
               String AcknowledgeCheckbo=obj.ReadElementObjectRepo("AcknowledgeCheckbox");
               String AcknowledgeContinueButto=  obj.ReadElementObjectRepo("AcknowledgeContinueButton");
              String PolicyNameAsser= obj.ReadElementObjectRepo("PolicyNameAssert");
              String FinalPaymentAssertAmoun= obj.ReadElementObjectRepo("FinalPaymentAssertAmount");
                   // Click on CompanyPayrollContinuebutton   
                 //  action.moveToElement(getElementById(driver,CompanyPayrolContinuebutton)).perform();

                 //  getElementById(driver,CompanyPayrolContinuebutton).click();
                //   System.out.println("click on Company Payroll Continue button");
               //    Thread.sleep(3000); 
               
                   Thread.sleep(20000);
                   
                   
                   // Click on Pricingpage continue button
                   action.moveToElement( getElementById(driver,PricingpagContinue)).perform();
                   Thread.sleep(3000);
                   getElementById(driver,PricingpagContinue).click();
                   System.out.println("Click on PricingpageContinue button");    
                   Thread.sleep(3000);
                   // Click on Pay in full payment plan
                   getElementByXpath(driver,ChoosePaymentpla).click();
                   System.out.println("click on ChoosePaymentplan "); 
                   Thread.sleep(3000);
                   // Click on Paymentdetails Continue Button
                   action.moveToElement( getElementById(driver,PaymentdetailsContinueButto)).perform();

                   getElementById(driver,PaymentdetailsContinueButto).click();
                   System.out.println("click on Payment details Continue Button ");   
                   Thread.sleep(2000);
                   
                   // Navigate to review page
                   WebElement  ReviewPageDisclosurename =	getElementByXpath(driver,ReviewPageDisclosurenam);
                   action.moveToElement(ReviewPageDisclosurename).perform();
                   ReviewPageDisclosurename.clear();
                   ReviewPageDisclosurename.sendKeys("jack");
                   
                   // Select the acknowledge checkmark in checkmarkpage
                  //getElementByXpath(driver,AcknowledgeCheckbo).click();
                   System.out.println("Select acknowledge checkmark in checkmarkpage  "); 
                   Thread.sleep(3000);
                   // Click on AcknowledgeContinueButton
                   action.moveToElement( getElementById(driver,AcknowledgeContinueButto)).perform();

                   getElementById(driver,AcknowledgeContinueButto).click();
                   System.out.println("Click on Acknowledge Continue Button "); 
                   Thread.sleep(5000); 
                   
                   
                   // Call the payment function
                   ProjectspecificFunctions ref = new ProjectspecificFunctions();
                   ref.Paymentfunction("ryan", "4111111111111111", "80204", driver);
                   System.out.println("Payment of policy done successfully "); 

	}               
       catch(Exception e)      
	   {
    	  e.printStackTrace();
    	   System.out.println("Exception is catched");
       }
		
	}
  
  
  @AfterTest
  public void teardown() {
	  
	  // close the browser
      driver.quit();

  }

} 
