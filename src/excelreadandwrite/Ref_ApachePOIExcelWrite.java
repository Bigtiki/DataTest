package excelreadandwrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ref_ApachePOIExcelWrite {
	//AbsolutePath is the long path and Short Path that is the relative path
	
	
	private static final String FILE_NAME = System.getProperty("user.dir")+"/DataTest/Tiki.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data type in Java");
		
		Object[][] datatypes = {
				{"DataType","Type","Size(in bytes)"},
				{"int","Primitive", 2},
				{"Float","Primitive", 4},
				{"double","Primitive", 8},
				{"char","Primitive", 1},
				{"Stringr","Non-Primitive", "No fixed size"}};
		
		int rowNum=0;
		System.out.println("Create Excel");
		
		for(Object[] datatype : datatypes) {
			
			Row row = sheet.createRow(rowNum++);
			int colNum =0;
			for(Object field : datatype) {
				Cell cell=row.createCell(colNum++);
				if(field instanceof String) {
					cell.setCellValue((String) field);}
				else if(field instanceof Integer) {
						cell.setCellValue((Integer) field);
					
				}
			}
		}
		try {
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
