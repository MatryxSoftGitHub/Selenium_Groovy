package Excel
import org.codehaus.groovy.scriptom.*
import org.codehaus.groovy.scriptom.tlb.office.excel.*
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.*;
import jxl.*
import jxl.write.*



class Demo {
	public static void main(String[] args) {
		readExcel()
	}
	static def readExcel() {
		Workbook workbook1 = Workbook.getWorkbook(new File("E:\\Eclipse_Workspace\\MyFirstGroovyProject\\ExcelFile\\Sample.xls"))
		Sheet sheet1 = workbook1.getSheet(0)

		//get row count
		int totalRows = sheet1.getRows()
		//println totalRows

		//get column count
		int totalColumn = sheet1.getColumns()
		//println totalColumn
		def v = workbook1.getSheet(0).getCell(1,5).getContents()
		println v
		//get cell values
		for(int r = 1;r<totalRows;r++){
			for(int c = 1;c<totalColumn;c++){
				def cValue = sheet1.getCell(c,r).getContents()
				//println cValue
			}
		}
		//get specific row values
		def lsRows = [1, 27, 90]
		for(int exp = 0; exp<lsRows.size(); exp++) {
			for(int r = 1;r<totalRows;r++){
				if (lsRows[exp]==r) {
					for(int c = 1;c<totalColumn;c++){
						def sValue = sheet1.getCell(c,r).getContents()
						// println sValue
					}
				}

			}
		}

		//get header names from excel
		for(int c = 1;c<totalColumn;c++){
			def hNames = sheet1.getCell(c,0).getContents()
			//println hNames
		}

		//get specific column values
		def lsExpectedColVal = [2, 4]
		for(int r = 1;r<totalRows;r++){
			for(int expc = 0; expc<=lsExpectedColVal.size(); expc++) {
				for(int c = 1;c<totalColumn;c++){
					if (lsExpectedColVal[expc]==c ){
						def sValue = sheet1.getCell(c,r).getContents()
						//println sValue

					}
				}
			}
		}


		// get specific cell value
		def lsExpectedColVal1 = ["1562", "32", "Male"]
		def lsRows1 = [1, 27, 90]
		for(int exp = 0; exp<lsRows1.size(); exp++) {
			for(int r = 1;r<totalRows;r++){
				if (lsRows[exp]==r) {
					for(int c = 1;c<totalColumn;c++){
						def sValue = sheet1.getCell(c,r).getContents()
						for(int expc = 0; expc<=lsExpectedColVal.size(); expc++) {
							if (lsExpectedColVal1[expc]==sValue ){
								//println sValue
							}
						}
					}

				}
			}
		}

		workbook1.close()
	}
}