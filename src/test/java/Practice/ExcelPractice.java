package Practice;

import GenericUtils.ExcelFileUtil;

public class ExcelPractice {
public static void main(String[] args) throws Throwable {

	ExcelFileUtil e=new ExcelFileUtil();
	System.out.println(e.readDataFromExcel("Sheet1", 0, 0));//Wipro
	System.out.println(e.readDataFromExcel("Sheet1", 0, 1));//Accenture
	System.out.println(e.readDataFromExcel("Sheet1", 0, 2));//IBM
	
}
}
