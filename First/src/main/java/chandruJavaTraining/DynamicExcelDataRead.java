package chandruJavaTraining;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicExcelDataRead {

	public static void main(String[] args) throws IOException {
		
		String fileLocation = "./Dynamic_TestData/Dynamic_TestData.xlsx";//Locate the file
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation); //Locate the workbook
		XSSFSheet sheet=wbook.getSheetAt(0); //get the first sheet & sheet is an object
		int lastrownum=sheet.getLastRowNum();
		int PhysicalNumberOfRows= sheet.getPhysicalNumberOfRows();
		System.out.println("Included Header:"+PhysicalNumberOfRows);
		System.out.println("No of rows:"+lastrownum);
		short getLastCellNum= sheet.getRow(0).getLastCellNum();
		System.out.println("No of cells:"+getLastCellNum);

		
		for (int i = 1; i <=lastrownum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <getLastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft=new DataFormatter();
				String value=dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		wbook.close();
	}

}
