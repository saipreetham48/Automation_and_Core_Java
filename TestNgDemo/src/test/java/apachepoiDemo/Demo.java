package apachepoiDemo;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("FirstSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("cake");
		sheet.getRow(0).createCell(1).setCellValue("mukka");
		sheet.getRow(0).createCell(2).setCellValue("kavala");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("big");
		sheet.getRow(1).createCell(1).setCellValue("boss");
		sheet.getRow(1).createCell(2).setCellValue("season");
		sheet.getRow(0).createCell(3).setCellValue("nayana");
		
		File file=new File("D:\\Java\\TestNgDemo\\excelFiles\\test.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		
	}
	
	

}
