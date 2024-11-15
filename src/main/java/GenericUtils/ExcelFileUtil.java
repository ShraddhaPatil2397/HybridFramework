package GenericUtils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil {
public String readDataFromExcel(String sheetName,int rowNum,int cellNum)throws Throwable{
FileInputStream fise= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\HYBRID_FRAMEWORK\\src\\test\\resources\\HYBRIDFWXL.xlsx");
 Workbook wb=WorkbookFactory.create(fise);
 return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
 
}
}

