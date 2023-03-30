package com.HealthCare.GetOmnify.Test.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * @author Nihal Dhole
 *
 */

public class FileUtilities {
	public static Connection con;
	/**
	 * To read the data from PropertyFile
	 * @param Key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public String getPropertyFile(String Key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.datapropertyfile));
		return p.getProperty(Key);
	}
	/**
	 * To read the data from ExcelSheet
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getExcelFile(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(AutoConstant.excelfilepath);
		 Workbook wb = WorkbookFactory.create(fis);
		 return wb.getSheet("SheetName").getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	public static Connection getDataDb() throws SQLException {
	Driver driverref = new Driver();
	DriverManager.registerDriver(driverref);
	   return con = DriverManager.getConnection("url");
	
	
	}
	public static String queryExecution(String query,int column,String expdata) throws SQLException {
		Statement statement = con.createStatement();
		ResultSet result= statement.executeQuery(query);
		while(result.next()) {
			if(result.getString(column).equals(expdata)){
				break;
			}
			else {
				Reporter.log("data not matching");
			}
		}
		return expdata;
	}
	
	
		
	}

