package Selenium;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ParameterFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("D:\\Nita\\Sheet1.xlsx");
		
		//String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();//data should be charactors
		
		double data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();//have to add numeric data in sheet
		
		
		
		System.out.println(data);
		
		//WebDriver driver=new ChromeDriver();
		
		

	}

}
