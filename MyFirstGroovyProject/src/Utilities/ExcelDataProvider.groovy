package Utilities

import org.codehaus.groovy.scriptom.*
import org.codehaus.groovy.scriptom.tlb.office.excel.*
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.*;
import jxl.*
import jxl.write.*


public class ExcelDataProvider {
	
	
//	public static void main(String[] args) {
//		println(readExcel(0,1))
//	}
	

	static def readExcel(int Row, int Column) {
		Workbook workbook1 = Workbook.getWorkbook(new File("./ExcelFile/TestData.xls"))
		Sheet sheet1 = workbook1.getSheet(0)

		return sheet1.getCell(Column,Row).getContents()
		//println cValue

	}
	}