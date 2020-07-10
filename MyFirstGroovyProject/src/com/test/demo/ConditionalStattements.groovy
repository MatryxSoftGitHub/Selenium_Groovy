package com.test.demo

def num = 10

if (num == 10) {
	println "num is 10"
	}
	
	
//Check num is +ve or _ve
	
def num1 = 11

if (num1 > 0) 
   println "num is +ve"
else
	println "num is -ve"
	
def num2 = 0

if (num2>0)
	println "num is +ve"
else if (num2==0)
	println "num is zero"
else
	println "num is -ve"
	
	
//switch case
	
def x= -10
def result = ""

switch(x) {
	case 0:
	   result = "x is zero"
	   break
	case{x>0}:
	   result = "x is +ve"
	   break
	case{x<0}:
	   result = "x is -ve"
	   break
	default:
	   result = " invalid number"
}
println result
	
	

