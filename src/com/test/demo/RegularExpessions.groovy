package com.test.demo

def match = "Groovy" =~ "Groovy"
println match[0]

def match1 = "Groovy" =~ "123"

if (match1) {
    println match1[0]
}else
	println "No Match"
	
def match2 = "Groovy" =~ "o"
if (match2) {
	def i = 0
	while(match2) {
	 println match2[i]
	 i++
	}
}else
	println "No Match"
	
def regex = /(?:[^Groovy]*)/	
def match3 = "This is Groovy" =~ regex
if (match3) {
	def i = 0
	while(match3) {
	 println match3[i]
	 i++
	}
}else
	println "No Match"