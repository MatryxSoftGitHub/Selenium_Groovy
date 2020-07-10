package com.test.demo

def fruits = ["Apple","Orange","Grapes"]
println fruits[1]
println fruits.get(2)

def mylist=[1,2,3,['A','B',"Groovy"],4]
println mylist[2]
println mylist[3][1]
println mylist.get(3).get(2)
println mylist[0..2]
println mylist[4..2]
println mylist.contains(2)
println mylist.contains("Groovy")
println mylist[3].contains("Groovy")
println mylist.size()
mylist.add(10)
println mylist
mylist<<20
println mylist
mylist.add(2,22)
println mylist
mylist.remove(2)
println mylist
mylist=mylist+[30,40]
println mylist
mylist=mylist.plus([50])
println mylist
mylist=mylist - [30,40]
println mylist
mylist = mylist.minus([50])
println mylist
mylist.pop()
println mylist
mylist.removeLast()
println mylist
println mylist.intersect([1,2,3,4])
mylist = mylist.reverse()
mylist = mylist.sort()
println mylist
println mylist.clear()
println mylist.isEmpty()
	

	
