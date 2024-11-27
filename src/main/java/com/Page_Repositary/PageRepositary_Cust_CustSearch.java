package com.Page_Repositary;

import org.openqa.selenium.By;

public class PageRepositary_Cust_CustSearch {
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
	public By invalidPaswrdErrMsg = By.xpath("//*[@id=\"lblErrorMessage\"]");
	public By home = By.xpath("//*[@id=\"ctl00_ctl00_MasterCaption\"]");
	//Customer Search Window
	public By cust = By.xpath("/html/body/form/div[7]/div[1]/div/div/div/div/div/div/div/ul/li[1]/div");
	public By custSrch = By.xpath("/html/body/form/div[7]/div[1]/div/div/div/div/div/div/div/ul/li[1]/ul/li[2]/a");
	public By custId = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtCust_Id_txt\"]");
	public By custAadhaar = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtUniversal_ID\"]");
	public By custMobile = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtMobileNo\"]");
	public By custName = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtFirstName\"]");
	public By custParentSpouse = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtGuardian1_txt\"]");
	public By custSearchBtn = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_btnSearch\"]");
	public By custClearBtn = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_Button1\"]");
	public By custHouseName = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_txtHouseName\"]");
	public By custErrorMsg = By.xpath("//*[@id=\"CustList\"]");
	public By custErrorPopMsgClose = By.xpath("/html/body/form/table[2]/tbody/tr[1]/td[4]/div/img");
	public By custErrorPopMsg = By.xpath("/html/body/form/table[2]/tbody/tr[1]/td[3]");
	public By custIsInstitutional = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_chkIsInstitutional\"]");
	public By custKYCCompliantOnly = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_chkIsCustomerComplaint\"]");
	public By custActiveOnly = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_chkIsActive\"]");
	public By custProspectsOnly = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_chkIsProspects\"]");
	public By custIncludeReject = By.xpath("//*[@id=\"ctl00_ctl00_CPH1_CustContent_ucCustomerSearch_chkIsRejected\"]");
	public By custTable = By.xpath("//*[@id=\"tblCustList\"]");
	public By custGridItem = By.xpath("/html/body/form/div[7]/div[3]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr");
	
	//Signout
	public By custSignOut = By.xpath("/html/body/form/div[3]/div[2]/a[6]/strong");
}
