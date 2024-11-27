package com.Pages_TimesheetModule;

import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepositary_TimeSheetModule;



public class TimeSheet_ListModule extends Base_Class
{
		PageRepositary_TimeSheetModule PageRepositary= new PageRepositary_TimeSheetModule();
		
		 public boolean isTimesheetSectionDisplayed() 
		 {
			 boolean flag1 = ElementDisplayed(PageRepositary.timesheetSection);
		        return  flag1;
		 }
		 
		 public boolean clickTimesheetSection() throws InterruptedException {
			 click(PageRepositary.timesheetSection);
		        Thread.sleep(3000);
		       click(PageRepositary.myTimeSheetSection);
		        return true;
		    }
		 
		 public boolean isPageLoaded() {
		      boolean flag1= ElementDisplayed(PageRepositary.dayViewOption);
		      return  flag1;
		    }
		
		    public boolean areViewOptionsDisplayed() {
		    	boolean flag1= ElementDisplayed(PageRepositary.dayViewOption);
		    	boolean flag2= ElementDisplayed(PageRepositary.weekViewOption);
		    	boolean flag3= ElementDisplayed(PageRepositary.monthViewOption);
		    	boolean flag= flag1 & flag2 & flag3;
		    	return flag;
		    	
		    }
		    
		    public boolean isCreateNewEntryButtonDisplayed() {
		    	boolean flag1= ElementDisplayed(PageRepositary.createNewEntryButton);
				return flag1;
		    }

		    public boolean isBulkUploadButtonDisplayed() {
		    	boolean flag1= ElementDisplayed(PageRepositary.bulkUploadButton);
				return flag1;
		    }

		    public boolean isDownloadTimesheetButtonDisplayed() {
		    	boolean flag1= ElementDisplayed(PageRepositary.downloadTimesheetButton);
				return flag1;
		    }

		    public boolean isApplyLeaveButtonDisplayed() {
		    	boolean flag1= ElementDisplayed(PageRepositary.applyLeaveButton);
				return flag1;
		    }

		    public boolean clickWeekViewOption() throws InterruptedException {
		        click(PageRepositary.weekViewOption);
				return true;
		    }

		    public boolean clickMonthViewOption() throws InterruptedException {
		        click(PageRepositary.monthViewOption);
				return false;
		    }
		 

		
}
