package com.Page_Customer;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_Cust_CustSearch;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Customer_CustomerSearch extends Base_Class{
	Log log= new Log();
	PageRepositary_Cust_CustSearch custSearch = new PageRepositary_Cust_CustSearch();		
	com.Utility.ExcelReader ExcelReader = new com.Utility.ExcelReader("Customer_CustSearch");
	Base_Class Base_Class= new Base_Class();
	
	
	public boolean pcRegistration(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
		String pcRegFormName = testdata.get("pcRegFormName").toString();
		input(custSearch.formName, pcRegFormName);
		String pcRegFormPcName = testdata.get("pcRegFormPcName").toString();	
		input(custSearch.formComputerName, pcRegFormPcName);
		click(custSearch.formBranchName);
		click(custSearch.formSubmitBtn);
		ExtentTestManager.getTest().log(Status.PASS, "PC Registered Successfully!");
		Log.info("PC Registered Successfully!");
		//DB Connection
			com.BasePackage.Base_Class.DatabaseConnector();
			driver.navigate().refresh();

		return true;
	}
	
	public boolean userLoginInValidPaswrd(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		String loginUserName = testdata.get("loginUserName").toString();
		input(custSearch.loginUserName, loginUserName);
		String loginInValidPassword = testdata.get("loginInValidPassword").toString();
		input(custSearch.loginPasswrd, loginInValidPassword);
		click(custSearch.loginButton);
		Thread.sleep(2000);
		boolean flag1 = ElementDisplayed(custSearch.invalidPaswrdErrMsg);
		boolean flag = flag1;
		if(flag == true) {
			ExtentTestManager.getTest().log(Status.PASS, "User Login - Invalid Password --> PASS, User Login Failed");
			Log.info("Invalid Password, Validated Successfully!");
		}
		clear(custSearch.loginUserName);
		return true;
	}
	
	public boolean userLoginValidPaswrd(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		String loginUserName = testdata.get("loginUserName").toString();
		input(custSearch.loginUserName, loginUserName);
		String loginValidPassword = testdata.get("loginValidPassword").toString();
		input(custSearch.loginPasswrd, loginValidPassword);
		click(custSearch.loginButton);
		Thread.sleep(2000);
		boolean flag1 = ElementDisplayed(custSearch.home);
		boolean flag = flag1;
		if(flag==true){
			ExtentTestManager.getTest().log(Status.PASS, "User Login - Valid Password --> PASS, User Login Success");
			Log.info("Valid Password, Validated Successfully!");
		}		
		return true;
	}
	
	public boolean customerSearchWindow() throws InterruptedException {
		click(custSearch.cust);
		click(custSearch.custSrch);
		Thread.sleep(1000);
		boolean flag1 = ElementDisplayed(custSearch.custId);
		boolean flag2 = ElementDisplayed(custSearch.custMobile);
		boolean flag3 = ElementDisplayed(custSearch.custId);
		boolean flag = flag1 & flag2 & flag3;
		if(flag == true) {
			ExtentTestManager.getTest().log(Status.PASS, "Customer Search Window loaded Successfully!");
			Log.info("Customer Search Window loaded Successfully!");
		}

		return true;
	}
	
	public boolean searchByInvalidAadhaar(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		//click(NBFC_Locators.custSrch);
		
				//AADHAAR No < 12 digits.
				//input(custSearch.custAadhaar, "98765432");
		String invalidAadhaar = testdata.get("invalidAadhaar").toString();
		input(custSearch.custAadhaar, invalidAadhaar);
				click(custSearch.custSearchBtn);
				Thread.sleep(1000);
				boolean flag1 = ElementDisplayed(custSearch.custErrorMsg);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Aadhaar(< 12 digits)");
					Log.info("Error message displayed for incorrect Aadhaar(< 12 digits)");
				}						
				click(custSearch.custClearBtn);
		return true;
	}
	
	public boolean searchByMobileInvalid1(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		//click(NBFC_Locators.custSrch);
		
		String invalidMobileNum1 = testdata.get("invalidMobileNum1").toString();
		input(custSearch.custMobile, invalidMobileNum1);
				click(custSearch.custSearchBtn);
				boolean flag1 = ElementDisplayed(custSearch.custErrorMsg);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Mobile NO.(< 10 digits)" );
					 Log.info("Error message displayed for incorrect Mobile NO.(< 10 digits)");
				}					
				Thread.sleep(1000);
				click(custSearch.custClearBtn);
				return true;
	}
	
	public boolean searchByMobileInvalid2(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		String invalidMobileNum2 = testdata.get("invalidMobileNum2").toString();
		input(custSearch.custMobile, invalidMobileNum2);
		click(custSearch.custSearchBtn);
		boolean flag1 = ElementDisplayed(custSearch.custErrorMsg);
		boolean flag = flag1;
		if(flag == true) {
			ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Mobile NO.(> 10 digits)" );
			 Log.info("Error message displayed for incorrect Mobile NO.(> 10 digits)");
		}					
		Thread.sleep(1000);
		click(custSearch.custClearBtn);
		return true;
		}
	
	public boolean searchByMobileValid(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
				//MIN & MAX Value (Positive Scenario)
		String validMobileNum = testdata.get("validMobileNum").toString();
		input(custSearch.custMobile, validMobileNum);
				click(custSearch.custSearchBtn);
				Thread.sleep(1000);
				boolean flag1 = ElementDisplayed(custSearch.custGridItem);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Customer Fetched Using Valid Mobile No., Successfully");
					Log.info("Fetched Customer with Valid Mobile No., Successfully!");
				}
				click(custSearch.custClearBtn);
		return true;
		}
	
	public boolean searchByNameNumeric(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
				
				//Search By Name --> Numeric Input
		String nameNumeric = testdata.get("nameNumeric").toString();
		input(custSearch.custName, nameNumeric);

				click(custSearch.custSearchBtn);
				Thread.sleep(1000);
				boolean flag1 = ElementDisplayed(custSearch.custErrorMsg);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Name (Numeric)");
					 Log.info("Error message displayed for incorrect Name (Numeric)");
				}
				click(custSearch.custClearBtn);					
				return true;
	}
