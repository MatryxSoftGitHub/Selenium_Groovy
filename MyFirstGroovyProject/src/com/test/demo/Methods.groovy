package com.test.demo

def printhello() {
	println ("Hello....")
}
printhello()

def sum(int a,int b) {
	println "Sum is " + (a+b)
}
sum(5, 10)

def sum1(int a=10,int b=20) {
	println "Sum is " + (a+b)
}
sum1()

def sub(int a,int b) {
	def c=a-b
	return c
}
sub (10,5)

def sub1(int a,int b) {
	def c = a-b
	return c
}
def result = sub1(10,5)
println "result is " + result