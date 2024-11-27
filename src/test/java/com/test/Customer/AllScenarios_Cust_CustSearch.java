package com.test.Customer;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_Cust_CustSearch;
import com.Pages_LeaveModule.Leave_EWCLeaveRequest;
import com.Pages_LeaveModule.Methods_NBFC_CLS;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;
import org.openqa.selenium.By;

public class AllScenarios_Cust_CustSearch extends Base_Class{
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	PageRepositary_Cust_CustSearch custSearch = new PageRepositary_Cust_CustSearch();	
	TestListener TestListener; 
	com.Utility.ScreenShot screenShot;
	
	
	com.Page_Customer.Customer_CustomerSearch custSrchMthds = new com.Page_Customer.Customer_CustomerSearch();


	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("Customer_CustSearch");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
	}

	@Test(dataProvider = "TestData")
	public void customerSearch(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException {
		
		try {
			if(testdata.get("Run").toString().equalsIgnoreCase("Yes")){
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "Login");

				//TC No. - 02 --> Application launch
				Base_Class.SetUp();
				Thread.sleep(2000);
								
				//PC Registration
				custSrchMthds.pcRegistration(testdata, context);
				
				//TC No. - 04 -->User Login PATH-InValid Password
				custSrchMthds.userLoginInValidPaswrd(testdata, context);

				//TC No. - 03 -->User Login PATH-Valid Password
				custSrchMthds.userLoginValidPaswrd(testdata, context);

				//TC No. - 05 -->Customer Search Window
				Thread.sleep(3000);
				custSrchMthds.customerSearchWindow();
				
				//TC No. - 08 & TC - 13-->Fetch Customer by Mobile No
				custSrchMthds.searchByMobileInvalid1(testdata, context);
				
				custSrchMthds.searchByMobileInvalid2(testdata, context);
				
				custSrchMthds.searchByMobileValid(testdata, context);
				
				//TC No. - 09 -->Fetch Customer by Name
				custSrchMthds.searchByNameNumeric(testdata, context);
				
				custSrchMthds.searchByNameAlpanumeric(testdata, context);
				
				custSrchMthds.searchByValidName(testdata, context);
				
				//TC No. - 11 -->Fetch Customers Without Inputs
				custSrchMthds.searchWithoutInputs();
				
				//TC No. - 12 -->Fetch Customer by Invalid AADHAAR
				custSrchMthds.searchByInvalidAadhaar(testdata, context);
			
				//TC No. - 14 --> Clear Functionality
				custSrchMthds.clearFunctionality(testdata, context);
				
				//TC No. - 15 -->Fetch All Institutions
				custSrchMthds.fetchInstitutions();
				
				//Sign out
				Thread.sleep(5000);
				custSrchMthds.signOut();
				
				// EndTest
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
			}		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

		
		
		
		
		//Fetch Customer by Customer ID
		//NBFC_Methods.searchByCustId();
			
		//Fetch Customer by Parent Or Spouse Name
		//NBFC_Methods.searchByParentOrSpouse();
		
		// EndTest
//		Thread.sleep(5000);
//		ExtentTestManager.endTest();
//		ExtentManager.getInstance().flush();
		//driver.quit();
	}
	
	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}
	
}


