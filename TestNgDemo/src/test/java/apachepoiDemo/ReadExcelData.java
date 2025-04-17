package apachepoiDemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\Java\\TestNgDemo\\excelFiles\\test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
//		String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellvalue);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			int cellcount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue = getcellvalue(cell);
				System.out.print("|" + cellvalue);
			}
			System.out.println();

		}
		workbook.close();
		fis.close();

	}

	public static String getcellvalue(Cell cell) {
		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		case BLANK:
			return "";
		default:
			return cell.getStringCellValue();
		}
	}

}

//		String cellValue = getCellValue(cell);
//		System.out.print("||"+cellValue);
//	}
//	System.out.println();
//}
//
//workbook.close();
//fis.close();
//}
//
