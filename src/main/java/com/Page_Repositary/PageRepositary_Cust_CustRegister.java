package com.Page_Repositary;

import org.openqa.selenium.By;

public class PageRepositary_Cust_CustRegister {
	//PC Registration
	public By formName = By.xpath("//*[@id='Username']");
	public By formBranchName = By.xpath("//select[@id='ddlBranches']/option[text()='TRIVANDRUM']");
	public By formComputerName = By.xpath("//*[@id=\"MacName\"]");
	public By formSubmitBtn = By.xpath("/html/body/div[2]/div[11]/div/button/span");
	
	//Login Module
	public By loginUserName = By.xpath("//*[@id=\"txtUserName_txt\"]");
	public By loginPasswrd = By.xpath("//*[@id=\"txtPassword_txt\"]");
	public By loginButton = By.xpath("//*[@id=\"imgbtnSubmit\"]");
	public By logoutMsg = By.xpath("//*[@id=\"logMessage\"]");
	public By logoutOk = By.xpath("/html/body/div[1]/div/div[2]/div/form/div[11]/div[3]/div/button[1]");

	//Customer Register Window
	public By cust = By.xpath("/html/body/form/div[7]/div[1]/div/div/div/div/div/div/div/ul/li[1]/div");
	public By custRegister = By.xpath("/html/body/form/div[7]/div[1]/div/div/div/div/div/div/div/ul/li[1]/ul/li[5]");
	public By custIDTxtBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_txtCustomerId_txt\"]");
	public By custSrchBtn = By.xpath("/html/body/form/div[7]/div[3]/div/div/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/a/img");
	public By custShareChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_0\"]");
	public By custLoanChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_2\"]");
	public By custDebentureChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_4\"]");
	public By custDepositsChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_1\"]");
	public By custGeneralChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_3\"]");
	public By custInstSharesChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ucProductGroup_5\"]");
	public By custInsuranceChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_chkInsurance\"]");
	public By custOtherChargeChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ChkRecoveries\"]");
	public By custFullOverDueChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ChkfullOD\"]");
	public By custCloseChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_ChkfullOD\"]");
	public By custDirectChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_cblTypes_1\"]");
	public By custInDirectChkBox = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_cblTypes_2\"]");
	public By custViewBtn = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_btnAddCustomer1\"]");
	public By custCancelBtn = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_PRDCNT_LiabilityCustomerSearch1_btnCancel\"]");
	public By custGridItem = By.xpath("/html/body/form/div[7]/div[3]/div/div/div[2]/div/div/div[2]/div[1]/table/tbody/tr[4]/td/div/table/tbody/tr/td/div/div/table/tbody/tr[2]");
	
	//Error Window
	public By errMsg1 = By.xpath("//*[@id=\"ctl00_ctl00_lblErrorMessage\"]");
//	public By errMsg2 = By.xpath("//*[@id=\"ctl00_ctl00_lblErrorMessage\"]");
	public By errMsgOkBtn1 = By.xpath("//*[@id=\"closePleail\"]");
	public By errMsgOkBtn2 = By.xpath("//*[@id=\"closeThiche\"]");

//	//*[@id="closeThiche"]
//	public By variable = By.xpath("");
//	public By variable = By.xpath("");
//	public By variable = By.xpath("");

}
