package com.Dsci.SuiteBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.Dsci.SuiteBase.GenericLib;
import com.Dsci.ReadPropertyFile.ReadPropertyFile;

public class ProjectspecificFunctions extends GenericLib
{
	public String ExpectedPage1header = "Business Lookup";
	public String ExpectedPage5header = "Coverages & Pricing" ;
	ReadPropertyFile obj = new ReadPropertyFile();

	/*public void Bussinesslookup() throws FileNotFoundException, IOException 
	{
		  setImplicitWait(10,TimeUnit.SECONDS);
		  // Verify the header
		  WebElement  BussinessLookUpPageHeader =	getElementByXpath(driver,obj.ReadElementObjectRepo("BussinessLookUpPageHeader"));
		  String actualheader =getElementText(BussinessLookUpPageHeader);
		  Assert.assertEquals(actualheader,ExpectedPage1header ,"Header of page is not correct");
		  
		  // Enter the name of bussiness in search
		  WebElement  SearchInput =	getElementByXpath(driver,obj.ReadElementObjectRepo("SearchInput"));
		  SearchInput.sendKeys("Gateaux, Speer");
		  
		  WebElement  ListSearchBoxSelect =	getElementByXpath(driver,obj.ReadElementObjectRepo("ListSearchBoxSelect"));

		  Actions act = new Actions(driver);
		  act.moveToElement(ListSearchBoxSelect).click().build().perform();
		  
		  // Wait for Company details widget to load
		  WebElement  AppassistContactDetailsWidget =	getElementByXpath(driver,obj.ReadElementObjectRepo("AppassistContactDetailsWidget"));

		  WaitForElementVisibleWithPollingTime(AppassistContactDetailsWidget,20,5);
		  AppassistContactDetailsWidget.click();
		  
		  // Click on tax widget
		  WebElement  AppassistTaxwidget =	getElementByXpath(driver,obj.ReadElementObjectRepo("AppassistTaxwidget"));
		  AppassistTaxwidget.click();
		  
		  // Implicit Wait for loader
		  setImplicitWait(10,TimeUnit.SECONDS);
		  //Enter suite 
          WebElement  suite =	getElementByXpath(driver,obj.ReadElementObjectRepo("SuiteFloorTextBox"));
          js1.scrollToElement(suite);

          suite.clear();
          suite.sendKeys("2nd Floor");

           // Enter Year started
          WebElement  Yearstarted =	getElementByXpath(driver,obj.ReadElementObjectRepo("YearstartedTextbox"));
          js1.scrollToElement(Yearstarted);

          Yearstarted.clear();
          Yearstarted.sendKeys("2013");  
          
            // Enter Your First name
          WebElement  FirstName =	getElementByXpath(driver,obj.ReadElementObjectRepo("YourFirstNameText"));
          js1.scrollToElement(FirstName);
          FirstName.clear();
          FirstName.sendKeys("John");  
           // Enter Your Last name      
          WebElement  LastName =	getElementByXpath(driver,obj.ReadElementObjectRepo("YourLastNameText"));
          LastName.clear();
          LastName.sendKeys("Kimo"); 
           // Enter No of employees
          WebElement  NoOfEmployees =	getElementByXpath(driver,obj.ReadElementObjectRepo("NoofEmployeesText"));
          NoOfEmployees.clear();
          NoOfEmployees.sendKeys("15"); 
          
           // Enter the Partnership
          WebElement  Legalentity =	getElementByXpath(driver,obj.ReadElementObjectRepo("LegalEntityauto"));
          Legalentity.clear();
          Legalentity.sendKeys("Partnership");  
          //Select legal entity
          WebElement  SelectPartnership =	getElementByXpath(driver,obj.ReadElementObjectRepo("LegalEntityTypeSelected"));
          SelectPartnership.click();
          // Click on continue
          WebElement  BussinesslookupContinue =	getElementByXpath(driver,obj.ReadElementObjectRepo("BussinessLookUpContinueButton"));
          js1.scrollToElement(BussinesslookupContinue);

          BussinesslookupContinue.click();
		  setImplicitWait(20,TimeUnit.SECONDS);
		 		  
		  
	}*/

