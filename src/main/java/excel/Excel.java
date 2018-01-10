package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel 
{
	public static String folderpath="F:\\mindQ\\Datas\\";
	
	public static Workbook wb;
	public static Sheet sh;
	public static WritableWorkbook wwb;
	public static WritableSheet wsh;
	
	
	public static void excel_connection(String filename, String sheetname)
	{
		try {
			File f=new File(folderpath+filename);
			
			 wb= Workbook.getWorkbook(f);
			
			sh=wb.getSheet(sheetname);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
	}
	
	public static int rowcount()
	{
		return sh.getRows();
	}
	
	public static int colcount()
	{
		return sh.getColumns();
	}
	
	public static String readdata(int col, int row)
	{
		return sh.getCell(col, row).getContents();
	}
	
	public static void ouput_excel_connection(String ifilename, String sheetname, String ofilename)
	{
		
		
		try {
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
			
			wb= Workbook.getWorkbook(fis);
			
			sh=wb.getSheet(sheetname);
			
			FileOutputStream fos= new FileOutputStream(folderpath+ofilename);
			
			wwb=Workbook.createWorkbook(fos	, wb);
			
			wsh=wwb.getSheet(sheetname);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	public static void writedata(int col, int row, String data)
	{
		try {
			Label l=new Label(col, row, data);
			
			wsh.addCell(l);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void saveworkbook()
	{
		try {
			wwb.write();
			
			wwb.close();
			
			wb.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	
	
}
