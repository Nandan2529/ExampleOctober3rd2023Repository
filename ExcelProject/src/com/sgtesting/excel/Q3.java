package com.sgtesting.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3 {
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

				for (int i=0;i<12;i++)
				{
					row =sh.createRow(i+0);
					cell=row.createCell(i);
					cell.setCellValue("Month"+i);
				}
				fout=new FileOutputStream("D:\\Excel\\Month.xlsx");
				wb.write(fout);

			} catch(Exception e)
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
