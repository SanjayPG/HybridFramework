package com.qtpselenium.framework.datadriven.util;

public class Utility {
	
	public static boolean isSuiteRunnable(String suiteName,Xls_Reader xls)
	{
		  int rows=xls.getRowCount(Constants.SUITE_SHEET);
		  System.out.println(rows);
		  
		  for(int rNum=2;rNum<=rows;rNum++)
		  {
			  String data=xls.getCellData(Constants.SUITE_SHEET,Constants.SUITENAME_COL,rNum);
			  System.out.println(data);
			  if(data.equals(suiteName))
			  {
				  String runmode=xls.getCellData(Constants.SUITE_SHEET,Constants.RUNMODE_COL,rNum);
				  
				  if(runmode==Constants.RUNMODE_YES)
				  {
					  return true;				  
				  }
				  else
				  {
					  return false;
				  }
			  }
			  
		  }
		 	
		return true;
	}

	public static boolean isTestCasesRunnable(String testcases, Xls_Reader xls)
	{
		      int rows=xls.getRowCount(Constants.TESTCASES_SHEET);
		      System.out.println(rows);
		      
		      for(int rNum=2;rNum<=rows;rNum++)
		      {
		    	  String TestNameXls=xls.getCellData(Constants.TESTCASES_SHEET,Constants.TESTCASES_COL,rNum);
		    	  if(TestNameXls.equalsIgnoreCase(testcases))
		    	  {
                      String runmode=xls.getCellData(Constants.TESTCASES_SHEET,Constants.RUNMODE_COL,rNum);                         
	                  if(runmode.equals(Constants.RUNMODE_YES)) 
	                  {
	                	   return true;
			    	  }
			    	  else
			    	  {
			    		  return false;
			    	  }
		          }
		      }
				   return false;
		
	}

	

	}
	