	public void additionalInterstTillPayment(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException {
		String AdditionalIntersQuestion= obj.ReadElementObjectRepo("AdditionalInterstQuestion");
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
    Actions action = new Actions(driver);
 
    // Select No for Additional Interest question
    getElementById(driver,AdditionalIntersQuestion).click();
    System.out.println("Select No for AdditionalInterstQuestion ");    
    Thread.sleep(2000);
    // Click on Continue on Additional Interset page
    getElementById(driver,AdditionContinuebutton).click();
    System.out.println("click on Additional Continue button ");   
    
    		Thread.sleep(60000);
    
             
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
    getElementByXpath(driver,AcknowledgeCheckbo).click();
    System.out.println("Select acknowledge checkmark in checkmarkpage  "); 
    Thread.sleep(3000);
    // Click on AcknowledgeContinueButton
    action.moveToElement( getElementById(driver,AcknowledgeContinueButto)).perform();

    getElementById(driver,AcknowledgeContinueButto).click();
    System.out.println("Click on Acknowledge Continue Button "); 
    Thread.sleep(5000);
	}   
   
	
	public  void  Paymentfunction(String cardholdername,String cardnumber,String Billingzip,WebDriver driver) throws IOException,InterruptedException {
		
		 String CheckoutButton= obj.ReadElementObjectRepo("StartCheckoutPaymentButton");
         String IframeSwitch= obj.ReadElementObjectRepo("IframeTitlePayment");
         String NameofConsumer= obj.ReadElementObjectRepo("NameonCardInput");
         String cardNumber= obj.ReadElementObjectRepo("CardNNumberInput");
         String ExpiryMonth= obj.ReadElementObjectRepo("CardExpiryMonth");
         String ExpiryYears= obj.ReadElementObjectRepo("CardExpiryYears");
         String zipcodeBillingPayment= obj.ReadElementObjectRepo("BillingZipcode");
         String PaymentCont= obj.ReadElementObjectRepo("ContiunueButtonPayment");
         String PaymentConfirmButton= obj.ReadElementObjectRepo("SubmitConfirmPaymentButton");
         String PopupFrame= obj.ReadElementObjectRepo("PaymentPopupFrame");
         String PayNowbtn= obj.ReadElementObjectRepo("PayNowButtonPaymentpage");
         Actions action = new Actions(driver);
         String PaymentComplete= obj.ReadElementObjectRepo("PaymentCompleteTitle"); 
         Thread.sleep(60000);
		 // Click on StartCheckoutPage
        WebElement driverframe= getElementByXpath(driver,IframeSwitch);
         driver.switchTo().frame(driverframe);
         Thread.sleep(3000);
         getElementByXpath(driver,CheckoutButton).click();
         Thread.sleep(10000);
         System.out.println("Click on Start checkout in payment page "); 
                     
         driver.switchTo().defaultContent();
         JavascriptExecutor js = ((JavascriptExecutor) driver);
         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
         
         driver.switchTo().frame(driverframe);
         // Switch to another frame PaymentPopupFrame
         WebElement driverframe2= getElementByXpath(driver,PopupFrame);
      
         driver.switchTo().frame(driverframe2);
         // Enter NameofConsumer
         Thread.sleep(3000);
        WebElement nameConsumer= getElementByXpath(driver,NameofConsumer);
        action.moveToElement(nameConsumer).perform();
        action.click().perform();
        nameConsumer.sendKeys(cardholdername);
        System.out.println("Enter cardholder name"); 

        // Enter card number in payment info                              
        WebElement cardno= getElementByXpath(driver,cardNumber);
        action.moveToElement(cardno).perform();
        action.click().perform();
        cardno.sendKeys(cardnumber);
        System.out.println("Enter card number"); 
        Thread.sleep(3000);
        // Select the Expiration month & year of Cards
         
      WebElement monthexpiry =  getElementByXpath(driver,ExpiryMonth);
      Select month = new Select(monthexpiry);
      month.selectByVisibleText("January");
      Thread.sleep(3000);
      System.out.println("Enter Expiration month of cardnumber"); 

      WebElement yearexpiry =  getElementByXpath(driver,ExpiryYears);
      Select year = new Select(yearexpiry);
      year.selectByVisibleText("2022");
      Thread.sleep(3000);
      System.out.println("Enter Expiration month of cardnumber"); 
      
      // Enter the zipcode
      WebElement zipcode= getElementByXpath(driver,zipcodeBillingPayment);
      action.moveToElement(zipcode).perform();
      action.click().perform();
      zipcode.sendKeys(Billingzip);
      System.out.println("Enter billing zipcode"); 
      Thread.sleep(3000);
   
      // Click on Continue button in payment info pop up 
      WebElement ContinuePaymentbut= getElementByXpath(driver,PaymentCont);
      ContinuePaymentbut.click();
      //action.moveToElement(ContinuePaymentbut).perform();
      //action.click();
      Thread.sleep(3000);
      System.out.println("Click on Continue button in payment info pop up "); 


      // Click on Final confirm button
      WebElement PaymentConfirm= getElementByXpath(driver,PaymentConfirmButton);
      action.moveToElement(PaymentConfirm).perform();
      PaymentConfirm.click();
      Thread.sleep(3000);
      System.out.println("Click Final confirm button "); 

      Thread.sleep(6000);
      
      driver.switchTo().defaultContent();
      driver.switchTo().frame(driverframe);
      // Click on PayNow button to complete the payment of policy PayNowbtn               
      WebElement PayNow= getElementByXpath(driver,PayNowbtn);
      action.moveToElement(PayNow).perform();
      PayNow.click();
      Thread.sleep(5000);
      System.out.println("Click Paynow button "); 
    
      // Verify the page title 
   String Actualpaymentpagetitle =   getElementByXpath(driver,PaymentComplete).getText();
   
   if(Actualpaymentpagetitle.equalsIgnoreCase("Payment complete")) 
   {
       System.out.println("page title is correct>>>> PASS"+Actualpaymentpagetitle); 

   }else {
       System.out.println("page title is not matching >>>> Fail"+Actualpaymentpagetitle); 

   }
		
	}
	
}


