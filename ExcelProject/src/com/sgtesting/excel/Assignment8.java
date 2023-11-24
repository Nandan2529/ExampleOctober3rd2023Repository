package com.sgtesting.excel;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assignment8 {

	public static void main(String[] args) {
		readWriteContent();
	}

	private static void readWriteContent() {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Row rowsh1=null;
		Cell cellsh1=null;
		try
		{
			fin=new FileInputStream("D:\\Excel\\Student.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellsh1=rowsh1.getCell(c);
					String data =cellsh1.getStringCellValue();
				}
				fout=new FileOutputStream("D:\\Excel\\Studout.xlsx");
				wb.write(fout);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}





