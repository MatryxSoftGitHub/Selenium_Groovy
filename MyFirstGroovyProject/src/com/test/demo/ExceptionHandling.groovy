package com.test.demo

try {
	int i=1/10
}catch(Exception exp) {
	println " i am inside exception block"
	println exp.getCause()
	println exp.getMessage()
}finally {
	println "I am inside finally block"
}