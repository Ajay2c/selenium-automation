package amazonScripts;

import java.io.File;
import java.io.FileInputStream;

import javax.sql.RowSet;

import jxl.Sheet;
import jxl.Workbook;

public class orderAproduct {

	FileInputStream excel = new FileInputStream(null);
	Workbook workbook = Workbook.getWorkbook(null);
	Sheet sheets = workbook.getSheet(0);
	
	int rowcount = sheets.getRows();
	int rowcount = sheets.getColumn(0);
	
	
	
}