public boolean searchByNameAlpanumeric(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
	//Search By Name --> Alphanumeric Input
	String nameAlphanumeric = testdata.get("nameAlphanumeric").toString();
	input(custSearch.custName, nameAlphanumeric);
	click(custSearch.custSearchBtn);
	Thread.sleep(1000);
	boolean flag1 = ElementDisplayed(custSearch.custErrorMsg);
	boolean flag = flag1;
	if(flag == true) {
		ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Name (Alphanumeric)");
		 Log.info("Error message displayed for incorrect Name (Alphanumeric)");
	}
	click(custSearch.custClearBtn);
	return true;
}

public boolean searchByValidName(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
				//Search By Name --> Alphabet Input
				String validName = testdata.get("validName").toString();				
				input(custSearch.custName, validName);
				click(custSearch.custSearchBtn);
				Thread.sleep(1000);
				boolean flag1 = ElementDisplayed(custSearch.custGridItem);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Customer Fetched Using Name, Successfully");
					Log.info("Fetched Customer with Valid Name, Successfully!");
				}
				click(custSearch.custClearBtn);
	return true;
	}
	
//	public boolean searchByParentOrSpouse() throws InterruptedException{
//		
//				//Search By Parent Or Spouse Name --> Numeric Input
//				click(custSearch.custClearBtn);
//				click(custSearch.custParentSpouse);
//				input(custSearch.custParentSpouse, "1234567890");
//				click(custSearch.custSearchBtn);
//				Thread.sleep(1000);
//				if(ElementDisplayed(custSearch.custErrorPopMsg)) {
//					ExtentTestManager.getTest().log(Status.PASS, "Valid ERROR Msg Disaplyed --> No Data Found.....!");
//					 Log.info("Valid ERROR Msg Disaplyed --> No Data Found.....!");
//					click(custSearch.custErrorPopMsgClose);
//				}
////				if(driver.findElement(NBFC_Locators.custErrorMsg).isDisplayed()) {
////					System.out.println(driver.findElement(NBFC_Locators.custErrorMsg).getText() + " --> Valid ERROR Message is Displayed." );
////				}
//				
//				//Search By Parent Or Spouse Name --> Alphanumeric Input
//				click(custSearch.custClearBtn);
//				input(custSearch.custParentSpouse, "ABCD12345");
//				click(custSearch.custSearchBtn);
//				if(ElementDisplayed(custSearch.custErrorPopMsg)) {
//					ExtentTestManager.getTest().log(Status.PASS, "Valid ERROR Msg Disaplyed --> No Data Found.....!");
//					 Log.info("Valid ERROR Msg Disaplyed --> No Data Found.....!");
//					click(custSearch.custErrorPopMsgClose);
//				}
////				if(driver.findElement(NBFC_Locators.custErrorMsg).isDisplayed()) {
////					System.out.println(driver.findElement(NBFC_Locators.custErrorMsg).getText() + " --> Valid ERROR Message is Displayed." );
////				}
//				Thread.sleep(2000);
//				
//				//Search By Parent Or Spouse Name --> Alphabet Input
//				click(custSearch.custClearBtn);
//				input(custSearch.custParentSpouse, "JAYA PRASAD");
//				click(custSearch.custSearchBtn);
//
//		return true;
//	}
	
	public boolean searchWithoutInputs() throws InterruptedException {
				click(custSearch.custClearBtn);
				click(custSearch.custSearchBtn);
				Thread.sleep(1000);
				boolean flag1 = ElementDisplayed(custSearch.custGridItem);
				boolean flag = flag1;
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "All Availabe customer details displayed, Successfully!");
					Log.info("All Availabe customer details displayed, Successfully!");
				}
						return true;
	}
	
	public boolean clearFunctionality(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
		String validName = testdata.get("validName").toString();				
		input(custSearch.custName, validName);
		String validMobileNum = testdata.get("validMobileNum").toString();
		input(custSearch.custMobile, validMobileNum);
		String invalidAadhaar = testdata.get("invalidAadhaar").toString();
		input(custSearch.custAadhaar, invalidAadhaar);
				click(custSearch.custClearBtn);
				ExtentTestManager.getTest().log(Status.PASS, "All Inputs Cleared., Successfully!");
				Log.info("All Inputs Cleared., Successfully!");
				Thread.sleep(2000);
		return true;
	}
	
	public boolean fetchInstitutions() throws InterruptedException {
				click(custSearch.custClearBtn);
				click(custSearch.custKYCCompliantOnly);
				click(custSearch.custActiveOnly);
				click(custSearch.custProspectsOnly);
				click(custSearch.custIsInstitutional);
				click(custSearch.custSearchBtn);Thread.sleep(2000);
				try {
//					boolean tableDisplayed = ElementDisplayed(NBFC_Locators.custTable);
					if(ElementDisplayed(custSearch.custTable)) {
						ExtentTestManager.getTest().log(Status.PASS, "Successfully Fetched Institutional Customers in the Grid");
						Log.info("Successfully Fetched Institutional Customers in the Grid");
						}
				}
				catch(Exception e1)
				{
					ExtentTestManager.getTest().log(Status.PASS, "Failed to Fetch Institutional Customers in the Grid");
					Log.info("Failed to Fetch Institutional Customers in the Grid");
				}
				
		return true;
	}
	
	public boolean signOut() throws InterruptedException {
		click(custSearch.custSignOut);
		ExtentTestManager.getTest().log(Status.PASS, "User SignedOut");
		Log.info("User SignedOut");
		return true;
	}
}

