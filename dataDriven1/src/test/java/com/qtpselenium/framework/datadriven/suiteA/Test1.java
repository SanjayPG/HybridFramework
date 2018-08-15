package com.qtpselenium.framework.datadriven.suiteA;

import org.testng.annotations.Test;

import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class Test1 {
	
	@Test
	public void test1()
	{
		//Xls_Reader xls=new Xls_Reader("E:\\DataDrivenSheets\\Suite.xlsx");
		//System.out.println(Utility.isSuiteRunnable("SuiteA",xls));
		
		Xls_Reader xls=new Xls_Reader("E:\\DataDrivenSheets\\SuiteA.xlsx");
		System.out.println(Utility.isTestCasesRunnable("TestCase1",xls));			
	}
	
}

