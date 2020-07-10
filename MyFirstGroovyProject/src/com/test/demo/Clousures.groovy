package com.test.demo

def myclousure1 = {println "Hello World"}
myclousure1.call()

def myclousure2 = {name -> println "Hello ${name}"}
myclousure2.call("Matryxsoft")

def str = "Hello"
def myclousure3 = {name -> println "$str $name"}
myclousure3.call("Boss")

def mymethod(clos) {
	clos.call("groovy")
}
mymethod(myclousure2)

def myclousure4= {
	a,b,c ->
	return(a+b+c)
}
def res = myclousure4(10,20,30)
println res

def myList=["apple","orange","graphes"]
println myList.each { it }

def mymap = ['Subject': 'groovy',
			 'topic': 'closures']
println mymap.each { it }

def mylist = [1,2,3,4,5]
println mylist.find{item -> item ==3}
println mylist.findAll{item -> item>3}
println mylist.any{item -> item>5}
println mylist.every{item -> item>3}
println mylist.collect{item -> item *2}
