package chandruJavaTraining;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./Test_Data/Login_TestData.xlsx";//Locate the file
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); //Locate the workbook
		XSSFSheet sheet=wbook.getSheetAt(0); //get the first sheet & sheet is an object
		for (int i = 1; i <=5; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <2; j++) {
				
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		wbook.close();
		
	}

}
