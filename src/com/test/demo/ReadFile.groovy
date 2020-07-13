package com.test.demo
//
///** reading file **/
//
//String filepath = "E:/Eclipse_Workspace/MyFirstGroovyProject/data1.txt"
//File myFile = new File(filepath)
//
////reading entire content as string
//println myFile.text
//
////Collect lines into a list
//def list =myFile.collect(){ it }
//println "list : $list"
//
////store lines content in a array
//def array =myFile as String[]
//println "array : $array"
//
////read file in a list of string
//
//def lines = myFile.readLines()
//println "lines : $lines"
//
////read file line by line
//myFile.eachLine {line ->
//	println "line : $line"
//}
//
////read file line by line with line no
//myFile.eachLine {line, lineno ->
//	println "$lineno : $line"
//}
////-----------------------------------
//def lineNoRange = 2..4
//def linelist = []
//myFile.eachLine { line, linenum ->
//	if (lineNoRange.contains(linenum)) 
//	   linelist.add(line)
//}
//println "linelist = $linelist"
//
//
////read with reader
//def line
//myFile.withReader { reader ->
//	while((line = reader.readLine()) != null) {
//		println "line = $line"
//	}		
//}
//
////reading with new reader
//def outputFile = "data2.txt"
//def reader = myFile.newReader()
//new File(outputFile).append(reader)
//reader.close()
//
////when working with a binary files,read content as bytes
//byte[] content = myFile.bytes
//println content
//
////size in bytes
//println myFile.length()
//
////check if is a file or dir
//println myFile.isFile()
//println myFile.isDirectory()
//
////get list of files in a dir
//new File("E:/Docs/Ranorex docs").eachFile{
//	files -> println files.getAbsolutePath()	
//} 
//
////recursively display all files in dir and sub-dir
//new File("E:/Docs/Ranorex docs").eachFileRecurse{
//	file -> println file.getAbsolutePath()
//}
// 
////copy file data to another file
//def newFile = new File("data3.txt")
//newFile << myFile.text
//
////delete file
//newFile.delete()
