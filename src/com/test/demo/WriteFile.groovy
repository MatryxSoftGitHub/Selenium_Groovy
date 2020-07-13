package com.test.demo

File myFile = new File("data3.txt")
myFile.write("This is line 1")
myFile << "\nThis is line 2"
//myFile.text = "This is line 3" // text will override

myFile.withWriter { writer ->
	writer.writeLine("This is line 4")// this will also override
}

myFile.append("This is line 5")

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()

def newFile = new File("data4.txt")
newFile << myFile.text

myFile.bytes = []

myFile.renameTo(new File("newFile.txt"))

myFile.delete()