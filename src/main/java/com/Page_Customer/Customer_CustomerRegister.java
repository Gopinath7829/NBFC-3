package com.Page_Customer;

import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_Cust_CustRegister;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Customer_CustomerRegister extends Base_Class{
	PageRepositary_Cust_CustRegister custRgstr = new PageRepositary_Cust_CustRegister();
	
	//Customer Register Window
	public boolean customerRegisterWindow() throws InterruptedException {
		click(custRgstr.cust);
		click(custRgstr.custRegister);Thread.sleep(1000);
		boolean flag1 = ElementDisplayed(custRgstr.custLoanChkBox);
		boolean flag2 = ElementDisplayed(custRgstr.custViewBtn);
		boolean flag3 = ElementDisplayed(custRgstr.custIDTxtBox);
		boolean flag = flag1 & flag2 & flag3;
		Thread.sleep(1000);
		if(flag == true) {
			ExtentTestManager.getTest().log(Status.PASS, "Customer Register Window loaded Successfully!");
			Log.info("Customer Register Window loaded Successfully!");
		}
		return true;
	}
	
	//Customer ID Field Required, validation
	public boolean srchWithoutCustId() throws InterruptedException {
		click(custRgstr.custRegister);
		click(custRgstr.custViewBtn);Thread.sleep(1000);
		boolean flag1 = ElementDisplayed(custRgstr.errMsg1);
		if(flag1 == true) {
			ExtentTestManager.getTest().log(Status.PASS, "\"Please Fill the Required Details\" is displayed when clicked on \"View button\" without entering CustId");
			Log.info("\"Please Fill the Required Details \" is displayed when clicked on \"View button\" without entering CustId");
		}Thread.sleep(1000);
		click(custRgstr.errMsgOkBtn1);
		return true;
	}
	
	//Customer Register - Validation for parameters 
	public boolean testAllParametersPresent() {
		boolean flag1 = ElementDisplayed(custRgstr.custShareChkBox);
		boolean flag2 = ElementDisplayed(custRgstr.custLoanChkBox);
		boolean flag3 = ElementDisplayed(custRgstr.custDebentureChkBox);
		boolean flag4 = ElementDisplayed(custRgstr.custDepositsChkBox);
		boolean flag5 = ElementDisplayed(custRgstr.custGeneralChkBox);
		boolean flag6 = ElementDisplayed(custRgstr.custInstSharesChkBox);
		boolean flag7 = ElementDisplayed(custRgstr.custInsuranceChkBox);
		boolean flag8 = ElementDisplayed(custRgstr.custOtherChargeChkBox);
		boolean flag9 = ElementDisplayed(custRgstr.custFullOverDueChkBox);
		boolean flag10 = ElementDisplayed(custRgstr.custCloseChkBox);
		boolean flag11 = ElementDisplayed(custRgstr.custDirectChkBox);
		boolean flag12 = ElementDisplayed(custRgstr.custInDirectChkBox);
		boolean flag = flag1 & flag2 & flag3 & flag4 & flag5 & flag6 & flag7 & flag8 & flag9 & flag10 & flag11 & flag12;
		if(flag == true) { 
			ExtentTestManager.getTest().log(Status.PASS, "All parameters present");
			Log.info("All parameters present");
		}return true;
	}
	
	//Customer ID BVA
	public boolean searchByMobileInvalid1(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		//MIN-1 & MAX-1
		
		String invalidCustId1 = testdata.get("invalidCustId1").toString();
		input(custRgstr.custIDTxtBox, invalidCustId1);
		click(custRgstr.custViewBtn);
				boolean flag = ElementDisplayed(custRgstr.errMsg1);
				if(flag == true) {
					ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Customer ID(< 12 digits)" );
					 Log.info("Error message displayed for incorrect Customer ID(< 12 digits)");
				}					
				Thread.sleep(1000);
				click(custRgstr.errMsgOkBtn2);Thread.sleep(1000);
				clear(custRgstr.custIDTxtBox);
				return true;
	}
	
//	public boolean searchByMobileInvalid2(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
//		//MIN+1 & MAX+1
//		
//		String invalidCustId2 = testdata.get("invalidCustId2").toString();
//		input(custRgstr.custIDTxtBox, invalidCustId2);
//		click(custRgstr.custViewBtn);
//				boolean flag = ElementDisplayed(custRgstr.errMsg1);
//				if(flag == true) {
//					ExtentTestManager.getTest().log(Status.PASS, "Error message displayed for incorrect Customer ID(> 12 digits)" );
//					 Log.info("Error message displayed for incorrect Customer ID(> 12 digits)");
//				}					
//				Thread.sleep(1000);
//				click(custRgstr.errMsgOkBtn2);Thread.sleep(1000);
//				clear(custRgstr.custIDTxtBox);
//				return true;
//	}
	
	public boolean viewByValidCustId(Map<Object, Object> testdata, ITestContext context) throws ClassNotFoundException, InterruptedException, IOException  {
		//MIN & MAX Value
		String validCustId = testdata.get("validCustId").toString();
		input(custRgstr.custIDTxtBox, validCustId);
		click(custRgstr.custViewBtn);
		Thread.sleep(1000);
		boolean flag = ElementDisplayed(custRgstr.custGridItem);
		if(flag == true) {
			ExtentTestManager.getTest().log(Status.PASS, "Customer Fetched Using Valid Customer ID, Successfully");
			Log.info("Customer Fetched Using Valid Customer ID, Successfully");
		}
		click(custRgstr.custCancelBtn);
return true;
}
	
	
	
}
