package com.sgtesting.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Qa5 {
	public static void main(String[] args) {
		writecontent();
	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet();

			for (int i=0;i<20;i++)
			{
				row =sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("Flower"+i);
				cell=row.createCell(1);
				cell.setCellValue("Colour"+i);

			}
			fout=new FileOutputStream("D:\\Excel\\ColourFlower.xlsx");
			wb.write(fout);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
