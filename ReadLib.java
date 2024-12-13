package week5.homeassignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLib {

	public static String[][] readValue() throws IOException {
		// TODO Auto-generated method stub
		
		//set path for workbook
				XSSFWorkbook wb = new XSSFWorkbook("./excelData/LegalEntity.xlsx");
				
				//Get into Sheet
				//index value -getSheetAt(0)
				//Sheet Name -getSheet("Sheet1")
				XSSFSheet sheet = wb.getSheetAt(0);
				
				//Get into row
				int rowCount = sheet.getLastRowNum();
				System.out.println("Row Count is :"+rowCount);

				//step get into col == cell
				short cellCount = sheet.getRow(1).getLastCellNum();
				System.out.println("Cell count is :"+cellCount);
		
				
				int rowCount1 = 0;
				int cellCount1 = 0;
				String[][] data = new String[rowCount1][cellCount1];
				for (int i = 1; i <= rowCount1; i++) {
					for (int j = 0; j < cellCount1; j++) {
						String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
						data[i-1][j]=stringCellValue;
					}
				}
				wb.close();
				return data;

		
	}
				
				//step -6
				//wb.close();

	}


